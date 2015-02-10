// James Rau, CSE 002, 06/02/2015
// Program for computing the cost of buying a product, using input from user




// import scanner class 
    import java.util.Scanner;

    
// main method required for every Java program
    public class BigMac {
        public static void main (tring [ ] args) {
        
// declare the variable relating to scanner
    Scanner myScanner; 
    myScanner = new Scanner( System.in );
    
    
// print out values
    System.out.print ( 
        "Enter the number of Big Macs (an interger > 0 ) : ");
        
// accept user input 
    int nBigMacs = myScanner.nextInt( ) ;
    
// accept a double in the input
    System.out.print("Enter the cost per Big Mac as"+
    " a double (in the form xx.xx): " );
    
    double bigMac$ = myScanner.nextDouble( );
	System.out.print(
    "Enter the percent tax as a whole number (xx): ");
    
    double taxRate = myScanner.nextDouble( );
    taxRate/=100; 
//user enters percent, but I want proportion 

// declare variable cost
    double cost$;
// whole dollar amount of cost$, for storing digits to the right of the decimal point
    int dollars, dimes, pennies; 

// calculation, the whole amount while dropping decimal fraction
    cost$ = nBigMacs*bigMac$*(1+taxRate);


    dollars=(int)cost$;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 

    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;
    
    System.out.println("The total cost of " + nBigMacs
    + "BigMacs, at $" + bigMac$ + " per bigMac, with a" +
    " sales tax of " + (int)(taxRate*100) +
    " % is $" + dollars + '.' + dimes + pennies);
    
        
        
    }
    // end of main method
    
} // end of class