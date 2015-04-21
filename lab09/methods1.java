//James Rau, CSE 002, 31/03/2015
//Program for practicing methods and generating random sentences 


import java.util.Random; // import random 

public class methods1 { // add class and main method respectively

public static void main (String [ ] args) {
    
Random randomGenerator1 = new Random(); 
Random randomGenerator2 = new Random();
Random randomGenerator3 = new Random();
Random randomGenerator4 = new Random();
Random randomGenerator5 = new Random();
Random randomGenerator6 = new Random();

int randomInt1= randomGenerator1.nextInt(10);//include (0-10) non inclusive 
int randomInt2= randomGenerator2.nextInt(10);
int randomInt3= randomGenerator3.nextInt(10);
int randomInt4= randomGenerator4.nextInt(10);
int randomInt5= randomGenerator5.nextInt(10);
int randomInt6= randomGenerator6.nextInt(10);

String string1 = adjective(randomInt1);
String string2 = adjective(randomInt2);
String string3 = noun1(randomInt3);
String string4 = verb(randomInt4);
String string5 = adjective(randomInt5);
String string6 = noun2(randomInt6);
    
    System.out.println(" The "+string1+" "+string2+" "+string3+" "+string4+" the "+string5+" "+string6);

} //close main method 
    
    
public static String adjective(int adjectiveInput){
   
    switch (adjectiveInput){
        case 0:
        
    
        case 1: 
            return "bouncy"; 
            
        case 2: 
            return "slow";
           
        case 3: 
            return "speedy";
           
        case 4: 
            return "rachet";
           
        case 5: 
            return "beautiful";
           
        case 6: 
            return "aromatic";
           
        case 7: 
            return "vicious";
           
        case 8: 
            return "fiesty";
           
        case 9: 
            return "boring";
            
        default: 
        System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
        return ""; 
    }//close switch statement 
} //close adjective 



public static String noun1(int subjectInput){
    switch (subjectInput){
        case 0:
        case 1: 
            return "squirrel";
            
        case 2: 
            return "dog";
            
        case 3: 
            return "cat";
            
        case 4: 
            return "man";
           
        case 5: 
            return "child";
           
        case 6: 
            return "women";
            
        case 7: 
            return "dad";
            
        case 8: 
            return "hulk";
            
        case 9: 
            return "owl";
            
        default: 
        System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
          return "";    
    }//close switch statement
}//close method



public static String verb(int verbInput){
    switch (verbInput){
        case 0:
        case 1: 
            return "ran";
            
        case 2: 
            return "dominated";
            
        case 3: 
            return "jogged";
           
        case 4: 
            return "soared";
            
        case 5: 
            return "sauntered";
            
        case 6: 
            return "crawled";
            
        case 7: 
            return "swam";
            
        case 8: 
            return "walked";
            
        case 9: 
            return "sprinted";
            
        default: 
        System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
          return "";    
    }//close switch statement
}//close method


public static String noun2(int objectInput){
    switch (objectInput){
        case 0:
        case 1: 
            return "super-mario";
            
        case 2: 
            return "professor";
            
        case 3: 
            return "Andrew";
            
        case 4: 
            return "Springbok";
            
        case 5: 
            return "elephant";
            
        case 6: 
            return "partner";
            
        case 7: 
            return "crocodile-mate";
            
        case 8: 
            return "giraffe";
            
        case 9: 
            return "monkey";
            
        default: 
        System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
           return "";   
    }//close switch statement
}//close method 

    
    

}//close class 