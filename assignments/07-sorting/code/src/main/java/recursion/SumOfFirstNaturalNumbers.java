package recursion;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(printSum(number));
    }

    static public int printSum(int num) {
        if (num == 1) {
            return num;
        }
        return num + printSum(num - 1);
    }
}
