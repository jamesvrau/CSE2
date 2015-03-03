//James Rau, CSE 002, 26/02/2015
//Program for producing symbols 


public class MakeSymbols { // add class and main method respectively 
public static void main (String [ ] args) {

int value = (int)(Math.random ()*101); //generates integer 0-100 
int e=0; //even counter
int o=0; //odd counter

System.out.println( " Random number generated: " +value ); //print out value generated 
    

if(value!=0){ //if not zero, run program

    if(value%2==0) { //all even values
    System.out.print( " The output pattern: ");
   
        do{
        System.out.print( "*"); 
        e++;
            }//close do loop
    
        while (e<value);
    
    } //close if statement for even integers 


    
    else{ //all odd values
    
        do{
        System.out.print( "&");
        o++;
        }//close do loop
    
        while (o<value);
    
    
}

}//close first if statement 

else { //if random value is 0, then print nothing...
System.out.print( "  ");
}

    
} //close main method
} //close class 
    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


