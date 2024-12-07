

// Write a program to find missing number in given array.

public class MissingNumberArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int totalSum = 28;
        int arraySum = 0;

        for (int i=0;i<arr.length;i++){
            arraySum =arraySum+arr[i];
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing Number : "+missingNumber);
    }
}
