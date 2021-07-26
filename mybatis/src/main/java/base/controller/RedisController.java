package base.controller;

import base.utils.IpUtils;
import base.utils.RedisUtils;
import com.alibaba.fastjson.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author alex
 */

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisUtils redisUtils;

    /**
     * (耗时1~2S）
     * 获取IP并存入redis, 判断是国内外IP
     *
     * @return
     */
    @GetMapping("ip")
    public void setIp(String ip) {

        // 判断IP判断结果是否在缓存数据中
        Object exist = redisUtils.get(ip);
        JSONObject object = new JSONObject();
        object.put("ip", ip);
        if (exist == null) {
            Map<String, Object> ipData;
            // 从缓存中获取数据
            JSONObject ip_map = (JSONObject) redisUtils.get("ip_map");
            if (ip_map != null) {
                ipData = JSONObject.parseObject(ip_map.toJSONString());
            } else {
                ipData = IpUtils.getIpList();
                redisUtils.set("ip_map", ipData, 2, TimeUnit.HOURS);
            }
            Boolean inChina = IpUtils.ipInChina(ipData, ip);
            object.put("country", inChina ? "CN" : "other");
            redisUtils.set(ip, inChina);

        } else {
            object.put("country", exist.equals(true) ? "CN" : "other");
        }
    }

    public static void main(String[] args) {
        System.out.println(IpUtils.ipInChina(IpUtils.getIpList(), "45.116.32.21"));
    }
}