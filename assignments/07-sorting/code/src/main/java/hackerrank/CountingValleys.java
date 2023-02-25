package hackerrank;

public class CountingValleys {
    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(steps, path));
    }

    public static int countingValleys(int steps, String path) {
        int height = 0, count = 0;
        for (char c : path.toCharArray()) {
            if (c == 'U') {
                height++;
                if (height == 0) {
                    count++;
                }
            } else {
                height--;
            }
        }
        return count;
    }
}
