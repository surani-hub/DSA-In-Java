package recursion;

/* https://leetcode.com/problems/permutations/description/ */

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }

    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        findPermutations(nums, perm, ans);
        return ans;
    }

    static public void findPermutations(int[] nums, List<Integer> perm, List<List<Integer>> ans) {
        if (perm.size() == nums.length) {
            ans.add(new ArrayList<>(perm));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (perm.contains(nums[i])) {
                    continue;
                }
                perm.add(nums[i]);
                findPermutations(nums, perm, ans);
                perm.remove(perm.size() - 1);
            }
        }
    }
}
