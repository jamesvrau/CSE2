//James Rau, CSE 002, 20/02/2015
//Program for outputting space exploration events 
 
public class SpaceExploration { // add class and main method respectively 
public static void main (String [ ] args) {
    
int year = (int)(Math.random ()*11) + 2000; //generate number [2000-2010]
    
System.out.print ( "Here is a timeline of space exploration events from " +year+ " to 2000 \n" ); //prepare timeline

switch (year) {

    case 2000: 
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    case 2001: 
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break; 
    
    case 2002: 
        System.out.print ( "2002: N/A \n" );
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    case 2003: 
        System.out.print ( "2003: Largest infrared telescope released \n" );
        System.out.print ( "2002: N/A \n" );
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    case 2004: 
        System.out.print ( "2004: N/A \n" );
        System.out.print ( "2003: Largest infrared telescope released \n" );
        System.out.print ( "2002: N/A \n" );
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    case 2005: 
        System.out.print ( "2005: Spacecraft collides with comet \n" );
        System.out.print ( "2004: N/A \n" );
        System.out.print ( "2003: Largest infrared telescope released \n" );
        System.out.print ( "2002: N/A \n" );
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    case 2006: 
        System.out.print ( "2006: Spacecraft returns with collections from a comet \n" );
        System.out.print ( "2005: Spacecraft collides with comet \n" );
        System.out.print ( "2004: N/A \n" );
        System.out.print ( "2003: Largest infrared telescope released \n" );
        System.out.print ( "2002: N/A \n" );
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    case 2007: 
        System.out.print ( "2007: N/A \n" );
        System.out.print ( "2006: Spacecraft returns with collections from a comet \n" );
        System.out.print ( "2005: Spacecraft collides with comet \n" );
        System.out.print ( "2004: N/A \n" );
        System.out.print ( "2003: Largest infrared telescope released \n" );
        System.out.print ( "2002: N/A \n" );
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    case 2008: 
        System.out.print ( "2008: Kepler launched to study deep space \n" );
        System.out.print ( "2007: N/A \n" );
        System.out.print ( "2006: Spacecraft returns with collections from a comet \n" );
        System.out.print ( "2005: Spacecraft collides with comet \n" );
        System.out.print ( "2004: N/A \n" );
        System.out.print ( "2003: Largest infrared telescope released \n" );
        System.out.print ( "2002: N/A \n" );
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    case 2009: 
        System.out.print ( "2009: N/A \n" );
        System.out.print ( "2008: Kepler launched to study deep space \n" );
        System.out.print ( "2007: N/A \n" );
        System.out.print ( "2006: Spacecraft returns with collections from a comet \n" );
        System.out.print ( "2005: Spacecraft collides with comet \n" );
        System.out.print ( "2004: N/A \n" );
        System.out.print ( "2003: Largest infrared telescope released \n" );
        System.out.print ( "2002: N/A \n" );
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    case 2010: 
        System.out.print ( "2010: SpaceX successfully sends spacecraft to orbit and back \n" );
        System.out.print ( "2009: N/A \n" );
        System.out.print ( "2008: Kepler launched to study deep space \n" );
        System.out.print ( "2007: N/A \n" );
        System.out.print ( "2006: Spacecraft returns with collections from a comet \n" );
        System.out.print ( "2005: Spacecraft collides with comet \n" );
        System.out.print ( "2004: N/A \n" );
        System.out.print ( "2003: Largest infrared telescope released \n" );
        System.out.print ( "2002: N/A \n" );
        System.out.print ( "2001: First spacecraft orbits an asteroid \n" );
        System.out.print ( "2000: First spacecraft orbits an asteroid \n" );
    break;
    
    default:
    break; 
    

} //close switch statement 
    
    
    
    } //end of method 
} //end of class