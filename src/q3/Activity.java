package q3;

import java.util.Scanner;

public class Activity {

    public static void main (String[] args) {
        
        
        double temp; 

        Scanner scan = new Scanner(System.in); 
        String askAgain = "y"; 
        
        
        do{
            
            //input
            System.out.print ("Enter the current temperature: "); 
            temp = scan.nextDouble();

            if(80 <= temp && temp < 96){
                System.out.println ("Why not go swimming?"); 
            }
            else 
            if(60 <= temp && temp < 80){
                System.out.println ("Why not play some tennis?"); 
            }
            else
            if(40 <= temp && temp < 60){
                System.out.println ("Why not play some golf?"); 
            }
            else
            if(20 <= temp && temp < 40){
                System.out.println ("Why not go skiing?"); 
            }
            else{
                System.out.println ("Visit our shops!"); 
            }
            
            System.out.print ("Ask Again(y/n)? "); 
            askAgain = scan.next();
        }
        while (askAgain.equals("y")); 
    } 
}
