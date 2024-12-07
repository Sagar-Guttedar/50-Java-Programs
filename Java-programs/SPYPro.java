

// Write a program to SPY number 


public class SPYPro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum=0, p=1,id;
        while (n !=0 ){
            id = n%10;
            sum=sum+id;
            p=p*id;
            n=n/10;
        }

        if (sum==p){
            System.out.println("Given number is spy");
        }else{
            System.out.println("given number is not SPY");
        }
    }
}