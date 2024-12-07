

// Write a prgram to reverse the given array


public class ReverseArray{
    public static void main(String[] args) {
        int[] a={1,2,3,4};

        System.out.print("Reversed Array : ");
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}