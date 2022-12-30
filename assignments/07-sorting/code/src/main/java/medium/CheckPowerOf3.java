package medium;

/* https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/ */
public class CheckPowerOf3 {
    public static void main(String[] args) {
        int n = 91;
        System.out.println(checkPowersOfThree(n));
    }

    static public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            } else {
                n /= 3;
            }
        }
        return true;
    }
}
