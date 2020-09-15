import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOf-MemoryError
 *
 * @author xutong
 * @create 2020/7/8
 * @since 1.0.0
 */
public class HeapOOM {
  public static void main(String[] args) {
    ArrayList<OOMObject> list = new ArrayList<>();
    while (true) {
      list.add(new OOMObject());
    }
  }

  static class OOMObject {}
}
