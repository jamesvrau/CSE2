//James Rau, CSE 002, 21/03/2015
//Program for using methods to create a 'game'
import java.util.Scanner; // import scanner class

public class HW08{

public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
public static void cave() {
    
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
public static String getInput(Scanner scan, String string){
    
    string=scan.next();
    
    if (string.equals("C") || string.equals("c")){
        return string;
    }
    else{ 
    System.out.println("Yea right LOSER!"); 
    System.exit(1);
    return string;
    }
}//close method 4. 

    
public static String getInput(Scanner scan, String string, int trial){
    
    string=scan.next();
    
    if (string.equals("A") || string.equals("a") ){
    int random = (int)(Math.random ()*2);  //generate random number [0-1]
            
        if(random==0){ //miss
        System.out.println("Gosh! How can you miss it! ");
        getInput(scan,string,trial);
        }
        
        else{ //random =1, hit
            
            trial=trial-1;
            
                if(trial==0){
                return string;
                }
                else{getInput(scan,string,trial); }
                
            
        }
        
        return string;
    }
    
    else if(string.equals("E") || string.equals("e")){
        int counter = (int)(Math.random()*10)+1; 
        
        if(counter==10){
            return string;
        }
        else{
            getInput(scan,string,trial);
            
        }
        return string;
        
    }
    
    else{
    System.out.println("Executed by GIANT! Game Over!"); //quit 5.
    System.exit(1);
    return string;
    }//
}//close method 
    
public static String getInput(Scanner scan){
    //use switch statements to print out reward 
    String string=scan.next();
    
    
    
    switch (string){
        case "1": System.out.println("GPA 4.00 "); //type in rewards + System.out.println("Hero! Have a good day!");
            break;
        case "2": System.out.println("GPA 5.00 ");
            break;
        case "3": System.out.println("GPA 6.00 ");
            break;
        default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
    }//close switch statement 
    return string; 
} //close string
    
    
public static void main (String[] args) {
        char option; 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave(); //call on cave
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        
} //close main string 


}//close class