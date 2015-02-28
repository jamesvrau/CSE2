//James Rau, CSE 002, 26/02/2015
//Program for printing smilie faces 


public class SmileGenerator { // add class and main method respectively 
public static void main (String [ ] args) {

int value = (int)(Math.random ()*100 +1); //generates integer 1-100 
int smileNum=0; 
int lineNum=1;

//input = 'input counter' to compare to final random number generated
//smileNum = smile count needed to be printed on filling current line 
//lineNum = max number smile's allowed on current line

for(int input=0; input<value; input++){ 
    
        smileNum++;
        
        if(smileNum==lineNum){
        System.out.println( ":)");
        smileNum = 0;
        lineNum++;
        
        }
    
        else{System.out.print( ":)" ); 
        }
    
} //close for loop

} //close main 
} //close class



/* (print 30 per line only)
for(int i=0; i<value; i++){
    
    line++;
        
        if(line==30){
        System.out.println( ":)");
        line=0;
        }
    
        else{System.out.print( ":)" ); 
        }
*/