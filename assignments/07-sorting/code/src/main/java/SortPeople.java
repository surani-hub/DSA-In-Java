import java.util.Arrays;

public class SortPeople {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    static public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            for (int j = 1; j < heights.length - i; j++) {
                if (heights[j] > heights[j - 1]){
                    int temp = heights[j];
                    heights[j] = heights[j - 1];
                    heights[j - 1] = temp;
                    String tempName = names[j];
                    names[j] = names[j - 1];
                    names[j - 1] = tempName;
                }
            }
        }
        return names;
    }
}
