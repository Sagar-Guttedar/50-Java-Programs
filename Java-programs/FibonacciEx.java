
// Write a program Fibonacci Series.

public class FibonacciEx{
    public static void main(String[] args) {
        int n=10,a=0,b=1;
        for (int i=0;i<=10;i++){
            System.out.print(a+" ");
            b=a+(a=b);
        }
    }
}