

// Write a program to WrapperCasting Example

public class WrapperCasting {
    public static void main(String[] args) {
        int num = 10;
        Integer wrappedNum = num;  // Autoboxing
        int unwrappedNum = wrappedNum;  // Unboxing
        System.out.println("Autoboxed: " + wrappedNum);
        System.out.println("Unboxed: " + unwrappedNum);
    }
}