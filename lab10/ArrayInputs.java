//James Rau, CSE 002, 17/04/2015
//Program for practicing declaring, allocating, and initializing one dimensional arrays 


import java.util.Scanner; //import scanner 
import java.util.Arrays; //import 

public class ArrayInputs { // add class and main method respectively

public static void main (String [ ] args) {
    int x=0; //variable declared 
    
    System.out.print("Please enter an integer for the size of an array: ");
    Scanner input=new Scanner(System.in);
        
        if (!input.hasNextInt()){
            System.out.println("Input entered is not an integer "); //sort out if not an integer
        }
        x = input.nextInt(); 
        if(x<0){
            System.out.println("Sorry the number entered is negative");
        }
        
        //x is the integer entered, which is the array size
        
    
    int Array[]=new int [x]; //declare size of array 
    
    System.out.print("Please enter "+x+" positive integers: ");
    
    
    for (int i=0; i<x; i++){ //for loop for creating the array
    
    
    Array[i]= input.nextInt() ; //create array    
    }
    
    
    
    
    for(int j=0;j<Array.length;j++){
    System.out.println(Array[j]);
    }
    
    
}//close main method 





}//close class 