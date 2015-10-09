import java.util.Scanner;
public class BarGraph{
    public static void main (String[]args){
    //step 1: create a ******-bar graph for spending weekly
    Scanner spending = new Scanner(System.in);
    double WeeklyMoneyforYou = 0;
    String weekday = "blah";
    double DailyMoneyforYou=0;
    for(int day=1; day<8; day++){//repeat the below 7 times
        switch(day){
            case 1: weekday = "Monday"; break;
            case 2: weekday = "Tuesday"; break;
            case 3: weekday = "Wednesday"; break;
            case 4: weekday = "Thursday"; break;
            case 5: weekday = "Friday"; break;
            case 6: weekday = "Saturday"; break;
            case 7: weekday = "Sunday"; break;
            }
        System.out.println("Expenses for " + weekday + " :");
        DailyMoneyforYou = spending.nextDouble();
        /*if(spending=String){
        System.out.println("Sorry, you did not enter an integer. Try again: ");    */
        WeeklyMoneyforYou = WeeklyMoneyforYou + DailyMoneyforYou;
        DailyMoneyforYou = (int)(DailyMoneyforYou+0.5);
        System.out.println("");
        for(int a=2; a<=DailyMoneyforYou; a++){//starts at 2 to allow the print lining
        System.out.print("*");
        }
        if(DailyMoneyforYou>=1){//makes up for the missing one above, and makes the line spacing
        System.out.println("*");
        }
    }
   

    //step 2: estimate my long term spending habits
    double GuessingYourNextWeekSpending=WeeklyMoneyforYou*(0.8+Math.random()*0.4);
    GuessingYourNextWeekSpending = (double)((int)(GuessingYourNextWeekSpending*100)/100);
    System.out.println("Your average daily expenses are: $" + (double)((int)(GuessingYourNextWeekSpending/7*100)/100));
    System.out.println("Estimated expenditure for 4 years: $" + GuessingYourNextWeekSpending*208);
    //the 208 represents the 208 weeks (assuming 52 weeks/year)
    
    
    
    }
}