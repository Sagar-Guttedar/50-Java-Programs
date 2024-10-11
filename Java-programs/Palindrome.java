import java.util.Scanner;

public class Palindrome{

    String s1,s2="",decider;
    Scanner sc = new Scanner(System.in);

    public void testPalindrome(){
        do{
            System.out.println("Enter a string"); //hello;
            s1 = sc.next();
            for(int i=s1.length()-1;i>=0;i--){ //i = i-1
                s2+= s1.charAt(i); // s2 = s2+s1.charAt(2)
            }
            if(s1.equals(s2))
                System.out.println("Given String is palindrome "+s2);
            else
                System.out.println("Given String is not a palindrome "+s2);

            System.out.println("You want to check another string");
            decider = sc.next();
            s2="";
        }while (decider.equalsIgnoreCase("Yes"));

    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.testPalindrome();
    }
}