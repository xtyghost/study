package base.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class IpUtils {

    public static final String IPURL = "http://ftp.apnic.net/apnic/stats/apnic/delegated-apnic-latest";


    /**
     * 获取IP Map数据
     */
    public static Map<String, Object> getIpList() {
        // 集合存放Ip第一段
        Map<String, Object> ipMap = new HashMap<>();
        try {
            InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("static/cn-ipv5");
            LineIterator lineIterator = IOUtils.lineIterator(input, StandardCharsets.UTF_8);
            // 读取文件内所有的中国IP
            while (lineIterator.hasNext()) {
                String line = lineIterator.next();
                if (!StringUtils.isEmpty(line)) {
                    JSONObject parentObj = new JSONObject();
                    String[] ips = line.split("\\.");
                    // 得到一个ip地址段的起始范围 101
                    int ip1 = Integer.parseInt(ips[0]);
                    int ip2 = Integer.parseInt(ips[1]);
                    System.out.println("ip1======"+ip1+";;;ip2======"+ip2);
                    /*
                     * 101.80.0.0/20 等于  apnic|CN|ipv4|101.80.0.0|1048576(2的20次方)
                     * 101.96.0.0/11 等于  apnic|CN|ipv4|101.96.0.0|2048(2的11次方)
                     * 类似如此数据，IP网端每个地址数256也就是2的8次方，总共是2的32次方
                     * 所以如果最后一个数值超过 16，意味着后两个网络被占满，前面的网段需要递增
                     * 101.80.0.0/20 中 20 意味着后两个网段已满, 第二个网络端递增 2的(20-16)次方等于16
                     * 101.80.0.0/20 = 以下IP从 80 ~ 95 全网端都是中国IP
                     * 101.80.0.0
                     * 101.81.0.0
                     * 101.82.0.0
                     * ...
                     * 101.95.0.0
                     */
                    // 获取从当前IP段开始的总地址数
                    String[] strs = line.split("\\/");
                    long addressCount = Long.parseLong(strs[1]);
                    // 存储各个网络段
                    JSONObject object = new JSONObject();
                    if (ipMap.get(String.valueOf(ip1)) != null) {
                        object = (JSONObject) ipMap.get(String.valueOf(ip1));
                    }
                    // 判断是否后两个字段被占满

                    if (Math.log(addressCount)/Math.log(2) > 16) {
                        // 后两个字段被占满时，也就是地址数大于 256*256=65536=2的16次方
                        double pow = Math.pow(2, addressCount - 16);
                        for (int i = 0; i < pow; i++) {
                            object.put(String.valueOf(ip2 + i), "all");
                        }
                    } else {
                        /**
                         * apnic CN三个连续数据如下
                         * 101.96.0.0/11
                         * 101.96.8.0/10
                         * 101.96.16.0/12
                         * ---------------------
                         * 如上在第二网段相同的情况
                         * 101.96.0.0/11 等于
                         * 101.96.0.0
                         * ...
                         * 101.96.7.0
                         * 共8个
                         *----------------------
                         * 101.96.8.0/10 等于
                         * 101.96.8.0
                         * ...
                         * 101.96.11.0
                         * 共4个
                         *----------------------
                         * 101.96.16.0/12 等于
                         * 101.96.16.0
                         * ...
                         * 101.96.31.0
                         * 共16个
                         * ---------------------
                         * 从上述数据中看到 101.96.11.0 到 101.96.16.0 出现了断层，中间内容不属于中国的IP
                         * 所以都需要被记录下来，多个IPRange 我们使用数组存储
                         */
                        // 转换IP为long
                        long start_ip = ipv4ToLong(strs[0]);
                        long ip_range = (long) Math.pow(2, addressCount);
                        long end_ip = start_ip + ip_range;
                        String ipRange = start_ip + "-" + end_ip;
                        // 判断是否已存在已有数据
                        JSONArray ipRangeExist = (JSONArray) object.get(String.valueOf(ip2));
                        if (ipRangeExist == null) {
                            ipRangeExist = new JSONArray();
                        }
                        ipRangeExist.add(ipRange);
                        object.put(String.valueOf(ip2), ipRangeExist);
                    }
                    System.out.println(ip1 + "=======" + object);
                    ipMap.put(String.valueOf(ip1), object);
                }
            }
            System.out.println(ipMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ipMap;
    }

    // 求出 IPV4 IP地址所对应的整数，比如 192.168.66.6 对应整数 3232252422
    // 192*256*256*256 + 168*256*256 + 66*256 + 6 = 3232252422
    // IP转换十进制（a.b.c.d）= a*256^3+b*256^2+c*256+d
    public static long ipv4ToLong(String ip) {
        String[] ips = ip.split("\\.");
        long result = 0;
        for (int i = 0; i < ips.length; i++) {
            result += Long.parseLong(ips[i]) * Math.pow(256, 3 - i);
        }
        return result;
    }

    /**
     * 判断IP是不是在中国
     *
     * @param ipMap 中国ip集合
     * @param ip    传入的ip
     * @return true
     */
    public static boolean ipInChina(Map<String, Object> ipMap, String ip) {
        if (ipMap == null) {
            ipMap = getIpList();
        }
        // 判断 IP 是否存在
        if (StringUtils.isEmpty(ip)) {
            return false;
        }
        // 第一个IP端作为key
        String[] ipArr = ip.split("\\.");
        String key = ipArr[0];
        String childKey = ipArr[1];
        // 当前IP转换为整数
        long ip_long = ipv4ToLong(ip);

        // 判断第一个IP端存在
        if (ipMap.containsKey(key)) {
            JSONObject parentObj = (JSONObject) ipMap.get(key);
            // 判断第二个IP段是否存在
            if (parentObj.getString(childKey) != null) {
                String ipRange = parentObj.getString(childKey);
                if (ipRange.equals("all")) {
                    // 整个其余网段都是中国IP
                    return true;
                } else {
                    JSONArray ipRangeArray = JSONArray.parseArray(ipRange);
                    for (Object range : ipRangeArray) {
                        String[] ipRanges = String.valueOf(range).split("\\-");
                        if (ipRanges.length == 2) {
                            long ipRange_start = Long.parseLong(ipRanges[0]);
                            long ipRange_end = Long.parseLong(ipRanges[1]);
                            // 判断是否在范围内
                            return ip_long >= ipRange_start && ip_long <= ipRange_end;
                        }
                    }
                }
            }
        }
        return false;
    }

}