/* https://leetcode.com/problems/string-compression/description/ */
public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars));
    }

    static public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            int count = 0;
            char curr = chars[i];
            while (i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }
            chars[index++] = curr;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}
