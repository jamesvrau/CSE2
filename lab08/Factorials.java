//James Rau, CSE 002, 27/03/2015
//Program for running factorials 


import java.util.Scanner; // import scanner outside of class

public class Factorials { // add class and main method respectively



public static void main (String [ ] args) {
    
    Scanner value = new Scanner( System.in ); // create a Scanner for variable 'in'
    System.out.println( "Enter a super factorial : " ); 
    int supFac = value.nextInt(); //checks integer value
    
    int sum = 0; 
    int i =1;
    
        for(i=1; i<=supFac; i++){
            sum = sum + factorial(i); 
        
        }
        
        print(sum);
}//close main method 
    
    
    

public static int factorial(int input){ //one called method 
    
    int mul =1;
    int i =1; 
        for (i=1; i<=input; i++){
        mul= mul*i;
        
        }
        
        
        return mul; 
    
}//close factorial method




public static void print(int sum){
    
    System.out.println("The super factorial is equal to "+ sum);
    return; 
    
}//close print method 



    

}//close class