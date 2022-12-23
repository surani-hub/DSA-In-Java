import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* https://leetcode.com/problems/intersection-of-two-arrays-ii/description/ */
public class IntersectionArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    static public int[] intersect(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (true) {
            if (p1 >= nums1.length || p2 >= nums2.length) {
                break;
            }
            if (nums1[p1] > nums2[p2]) {
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
