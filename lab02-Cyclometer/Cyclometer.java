//Timothy Oak
//CSE2
//September 4, 2015
//this program measures the speed, distance, and time on a bicycle.
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args)  {
    //input data
    int secsTrip1=480; //number of seconds in trip 1
    int secsTrip2=3220; //number of seconds in trip 2
    int countsTrip1=1561; //number of rotations for trip 1
    int countsTrip2=9037; //number of trips for trip 2
    //more data
    double wheelDiameter=27.0, // this is how long the distance aroudn the wheel is
    pi=3.14159, //circumfirence over radius ratio
    feetPerMile=5280, //there are 5280 feet in a mile
    inchesPerFoot=12, //there are 12 inches in a foot
    secondsPerMinute=60; //ther are 60 seconds in a minute
    double distanceTrip1, distanceTrip2, TotalDistance;
    System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute)
        + " minutes and had " + countsTrip1 + " counts.");
    System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute)
        + " minutes and had " + countsTrip2 + " counts.");
        //above gives distance in inches
        //a rotation of a wheel drags the distance equivalent to
        //diameter (in inches) times pi.
        //
        //distance traveled
    distanceTrip1=countsTrip1*wheelDiameter*pi/feetPerMile/inchesPerFoot;
    distanceTrip2=countsTrip2*wheelDiameter*pi/feetPerMile/inchesPerFoot;
    double totalDistance=distanceTrip1+distanceTrip2;
    System.out.println("Trip 1 was " + distanceTrip1 + " miles");
    System.out.println("Trip 2 was " + distanceTrip2 + " miles");
    System.out.println("The total distance was " + totalDistance + " miles");
        
} //end of main method
} //end of class