package leetcode.easy;

/* https://leetcode.com/problems/power-of-two/description/ */
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerTwo(6));
    }

    static public boolean isPowerTwo(int n){
        return (n>0) && ((n&(n-1)) == 0);
    }

    static public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;

        while(n%2 == 0){
            n /= 2;
        }
        return n==1;
    }
}
