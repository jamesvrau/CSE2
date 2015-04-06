//James Rau, CSE 002, 31/03/2015
//Program for practicing methods and generating random sentences 


import java.util.Random; // import random 

public class methods1 { // add class and main method respectively

int randomInt1= randomGenerator.nextInt(10);//include (0-10) non inclusive 
int randomInt2= randomGenerator.nextInt(10);
int randomInt3= randomGenerator.nextInt(10);
int randomInt4= randomGenerator.nextInt(10);
int randomInt5= randomGenerator.nextInt(10);
int randomInt6= randomGenerator.nextInt(10);


public static void main (String [ ] args) {

adjective(randomInt1);
adjective(randomInt2);
noun1(randomInt3);
verb(randomInt4);
adjective(randomInt5);
noun2(randomInt6);
    
    System.out.println(" The "+adjectiveInput+adjectiveInput+subjectInput+verbInput+" the "+adjectiveInput+objectInput);

} //close main method 
    
    
public static int adjective(int adjectiveInput){
   
    switch (adjectiveInput){
        case "1":
            return "bouncy"
            break;
            
        case "2": 
            break;
            
        case "3": 
            break;
            
        default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
    }//close switch statement 
    return string; 
}



public static String noun1(int subjectInput){
}

public static String verb(int verbInput){
}

public static String noun2(int objectInput){
}

    
    

}//close class 