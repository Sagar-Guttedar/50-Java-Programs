

// Write a program to find second letter in given String.


public class SecondLetterGivenString{
    public static void main(String[] args) {
        String str = "sagar";
        if (str.length() > 1) {
            System.out.println("The second leter is : "+str.charAt(4));
        }else{
            System.out.println("The String has less than two characters");
        }
    }
}