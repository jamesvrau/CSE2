//James Rau, CSE 002, 10/04/2015
//Program for searching arrays  

import java.util.Scanner; //import scanner 
import java.util.Arrays; //import 

public class CSE2Linear{
    

public static void main(String [] arg){
    
    int Array1[]=new int [15]; //declare size of array 
    System.out.print("Enter 15 final grades in CSE2: ");
    Scanner scan=new Scanner(System.in);
    
    for (int i=0; i<15; i++){ //for loop for creating the array 
    
        if (!scan.hasNextInt()){
            System.out.println("Input entered is not an integer "); //sort out if not an integer 
            i--;
            String z = scan.next(); //store scan as a string 
            continue; 
        }
        int x = scan.nextInt(); 
        if((x<0) || (x>100)){
            System.out.println("Integer entered is not within the range [0-100]");
            i--;
            continue; 
        }
        
    Array1[i] = x;
    }//close for loop 
    
    
    Arrays.sort(Array1);
    

    String print = "The grades, sorted, are: "; //set up for printing sorted array list 
    print+= listArray(Array1);
    System.out.println(print); //print array list 
    
    
    searchArray(Array1); //call method below for searching value  
    
    
    //shuffle all values// 

    int Array5[] = new int [15]; //array5 size is declared 
    
    for(int i=0; i<Array1.length; i++){
        int target = (int) (Array1.length * Math.random() ); //find random number to swap with 
        int temp =Array1[target];
        Array5[target] = Array1[i]; //swap the values 
        Array5[i]=temp;
    } //close for loop for scrambling
    
    String print5 = "The grades, scrambled, are: "; //set up for printing sorted array list 
    print5+= listArray5(Array5);
    System.out.println(print5); //print array list 
    
    
    searchArray1(Array5); //call method below for searching value

    
}//close main method 
   
   
public static String listArray(int Array1[]){ // method called on to list Array
	String print="{";
	for(int j=0;j<Array1.length;j++){ //code for listing out array 
  	if(j>0){
    	print+=", ";
    }
  	print+=Array1[j];
	}
	print+="} ";
	return print; //send array back up to main method 
    }//close listArray   
    
public static String listArray5(int Array5[]){ // method called on to list Array5 for scrambled 
	String print5="{";
	for(int j=0;j<Array5.length;j++){ //code for listing out array 
  	if(j>0){
    	print5+=", ";
    }
  	print5+=Array5[j];
	}
	print5+="} ";
	return print5; //send array back up to main method 
    }//close listArray
    
    ////////////////////////////////////
    //***** BINARY SEARCH CODE********//
    ////////////////////////////////////
public static void searchArray(int array1 []){  
    System.out.print("Enter a grade to search for: "); //search for specific code 
    Scanner scan=new Scanner(System.in);
    int numSearch = scan.nextInt(); 
    int high = array1.length -1; //element 14 which is the greatest value 
    int low =0; //element i=0 which is the smallest value 
    int mid = (high-low)/2; //midpoint 
    boolean searched = false; 
    
    while((high-low)!=0){
        
        if(array1[mid]==numSearch){ 
            searched = true; //value was found 
            break; 
        }
        else if(array1[mid] > numSearch){ //search the first half of list 
            high = mid; //make the middle of the list the top, to refine search of first half
            mid = (high+low-1)/2; //chase down the number 
        }
        else{
            low = mid; //make middle of the list the bottom
            mid = (high+low+1)/2;  //search for top half of the list 
        }
        
    }//close while loop 
    
    if(searched){ //if code if found (true) then persist 
        System.out.println(numSearch +" was found in the list");
        System.out.println("Number of iterations were: ");
    }
    else{ System.out.println(numSearch + " was not found in the list"); 
    }
} //close method 
 
 
 
 
 
public static void searchArray1(int array5 []){  
    System.out.print("Enter a grade to search for: "); //search for specific code 
    Scanner scan1=new Scanner(System.in);
    int numSearch1 = scan1.nextInt(); 
    int high = array5.length -1; //element 14 which is the greatest value 
    int low =0; //element i=0 which is the smallest value 
    int mid = (high-low)/2; //midpoint 
    boolean searched1 = false; 
    
    while((high-low)!=0){
        
        if(array5[mid]==numSearch1){ 
            searched1 = true; //value was found 
            break; 
        }
        else if(array5[mid] > numSearch1){ //search the first half of list 
            high = mid; //make the middle of the list the top, to refine search of first half
            mid = (high+low-1)/2; //chase down the number 
        }
        else{
            low = mid; //make middle of the list the bottom
            mid = (high+low+1)/2;  //search for top half of the list 
        }
        
    }//close while loop 
    
    if(searched1){ //if code if found (true) then persist 
        System.out.println(numSearch1 +" was found in the list");
        System.out.println("Number of iterations were: ");
    }
    else{ System.out.println(numSearch1 + " was not found in the list"); 
    }
} 


}//close class

