public class Loops1{
public static void main(String[] args){
    
/*
6666
666
66
6
555
55
5
44
4
3 * (pattern stops)
2 *
1 *

*/
//int i, j, k;

for (int i=6; i>0; i--){ //counts down numbers [6-1]
    
    if(i-2<=0){
        System.out.println(i);
        continue; 
    }
    
    
    
for(int j=0; j<i-2; j++){
        
        for(int k=0; k<i-2-j; k++){
            System.out.print(i);
        }
        System.out.println();
    }
    
    
}//close for loop s
    
}
}