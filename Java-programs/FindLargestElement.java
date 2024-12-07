

// Write a program find larger element in given array


public class FindLargestElement{
    public static void main(String[] args) {
        int[] numbers={10,20,30,04};

        int largest=20;

        for (int num:numbers){
            if (num<largest){
                largest=num;
            }
        }
    }
}