

// Write a S pattern program example.

public class SPatternPro {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for (int j=1;j<=5;j++){
               if (i==1 || j==1) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++) {
            for (int j=1;j<=5;j++) {
                if (i==1 || i==5 || j==5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}