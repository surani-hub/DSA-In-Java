package recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(fib(num));
    }

    static public int fib(int number){
        if(number == 0 || number == 1){
            return number;
        }
        return fib(number-2) + fib(number-1);
    }
}
