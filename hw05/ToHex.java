//James Rau, CSE 002, 22/02/2015
//Program for converting decimals to hexadecimals 
 
import java.util.Scanner; // import scanner class 
public class ToHex { // add class and main method respectively 
public static void main (String [ ] args) {
 

int remainder1; // initialize remainder 1 for modulus 
int remainder2;
int remainder3;

char hexResult[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; // one string variable to convert inputs to hex list

 
Scanner input = new Scanner( System.in ); // create a Scanner for variable 'input'
System.out.print( "Please enter three numbers (separated by space) representing RGB values: " );    

if (input.hasNextInt()){ //check whether values are integers
    int value1 = input.nextInt(); //assign Red to value 1 as integer 
    int value2 = input.nextInt(); //assign Green to value 2 as integer
    int value3 = input.nextInt(); //assign Blue to value 3 as integer 
    
        if(value1>=0 && value2>=0 && value3>=0 && value1<=255 && value2<=255 && value3<=255){ //check whether values are between 0-255 inclusive
            
            remainder1= value1%16 ;
            char hexRemValue1=hexResult[remainder1] ; //match to hexlist string and define remainder number as char variable hexRemValue1
            char hexValue11=hexResult[value1/16] ; //match to hexlist string and define quotient number as hexValue11
            
            remainder2= value2%16 ;
            char hexRemValue2=hexResult[remainder2] ; //second set of values for Green 
            char hexValue22=hexResult[value2/16] ;
            
            remainder3= value3%16 ;
            char hexRemValue3=hexResult[remainder3] ; //third set of values for Blue
            char hexValue33=hexResult[value3/16] ;
            
            //print out everything..
System.out.print( " decimal numbers R:"+ value1 + " G:" + value2 + " B:" + value3 + "representing hexdecimals as " +hexValue11+hexRemValue1+hexValue22+hexRemValue2+hexValue33+hexRemValue3);
            
        }
        else{ System.out.println( " You did not enter integer values between 0-255 " ); //else paired with if for checking values between 0-255
        }


} //close to integer values 

else { System.out.println( " You did not enter integer values " ); //else paired with if for checking input.hasNextInt() 
}

} //close to string
} //close to class 



