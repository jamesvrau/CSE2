// James Rau, CSE 002, 08/02/2015
// Program #1 for computing 




// import scanner class 
    import java.util.Scanner;

    
// main method required for every Java program
    public class Bicycle {
        public static void main (String [ ] args) {
            
// declare the variable relating to scanner
    Scanner myScanner; 
    myScanner = new Scanner( System.in );
    
// print out counts to be inputed 
    System.out.print ( 
        "Enter the number of counts on cyclometer (an interger > 0 ) : ");
// accept user input for counts
    int countsTrip = myScanner.nextInt( ) ;
            
// print out seconds to be inputed 
    System.out.print ( 
        "Enter the number of seconds which counts occured (an interger > 0 ): ");
// accepts user input for seconds   
    int secondsTrip = myScanner.nextInt( ) ;
        

// start calculations for distance 
        double wheelDiameter=27.0; //wheel diameter defined
        double PI=3.14159; // Value of pi
        double feetPerMile=5280; // feet definition
        double inchesPerFoot=12; // inch definition 
        double distanceTrip; 
        double totalDistance; // double variables declared 
        
    distanceTrip=countsTrip*wheelDiameter*PI; // distance in inches 
    totalDistance=distanceTrip/inchesPerFoot/feetPerMile; // gives distance in miles 

// start calculations for time

        double secondsPerMinute=60; // time definition 
        double timeTrip=secondsTrip/secondsPerMinute; // convert to minutes 

// Start calculations for average speed
        double hoursTrip=timeTrip/60; //hours of trip
        double averageTrip=totalDistance/hoursTrip; //average MPH
        
// convert values to 2 decimals

        totalDistance=totalDistance*100;
        totalDistance=Math.round(totalDistance);
        totalDistance=totalDistance/100;
        
        timeTrip=timeTrip*100;
        timeTrip=Math.round(timeTrip);
        timeTrip=timeTrip/100;
        
        averageTrip=averageTrip*100;
        averageTrip=Math.round(averageTrip);
        averageTrip=averageTrip/100;
        
// Print values
        System.out.println("The distance was " + totalDistance
        + " and took " +timeTrip + " minutes " ); 
        System.out.println("The average mph of the trip was " + averageTrip); //print mph
        
        } //closure to main method

} //end

