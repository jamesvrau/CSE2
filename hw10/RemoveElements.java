//James Rau, CSE 002, 3/04/2015
//Program for arrays and methods 

import java.util.Scanner;

public class RemoveElements{
    

public static void main(String [] arg){
Scanner scan=new Scanner(System.in); 
	
int num[]; //declaration of arrays
int newArray1[];
int newArray2[];
int index,target; //variables declared 
String answer=""; 
	
	
	do{
  	System.out.print("Random input 10 ints [0-9]"); //print statement 
  	num = randomInput(); //calls method which will produce the array below 
  	String out = "The original array is:";
  	out += listArray(num); //call method listArray for format 
  	System.out.println(out); //prints out the list of 10 positions (actually array) of [0-9] integers 
 
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt(); //check whether index is integer greater than 0
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(newArray1,target); //store newest array newArray1
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.println("Go again? Enter 'y' or 'Y', anything else to quit-"); //ask to repeat method, because do-while loop - will run at least once
  	answer=scan.next();
	} 
	
	while(answer.equals("Y") || answer.equals("y")); //accept only Y or y to repeat 
	
  }//close main method 

                     
                      //<<methods called during main method>>//
                      
  public static String listArray(int num[]){ // method called on to list Array
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
    }
  	out+=num[j];
	}
	out+="} ";
	return out;
  }//close listArray
   
  
  public static int[] randomInput(){ //must generate 10 random integers [0-9]
  int x[]=new int[10]; //declares the array, x
  int i=0; //starting counter 
          
      for(i=0; i<10; i++){ //this goes through 10 elements 
      x[i] = (int)(Math.random ()*10); ///generates number between [0-9]
      }//close for loop
  return x; //returns the whole array uptop, assigns to num. 
}// close randomInput method
  
  
  
  
  public static int[] delete(int list[], int pos){ //method called delete, it will delete a position within the array 
  
  if (pos>0 && pos<list.length){
    int[] list1 = new int[list.length-1]; //list1 declared for method 
    
    boolean skip = false; //assign the boolean skip to false
    for (int i=0; i<list.length; i++){ //run for loop to entire array 
       
        if(i==pos){ //skip the values i=pos, or the counter goes up until the position needing to be skipped 
        skip = true;
        continue;
        }
        
        if(skip){
          list1[i-1] = list[i]; //every spot skipped, needs to go back one spot to get allignment correct 
        }
        
        else{
        list1[i] = list[i]; 
        }
      
    }
    return list1; //list1 returned uptop 
  
  }//close if statement 
  
  else{ System.out.println (" index is invalid "); //if outside of bounds of array 
  return list; 
  }
  
  }//close method delete 
  
  
  
  public static int [] remove (int list[],int target){ //remove is the name of the method, returning [] array
    
  int counter=0; //counter for keeping track of how many target values there are in the array
  //useful for subtracting from array bounds in order to get correct 
  
  for(int i=0; i<list.length; i++){
      if(target==list[i]){ //finding number counters, or values equal to that of target 
        counter++;
      }
  }
    
    if (counter!=0 ) {
    int[] list1 = new int[list.length-counter]; //initialize list1 - different scope that previous 
    
    int skip = 0; 
    for (int i=0; i<list.length; i++){
      
        if(target==list[i]){
        skip ++; //if the target value equals the array value target, then skip over it 
        continue; 
        }
        list1[i-skip] = list[i]; 
    }//close for loop 
    return list1; 
  
    }//close if statement 
  
  else{ System.out.println (" Element " +target+ "has not been found"); //if target is not in the array 
  return list; //return the list that came into this method 
  }
    
  }//close method remove 

  
}//close the class
