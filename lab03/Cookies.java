//Timothy Oak
//cse2
import java.util.Scanner;
//this program is meant to calculate the amount of money each
//person needs to pay when split evenly
public class Cookies {
//PARTT 1: COLLECT DATA FROM CLIENT
    public static void main (String[]args) {
    Scanner myScanner=new Scanner(System.in);
    System.out.print("Enter the original cost of the check in the form $xx.xx: ");
    double checkCost=myScanner.nextDouble(); //collect data: food price without tip
    System.out.print("Enter the percentage tip that you wish to pay as ");
    System.out.print("a whole number in the form xx.");
    float tipPercent=myScanner.nextInt();//collect data: % tip client wants to give
    tipPercent/=100.0;//convert to a decimal for calculations
    System.out.print("Enter the number of people who went out to dinner: ");
    float numPeople=myScanner.nextFloat();//collect data: number of people who are sharing the bill
//PART 2: DO THE CALCULATIONS FOR THE CLIENT
    double totalCost; //variable for the entire cost
    double costPerPerson; //variable for the cost each person takes on
    int dollars, dimes, pennies; //set up variables for use
    totalCost=checkCost*(1+tipPercent);//declares a quatitative value for the entire cost
    costPerPerson=totalCost/numPeople;//declares a quantitative value for cost each person owes
    dollars=(int)costPerPerson;
    dimes=(int)(costPerPerson*10)%10;
    pennies=(int)(costPerPerson*100)%10;
    System.out.println("Each person in the group owes $" + dollars + "." +dimes + pennies);
}
}