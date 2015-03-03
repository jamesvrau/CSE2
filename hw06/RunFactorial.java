//James Rau, CSE 002, 26/02/2015
//Program for calculating factorials 


import java.util.Scanner; // import scanner outside of class

public class RunFactorial { // add class and main method respectively 
public static void main (String [ ] args) {

int intCheck = 0; //initialized
int multiple =1;
int factorial =1; //answer

    Scanner in = new Scanner( System.in ); // create a Scanner for variable 'in'
    System.out.println( "Please enter an integer [9-16] : " ); 
    intCheck = in.nextInt(); //checks integer value
    


if (intCheck<=16 && intCheck>=9) {
    
    
    while (multiple<=intCheck) {

        factorial = factorial*multiple;
        multiple++;
    
    } //close while loop   
        System.out.println( " Input accepted: \n" + intCheck + "!= " + factorial);

} //close if loop
        

else{ System.out.println( " Invalid input, enter again " );
}
    
    
    
} //close main method
} //close class 