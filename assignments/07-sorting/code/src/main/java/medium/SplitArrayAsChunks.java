package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayAsChunks {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
        int count = 0;
        List<int[]> list = new ArrayList<>();
        int[] subArr = new int[splitSize];
        int i = 0;
        for (int num : array) {
            subArr[i++] = num;
            count++;
            if (count == splitSize) {
                list.add(subArr);
                subArr = new int[splitSize];
                count = 0;
                i = 0;
            }
        }
        int[] arr = new int[count];
        i = 0;
        if (count > 0) {
            for (int n : subArr) {
                arr[i++] = n;
                if (i == count) {
                    break;
                }
            }
            list.add(arr);
        }
        return list;

    }
}
