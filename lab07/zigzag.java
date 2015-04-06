//James Rau, CSE 002, 19/03/2015
//Program for printing *'s in a specefic order
import java.util.Scanner; // import scanner class

public class zigzag { // add class and main method respectively 
public static void main (String [ ] args) {
  
while(true) {

  
Scanner in = new Scanner( System.in ); // 'in' = value entered
System.out.print( "Please enter an integer between 3-33: " );  //range is inclusive 
  
//declartions
int nStars = 10; 
int counter = 1; //counts up to reach the number stars needing to be printed 
int space = 0; 


if (in.hasNextInt()) { //check whether input is an integer
    nStars = in.nextInt();
    
        if(nStars>2 && nStars<34) {
            
/////////start of zigzag///////

while(counter<=nStars){
    System.out.print("*");
    counter++;
}

System.out.println();
counter=1;
while(counter<=(nStars-2)){
    
        while(space<counter){ 
        System.out.print(" "); //print out a space 
        space++;
        }
    
    space=0; 
    System.out.println("*");
    counter++;
} //run while loop 
  
  
counter=1;
while(counter<=nStars){
    System.out.print("*");
    counter++;
}




  
///////end of zigzag//////
        }//close integer check 3-33 inclusive 
        else {System.out.print("Enter an integer between 3-33 inclusive"); } 
  
} //close to if statement - integer check
else { System.out.print("Enter an integer "); } 

System.out.println("Enter Y or y to do it again: ");

String ans = in.next(); //promt input and assign to ans

if (ans.equals("Y") || ans.equals("y")){
    continue;
}

else{ 
    break;}
    
}//close to infinite loop



} //close class
} //close main string