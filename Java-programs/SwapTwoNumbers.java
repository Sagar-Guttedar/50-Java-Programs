// To swap value of Two variables. (using third variabale)
//         or
// To swap values of two variables.(without using third variabale)

public class SwapTwoNumbers{
    public static void main(String[] args) {
        int a=10, b=20, c;
        System.out.println("Before Swapping Value A :"+a+" Value B :"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        /*c=a;
        a=b;
        b=c;*/
        System.out.println("After Swapping Value A :"+a+" Value B :"+b);
    }
}