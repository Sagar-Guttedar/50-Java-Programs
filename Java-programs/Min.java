
// Minimum of Three Numbers

public class Min {
    public static void main(String[] args) {
        int a=10, b=15, c=3;

        if(a<b && a<c){
            System.out.println("Minimum number is :"+a);
        }else if(b<a && b<c){
            System.out.println("Minimum number is :"+b);
        }else{
            System.out.println("Minimum number is :"+c);
        }
    }
}
