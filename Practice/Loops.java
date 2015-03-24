//practice

public class Loops{
public static void main (String [] args){
    
/* print this below:
0
11
222
3333
44444
55555
6666
777
88
9
*/

int i=0;
int j=0;

for (i=0; i<10; i++){ //prints numbers 0-9
    
    if(i<5){
        
        for(j=0; j<1+i; j++){
        System.out.print(i); 
        }
    
    System.out.println(); 
        
    }//close if statement numbers [0-4]
    
    
    
    
    
    if(i>=5){
        
        for(j=0; j<10-i; j++){
        System.out.print(i);
        }
    System.out.println();
    }
    
}//close for loop 
    
    
    
}
}