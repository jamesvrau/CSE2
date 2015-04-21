//James Rau, CSE 002, 19/04/2015
//Program for multiplying 2 arrays 


import java.util.Scanner; //import scanner 
import java.util.Arrays; //import 


public class Multiply { // add class and main method respectively
public static void main (String [ ] args) {
    
    Scanner scan=new Scanner(System.in);
    
    System.out.print("Enter an integer for the width of matrix 1: ");
  	int width1 = scan.nextInt();
  	System.out.print("Enter an integer for the height of matrix 1: ");
  	int height1 = scan.nextInt(); 
  	System.out.print("Enter an integer for the width of matrix 2: ");
  	int width2 = scan.nextInt();
  	System.out.print("Enter an integer for the height of matrix 1: ");
  	int height2 = scan.nextInt(); 
  	
    if (width1 == height2){
            if((width1>0) && (height1>0) && (width2>0) && (height2>0)){
            //dimensions applicable 
              
            randomMatrix(height1, width1); //first matrix 
            System.out.println("I tried..not quite able to put it all together..");
            
    
                
            }//close if statement 
            else{ System.out.println("You did not enter valid inputs. ");
            }
    }
    
    
    else{
        System.out.println("This matrix cannot be mulitiplied. ");
    }
    
}//close main method 




public static int[][] randomMatrix(int height, int width){
    
    int multiplier = 1;
    int[][] array1 = new int[height][];
        
        for(int i=0; i<height; i++){
        array1[i] = new int [width];
        
            for(int j=0; j<width; j++){
            multiplier=1;
            
            double num = Math.random();
            if(num>.5){
                multiplier = -1;
            }
            
            int x = (int) (Math.random() * 10 + 1);
            array1[i][j] = x * multiplier;
                
            }//close second for loop
        
        
        }//close first for loop
    
    return array1;
  
    
}//close randomMatrix 

}//close class

