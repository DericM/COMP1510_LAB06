package q4;

//************************************************************ 
// Dates.java 
//
//Determine whether a 2nd-millenium date entered by the user 
// is valid
//************************************************************ 
import java.util.Scanner;
public class Dates {
    public static void main(String[] args) {
        int month;
        int day;
        int year; 
        //date read in from user int daysInMonth;
        
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
      //true if input from user is valid boolean leapYear;
        //number of days in month read in 
        //true if user's year is a leap year
        boolean monthValid = false;
        boolean yearValid = false;
        boolean dayValid = false; 
        
        Scanner scan = new Scanner(System.in);
        //Get integer month, day, and year from user 
        System.out.print ("Enter the month: "); 
        month = scan.nextInt();
        System.out.print ("Enter the day: "); 
        day = scan.nextInt();
        System.out.print ("Enter the year: "); 
        year = scan.nextInt();
        
        
        //Check to see if year is valid 
        if(1000 <= year && year <= 1999){
            yearValid = true;
            //Check to see if month is valid 
            if(1 <= month && month <= 12){
                monthValid = true;
                //Determine whether it's a leap year 
                if(year % 400 == 0 ||( year % 4 == 0 && year % 100 != 0)){
                    daysInMonth[1] = 29;
                    //Determine number of days in month
                    //User number of days in month to check to see if day is valid 
                    if(1 <= day && day <= daysInMonth[month-1]){
                        dayValid = true;
                    }
                }
            }
        }
        
        //Determine whether date is valid and print appropriate message
        if(yearValid && monthValid && dayValid){
            System.out.println("Date is Valid!");
        }
        else{
            System.out.println("Date is NOT Valid!");
        }
    } 
}

