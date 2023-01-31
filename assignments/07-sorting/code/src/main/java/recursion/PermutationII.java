package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationII {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(permuteUnique(arr));
    }

    static public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        Arrays.sort(nums);
        findPermutations(nums, perm, ans, new boolean[nums.length]);
        return ans;
    }

    static public void findPermutations(int[] nums, List<Integer> perm, List<List<Integer>> ans, boolean[] status) {
        if (perm.size() == nums.length) {
            ans.add(new ArrayList<>(perm));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (status[i] || i > 0 && nums[i] == nums[i - 1] && !status[i - 1])
                    continue;
                status[i] = true;
                perm.add(nums[i]);
                findPermutations(nums, perm, ans, status);
                status[i] = false;
                perm.remove(perm.size() - 1);
            }
        }
    }
}
