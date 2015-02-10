// James Rau, CSE 002, 02/09/2015
// Program for guessing cubed root value

// import scanner class 
    import java.util.Scanner;

// main method required for every Java program
    public class Root {
        public static void main (String [ ] args) {
            
// declare the variable relating to scanner
    Scanner myScanner; 
    myScanner = new Scanner( System.in );
    
// input value to be used  
    System.out.print ( "Enter a double and I print cube root : ");
    double x = myScanner.nextDouble( ) ; //declare x to be double that was inputed 
    
// divide x by 3 to get first guess of cubed root, then further refine 
    double guess1= x/3;
    double guess2= ((2*guess1*guess1*guess1+x)/(3*guess1*guess1)); // continue using equation and ans. from previous guess1
    double guess3= ((2*guess2*guess2*guess2+x)/(3*guess2*guess2));
    double guess4= ((2*guess3*guess3*guess3+x)/(3*guess3*guess3));
    double guess5= ((2*guess4*guess4*guess4+x)/(3*guess4*guess4));
    double guess6= ((2*guess5*guess5*guess5+x)/(3*guess5*guess5));
    
   System.out.print ( "The cubed root is = "  + guess6); //final estimate 
   System.out.print ( " \n "); //new line
   
    System.out.print ( "\n The first estimate is  "  + guess1); //print out guess 1
    System.out.print ( "\n The second estimate is " + guess2);
    System.out.print ( "\n The third estimate is  "  + guess3);
    System.out.print ( "\n The fourth estimate is "  + guess4); //print out guess 4
    System.out.print ( "\n The fifth estimate is "  + guess5);
    
 
     
        }
        
    }