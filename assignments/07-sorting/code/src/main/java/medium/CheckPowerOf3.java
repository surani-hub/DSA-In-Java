package medium;

/* https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/ */
public class CheckPowerOf3 {
    public static void main(String[] args) {
        int n = 91;
        // System.out.println(checkPowersOfThree(n));
        int num = 13;
        System.out.println(countDigitOne(num));
    }

    static public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
                int rem = i / 10;
                if (rem == 1) {
                    count++;
                }
                i = i / 10;
            }
        return count;
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
