
// To print number of days in a Given Month.
// Using Ladder If Else

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int month=1;

        if (month==1){
            System.out.println("Janauary : 31");
        }else if(month==2){
            System.out.println("Febraury : 28/29");
        }else if(month==3){
            System.out.println(" March : 31");
        }else if(month==4){
            System.out.println("April : 30");
        }else if(month==5){
            System.out.println("May : 31");
        }else if(month==6){
            System.out.println("June : 30");
        }else if(month==7){
            System.out.println("July : 31");
        }else if(month==8){
            System.out.println("Agust : 30");
        }else if(month==9){
            System.out.println("September : 31");
        }else if(month==10){
            System.out.println("October : 30");
        }else if(month==11){
            System.out.println("November : 31");
        }else if(month==12){
            System.out.println("December : 30");
        }else {
            System.out.println("Given number is not valid");
        }
    }
}