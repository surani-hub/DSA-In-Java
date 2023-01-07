package leetcode.easy;

public class NumberOfOneBits {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }

    static public int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<32;i++){
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
}
