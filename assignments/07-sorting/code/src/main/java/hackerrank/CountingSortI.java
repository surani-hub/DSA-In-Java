package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSortI {
    public static void main(String[] args) {
        int n = 100;
        List<Integer> arr = Arrays.asList(1, 1, 3, 2, 1);
        System.out.println(countingSort(arr));
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] frequency = new int[100];
        for (int i = 0; i < arr.size(); i++) {
            frequency[arr.get(i)]++;
        }
        return Arrays.stream(frequency).boxed().collect(Collectors.toList());
    }
}
