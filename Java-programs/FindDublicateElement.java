// Java program to find duplicate elements in an array

public class FindDublicateElement {
    public static void main(String[] args) {
        int[] inputArray={10,5,10,30,20,40,50,60,70,60,10};

        for (int i=0; i< inputArray.length;i++){
            for (int j=i+1; j< inputArray.length;j++){
                if (inputArray[i] == inputArray[j]){
                    System.out.println("Duplicate elements found : "+inputArray[i]);
                }
            }
        }
    }
}