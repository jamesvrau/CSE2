//James Rau, CSE 002, 28/02/2015
//Program for summing 5 non-negative integers 

import java.util.Scanner; // import scanner class

public class GetIntegers { // add class and main method respectively 
public static void main (String [ ] args) {
    
int sum =0;
int intCheck = 0;

System.out.println( "Please enter 5 non-negative integers: " ); 

for(int i=1; i<6; i++){
    
    Scanner in = new Scanner( System.in ); // create a Scanner for variable 'input'
    intCheck = in.nextInt(); //checks integer value
    
        if (intCheck > 0){
        sum = sum + intCheck; 
        }
        
        
        else{ System.out.println( " Invalid input, enter again " );
        i--; //redo input, take away 1 count value
        }
    
} //close for loop

System.out.println( " Sum is " + sum );
 


} //close main 
} //close class




