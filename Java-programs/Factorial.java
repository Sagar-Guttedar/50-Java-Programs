//To write Factorial number using java program 
// Ex :- 1*2*3*4*5

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        for(int i=1; i<=5; i++){
            fact=fact*i;
            System.out.println("Factorial number is : "+fact);
        }
    }
}
