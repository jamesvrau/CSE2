//James Rau, CSE 002, 16/03/2015
//Program for inputing a number and producing waves in a pattern of numbers  
import java.util.Scanner; // import scanner class

public class waves { // add class and main method respectively 
public static void main (String [ ] args) {
    Scanner in = new Scanner( System.in ); // 'in' = value entered
    System.out.print( "Please enter an integer between 1-30 : " );  //range is inclusive 


//declarations:
int inputValue=1; //assigned to value entered by user 
int counter1=1; //counting up for entire wave loop
int counter2=1; 
int counter3=1;
//declarations:


if (in.hasNextInt()) { //check whether input 'in' has an integer
    inputValue = in.nextInt(); //store value into variable 'inputValue' 

        if(inputValue>0 && inputValue<31) { //meet criteria inclusively, store 'else' at very bottom
    
//////////Start of first wave for loop//////////
System.out.println("             ");
System.out.println("FOR LOOP:    ");
        

for(counter1=1; counter1<=inputValue; counter1++){ //keeps running the wave code until number inputted is reached by counter
    
    if (counter1%2!=0){ //wave for all odd numbers
    
        for (counter2=counter1; counter2>=1; counter2--) { //counters used to keep track character number, and number of characters each line
                for (counter3=1; counter3 <= counter2; counter3++){
                System.out.print(counter1);
                }
        System.out.println("        "); //new line
        }
    } //close if statement for odd numbers 

    else{ //wave for all even numbers
        
        for(counter2=1; counter2 <= counter1; counter2++){ //counts values up wave
            for(counter3=1; counter3 <= counter2; counter3++){
            System.out.print(counter1);
            }
        System.out.println("         ");
        }
    } //close else statement for even numbers
    
} //close for loop for entire wave 

////////////End of first wave based on the for loop//////////




/////// Start while loop /////////
//reset values for the counters for new loop, expect inputvalue

System.out.println( "            "); //space 
System.out.println("WHILE LOOP: ");
counter1=1;

while (counter1<=inputValue){ //counting up for whole wave sequence 

    if(counter1%2!=0){ //odd values first 
    counter2=counter1; //reset valeus for counters
            while (counter2 >= 1){
            counter3=1;                
                   
                    while(counter3 <= counter2){
                    System.out.print(counter1);
                    counter3++;
                    }
        
            System.out.println("      "); //new line
            counter2--; //negative values count minus down wave
            }//close first while loop   
        
        } //close if statement for odd values
    
    else { //even values
    counter2=1;        
            while(counter2<=counter1){
            counter3=1;            
                   
                    while(counter3<=counter2){
                    System.out.print(counter1);
                    counter3++;
                    } //close inner most while loop
                    
            System.out.println("      ");
            counter2++;
            } //close first while loop
    }//close else statement to even values

   counter1++; //keeps counting up for while loop for finish whole sequence of wave 

} //close while loop
//////// While loop finished //////





////////Do While loop start/////////

System.out.println("        ");
System.out.println("DO-WHILE LOOP:  ");
counter1=1; //resets counter 1 for this type of wave

do{
    if (counter1%2!=0) {//all odd values
        counter2 = counter1;
        
        do {
        counter3=1;
                
                do{
                System.out.print(counter1);
                counter3++;
                } //end inner most do loop
                
                while (counter3 <= counter2);
                System.out.println("        ");
                counter2--;
        }
        
        while (counter2 >=1);
    }
        
        
        
    else{ //all even vales
        counter2=1;
            do{
            counter3=1;
                
                do{
                System.out.print(counter1);
                counter3++;
                }
                
                while(counter3 <= counter2);
                System.out.println();
                counter2++;
            }
            
            while(counter2 <= counter1); 
    }//close else statement for even values
    
    counter1++;
   
}//end of do loop for odd

while (counter1 <= inputValue); //keeps running wave until inputvalue is reached

////////Do While Loop finished/////// finally...
    

}//close for all waves that are within values 1-30



//acounts for second if-else statement 

else{ 
        System.out.println("Not an integer between 1 and 30");
        return; //exit out of 
    }//close else, not a value entered between 1 and 30
 
 
 
 
    
}//close for statement about integers  

}//close method 
}//close class













