


// Write a program to average of given element in an array.

public class AverageOfGivenElement{
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,5,5,};
        int sum = 0;

        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        double avg = (double)sum/arr.length;
        System.out.println(avg);
    }
}