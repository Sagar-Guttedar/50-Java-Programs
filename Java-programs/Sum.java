// Sum of two numbers

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a,b, num;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the first number:");
        a=sc.nextInt();

        System.out.println("Enter the second number :");
        b=sc.nextInt();

        num=a+b;
        System.out.println("Sum of two numbers : "+num);


    }
}
