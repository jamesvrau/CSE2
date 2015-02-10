// James Rau, CSE 002, 02/09/2015
// Program for displaying 4 decimals

// import scanner class 
    import java.util.Scanner;

// main method required for every Java program
    public class FourDigits {
        public static void main (String [ ] args) {
            
// declare the variable relating to scanner
    Scanner myScanner; 
    myScanner = new Scanner( System.in );
    
// input value to be used  
    System.out.print ( "Enter a number : ");
    double inputValue = myScanner.nextDouble( ) ; 
    

// calculation for extracting decimals  
    double inputNumber= inputValue*10000; // convert input value to integer 
    int value = (int) inputNumber; //  cast input to integer, name value
    int v4 = value % 10; // divide value by 10 and define the remainder as v4
    value /= 10; //23456
    
    int v3 = value % 10; //divide again by 10 to define 3rd decimal place as v3
    value/=10;
    
    int v2 = value % 10;
    value/=10;
    
    int v1 = value % 10;
    
// print values in reverse order, with 1st decimal value first
    System.out.println( "The four digits are " +v1+""+v2+ "" +v3+ ""+v4);

    
        }
} // close container 
