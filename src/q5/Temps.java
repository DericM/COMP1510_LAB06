package q5;

//************************************************************ 
// Temps.java 
// 
// This program reads in a sequence of hourly temperature 
// readings (beginning with midnight) and prints the maximum 
// temperature (along with the hour, on a 24-hour clock, it 
// occurred) and the minimum temperature (along with the hour 
// it occurred).
//************************************************************ 
import java.util.Scanner;
public class Temps {
    //-------------------------------------------------
    // Reads in a sequence of temperatures and finds the 
    // maximum and minimum read in. 
    // -------------------------------------------------
    public static void main (String[] args) {
        final int HOURS_PER_DAY = 4;
        //a temperature reading 

        int maxTemp;
        int minTemp;
        int maxHour;
        int minHour;
        int[] allTemps = new int[HOURS_PER_DAY];
        Scanner scan = new Scanner(System.in);
        
        //print program heading 
        System.out.println ();
        System.out.println ("Temperature Readings for 24 Hour Period"); 
        System.out.println ();
        
        for (int hour = 0; hour < HOURS_PER_DAY; hour++) {
            System.out.print ("Enter the temperature reading at " + hour + ":00 ");
            allTemps[hour] = scan.nextInt(); 
            
        } 
        
        maxTemp = allTemps[0];
        minTemp = allTemps[0];
        maxHour = 0;
        minHour = 0;
        for (int i = 1; i < allTemps.length; i++) {
            if (allTemps[i] > maxTemp) {
                maxTemp = allTemps[i];
                maxHour = i;
            }
            if (allTemps[i] < minTemp) {
                minTemp = allTemps[i];
                minHour = i;
            }
        }
        // Print the results
        System.out.println ("The Max temperature was " + maxTemp + " at " + maxHour + ":00"); 
        System.out.println ("The Min temperature was " + minTemp + " at " + minHour + ":00"); 
        
    } 
}

