//James Rau, CSE 002, 13/02/2015
//Program for collecting data, or the amount of cookies
//each person should get depending on total people 

    
 
import java.util.Scanner; // import scanner class
public class Cookies { // add class and main method respectively 
public static void main (String [ ] args) {
    Scanner input = new Scanner( System.in ); // take an input from user
    int answer; //declared for print later
    
    
    System.out.print ( "Number of people : " ); // print out command for user 
    
    if(input.hasNextInt()) // Check whether the input is an integer, if true then goes into if commands 
                { //opening bracket people being integer 
                       int people = input.nextInt() ;  //people declared as integer     
                        
                            if (people>0) { //people is accepted, now onto cookies 
 
                                                    System.out.print ( "Enter number of cookies you planning to buy :");
                                                    if(input.hasNextInt()) //proceed if cookies integer 
                                                    { //opening bracket cookies being integer
                                                                int cookies =input.nextInt() ; //cookies declared as integer
                                            
                                                                        if (cookies>0) { //cookes 
                                                                
                                                                                    System.out.print ( "Enter number cookies you want each person to get :");
                                                                                             if(input.hasNextInt()) //proceed if cookiesEat integer    
                                                                                            { //opening brackets to number eaten
                                                                                                    int cookiesEat =input.nextInt () ; //cookiesEat declared
                                                                                                            if (cookiesEat>0) {
                                                                                                                
                                                                                                                       
                                                                                                                             if (cookies/people == cookiesEat) {
                                                                                                                                 
                                                                                                                                               
                                                                                                                                                
                                                                                                                                System.out.print ( "You have enough cookies and it divides evenly"); 
                                                                                        
                                                                                                                 
                                                                                                                                 
                                                                                                                                            } //closing bracket for final calculation confirmation 
                                                                                                                             else { System.out.println (" It does not divide evenly" ); return; }      
                                                                                                                                        
                                                                                                                                } //closing bracket cookiesEat
                                                                                                            else { System.out.println ("You did not enter value >0"); return; }                 
                                                                                                                                
                                                                                            } //closing brackets to eatCookies being integer 
                                                                                            
                                                                                            else { System.out.println ("You did not enter value >0"); return; }
                                                        
                                                                                        } //closing bracket cookes is integer and greater zero
                                                                        else { System.out.println ("You did not enter value >0"); return; } //cookies not greater 0 
                                                    } //closing bracket cookies being integer
                                                    
                                                    else {System.out.println ("You did not enter an int"); return; }
                        
    
                                            } //closing bracket people being greater 0
                            else { System.out.println ("You did not enter value >0"); return; } //people not greater 0 
                                
                } //closing bracket people being integer 
    else { System.out.println ("You did not enter an int"); return; } // leaves program, program terminats 
             
     
     
     
                
    } //end method
            
} //end of class 
    
    
    
    
    
     