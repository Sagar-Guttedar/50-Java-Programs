


//  Write a program sort the given array in ascending and Descending order.

public class SortArrayInAscendingAndDescendingOrder {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,64,4,5,6};

        // Ascending Order
        Arrays.sort(arr);
        System.out.println("Ascending Order : "+Arrays.toString(arr));

        //Descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending Order : "+Arrays.toString(arr));

    }
}