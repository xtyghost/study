/**
 * @author xutong
 */
public class StringTest {
    public static void main(String[] args) {
        String sentence = "😀2";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            stringBuilder.append(sentence.charAt(i));
        }
        System.out.println(stringBuilder.toString());
        int[] ints = sentence.codePoints().toArray();
        System.out.println(new String(ints, 0, ints.length - 1));
        int i = sentence.codePointAt(2);

        System.out.println(new String(new int[]{i}, 0, 1));
    }
}
