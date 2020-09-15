import java.util.HashSet;

/**
 * 〈一句话功能简述〉<br>
 * 〈 VM Args : -XX:PermSize=6M -XX:MaxPermSize=6M 〉
 *
 * @author xutong
 * @create 2020/7/14
 * @since 1.0.0
 */
public class RuntimeConstantPoolOOm {
  public static void main(String[] args) {
    //
    HashSet<String> set = new HashSet<>();
    short i=0;
    while (true) {
        set.add(String.valueOf(i++).intern());
    }
  }
}
