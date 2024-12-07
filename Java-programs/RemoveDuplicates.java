

// Write a program to remove duplicate letter in given String.

public class RemoveDuplicates{
    public static void main(String[] args) {
        String input="java developer";
        String result=" ";

        for (char ch:input.toCharArray()){
            if (result.indexOf(ch)==-1){
                result +=ch;
            }
        }
    }
}