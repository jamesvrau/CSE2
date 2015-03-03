//James Rau, CSE 002, 26/02/2015
//Program for calculating factorials 


import java.util.Scanner; // import scanner outside of class

public class SmileGenerator { // add class and main method respectively 
public static void main (String [ ] args) {

int intCheck = 0; //initialized
int factorial =1;

    Scanner in = new Scanner( System.in ); // create a Scanner for variable 'in'
    System.out.println( "Please enter an integer [9-16] : " ); 
    intCheck = in.nextInt(); //checks integer value
    
if (intCheck<=16 && intCheck>=9) {
    
    
    while (multiple<=intCheck) {
        factorial = factorial*multiple;
        System.out.println( " Input accepted: /n" + intcheck + "!=" + factorial);
    } //close while loop   
    

} //close if loop
        

else{ System.out.println( " Invalid input, enter again " );
}
    
    
    
} //close main method
} //close class 