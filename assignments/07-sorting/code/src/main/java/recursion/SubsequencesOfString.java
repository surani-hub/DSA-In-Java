package recursion;

public class SubsequencesOfString {
    static int count;
    public static void main(String[] args) {
        String str = "abcd";
        printSub(str);
    }

    static public void printSub(String str) {
        if (str.isEmpty()) {
            return;
        }

        String miniSub = "";
        printSubsequence(0, str, miniSub, str.length());
        System.out.println("=======================================");
        System.out.println(count);
    }

    // printing all subsequences
    public static void printSubsequence(int index, String str, String ans, int n) {
        if (index == str.length()) {
            count++;
            System.out.println(ans);
            return ;
        }
        printSubsequence(index + 1, str, ans, n);
        ans =  ans + str.charAt(index);
        printSubsequence(index + 1, str, ans, n);
    }
}
