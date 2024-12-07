

// Write a program to find second element in given array

public class SecondElementGivenArray{
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        if (numbers.length>1){
            System.out.println("The second element is : "+numbers[1]);
         }else{
            System.out.println("The array has less than two array");
        }
    }
}