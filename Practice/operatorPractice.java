//James Rau, CSE 002, 18/04/2015
//Program sample for operator precedence and associativity 
 
public class operatorPractice { // add class and main method respectively 
public static void main (String [ ] args) {
System.out.println(); //print line space 
//8

// [(A + B) + C] + D
/*

int vague = (1/3) + 3; 
int vague1 = 1/3 + 3; 

System.out.println(vague);
System.out.println(vague1);


double value =  ((((2.0/4) + (3*4)) - (12.0/2)) + (1*3)); 
double value1 = 2.0/4 + 3*4 - 12.0/2 + 1*3;
System.out.println(value);
System.out.println(value1);



System.out.println("<<<<1>>>>"); 
System.out.println();

*/













//9 

int x = 5;
int y = 10;
int z = (++x) * (y--); //60
System.out.println(z);

System.out.println("<<<<2>>>>");
System.out.println();



System.out.println("Example1.. 1 + 2 ="  + 1 + 2); //
System.out.println("Example2.. 1 + 2 ="  + (1 + 2));

System.out.println("<<<<3>>>>");
System.out.println();


int year0 = (int)(Math.random ()); // [0-1) 

int year = (int)(Math.random ()*11) + 2000; //generate number [2000-2010]
int year1 = (int) (Math.random ())*(11 + 2000); //[0-0]

System.out.println(year);
System.out.println(year1);


} //close main method 
} //close class 'Operator'