// James Rau, 10/30/2015 CSE02
// Bicycle cyclometer program to measure time and distance of each trip

// 
public class Cyclometer {
    //main method required for every Java program
    public static void main (String [ ] args) {
        
        int secsTrip1=480; // time in minutes trip 1
        int secsTrip2=3220; // time in minutes trip 2
        int countsTrip1=1561; // distance trip 1
        int countsTrip2=9037; // distance trip 2
        
        double wheelDiameter=27.0, //wheel diameter defined
        PI=3.14159, // Value of pi
        feetPerMile=5280, // feet definition
        inchesPerFoot=12, // inch definition 
        secondsPerMinute=60; // time definition 
        double distanceTrip1, distanceTrip2, totalDistance; //double variables 
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
    //run the calculations; store the values. 
    
    
        //distance in inches 
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //For each count, a rotation of the hweel travels the diameter in inches times Pi
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2; //initialize total distance 
        
        
        //Print out the output data
        
        System.out.println("Trip1 was "+distanceTrip1+" miles");
        System.out.println("Trip2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
        
    } //end of main method 
} //end of class 