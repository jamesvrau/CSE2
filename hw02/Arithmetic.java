// James Rau, 31/01/2015, Arithmetic Calculations
// Homework 02

// Program to run calculations and print the numerical data 

//  define a class 

    public class Arithmetic{
        
// add main method
    public static void main (String [ ] args) {
        
        
//Number of pairs of socks
    int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
        double sockCost$=2.58;

//Number of drinking glasses
    int nGlasses=6;
//Cost per glass
        double glassCost$=2.29;

//Number of boxes of envelopes
    int nEnvelopes=1;
//cost per box of envelopes
        double envelopeCost$=3.25;

//tax in PA
    double taxPercent=0.06;
    
    
// Declare new variables for different totals of each item 
    double totalSockCost$, totalGlassCost$, totalEnvelopeCost$; //variables for each item total before tax
    double taxSocks$, taxGlasses$, taxEnvelopes$; //total tax for each kind item
    
// Declare variables for total of purchase 
    double totalCostBeforeTax; //variable for purchase total
    double totalSalesTax; //variable for total purchase tax
    double totalCostAfterTax; // variable for final purchase total
    
    
// Calculations of each kind item after declaring variables (excluding tax)
    totalSockCost$ = nSocks*sockCost$; //cost all socks
    totalGlassCost$ = nGlasses*glassCost$; //cost of all glasses
    totalEnvelopeCost$ = nEnvelopes*envelopeCost$; //cost of all envelopes 
    

// Calculating tax of items
    taxSocks$ = taxPercent*totalSockCost$;
    taxGlasses$ = taxPercent*totalGlassCost$;
    taxEnvelopes$ = taxPercent*totalEnvelopeCost$;
    
    
// Calculating purchase total
    totalCostBeforeTax = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
    totalSalesTax = taxSocks$ + taxGlasses$ + taxEnvelopes$;
    totalCostAfterTax = totalCostBeforeTax + totalSalesTax; 
    
// Display all values in correct order

     System.out.println("               "); //space between display for neatness 
    
        //Display item, quantity, and price
     System.out.println("Socks     " + nSocks +   " items,  each $" + sockCost$); 
     System.out.println("Glasses   " + nGlasses + " items,  each $" + glassCost$);
     System.out.println("Envelopes " +nEnvelopes+ " items,  each $" + envelopeCost$);
     
     System.out.println("               ");
     
        //Display total item amount, and its sales tax
     System.out.println("Socks Total      $" + totalSockCost$ +   ",    Sales tax  $" + taxSocks$);
     System.out.println("Glasses Total    $" + totalGlassCost$ +  ",   Sales tax  $" + taxGlasses$);
     System.out.println("Envelopes Total  $" + totalEnvelopeCost$+",    Sales tax  $" + taxEnvelopes$);
     
       System.out.println("               ");
     
        //Display totals before tax, sales tax, and total purchase price
     System.out.println("Total Excluding Tax   $" + totalCostBeforeTax);
     System.out.println("Total Sales Tax       $" + totalSalesTax);
     System.out.println("Total Purchase Price  $" + totalCostAfterTax);
     
     //close main method
     
    }
        }



