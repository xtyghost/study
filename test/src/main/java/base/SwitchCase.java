package base;

/**
 * @author xutong
 */
public class SwitchCase {
    public static void main(String[] args) {
        switch ("d") {
            case "1":
                System.out.println("1");
                break;
            case "x":
                System.out.println("x");
                break;
            case "d":
                System.out.println("d");
                break;
            default:
                break;
        }
    }
}
