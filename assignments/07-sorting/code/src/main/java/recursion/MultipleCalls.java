package recursion;

public class MultipleCalls {
    public static void main(String[] args) {
        func(3);
    }

    static public void func(int n){
        if(n==0){
            return;
        }
        func(n-1);
        System.out.println(n);
        func(n-1);
    }
}
