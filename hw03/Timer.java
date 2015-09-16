//Timothy Oak
//cse2
//this program allows a user to find out how much time is left
//until (s)he needs to eat dinner, given the current time
//and planned dinner time.
import java.util.Scanner;
//class name
public class Timer{
    public static void main (String[]args){
        Scanner Time=new Scanner(System.in);
            //this method allows the user to input the data for calculations.
        System.out.println("Enter the current time in form of HHMM: ");
            //enter the current time in form of (2nd digit hour),(1st digit hour),(2nd digit minite,),(1st digit minute).
        int CurrentTime=Time.nextInt();//this is the data [current time] that gets put in by the user.
        System.out.println("Enter the time that you will be eating dinner in form of HHMM: ");
            //enter the current time in form of (2nd digit hour),(1st digit hour),(2nd digit minite,),(1st digit minute).
        int DinnerTime=Time.nextInt();//this is the data [dinner time] that gets put in by the user.
        int RemainingHH,RemainingMM;//set up the variables so that Java can utilize them
        RemainingHH=(int)((DinnerTime-CurrentTime)/100);//this mathematical formula induces Java into only looking at
                                                        //non-minute digits by making it ignore the 1st 2 digits.
            if((DinnerTime-(int)(DinnerTime/100)*100)-(CurrentTime-(int)(CurrentTime/100)*100)<0)
            //in plain English: if DinnerTime minute digits are greater than CurrentTime minute digits...
            //this helps this program account for the error that may occur with minute system,
            //which is based on 60 rather than tens.
                {
                RemainingMM=60+(DinnerTime-(int)(DinnerTime/100)*100)-(CurrentTime-(int)(CurrentTime/100)*100);
                }
           else{
               //if there will be no issues arising due to base-60, this formula will be used.
                RemainingMM=(DinnerTime-(int)(DinnerTime/100)*100)-(CurrentTime-(int)(CurrentTime/100)*100);
               }
        System.out.println("You have " + RemainingHH + " hours and " + RemainingMM + " minutes until dinner.");
            //This is the final output of the program for the user.
   }
   }
   