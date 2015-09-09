//class name
public class Arithmetic{
//main met
    public static void main (String []args) {
 //Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;
//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;
//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
//tax cost
double taxPercent=0.06;

//calculation 1: total cost of each kind of item
//and sales tax, separate from the item.
    //socks costs
    System.out.print("The total price of socks is $");
        //these steps eliminate unneccesary digits
        //in out for the socks total cost
        double part$Sock=(100*nSocks*sockCost$);
        float Total$Socks=(int)part$Sock/(float)100.0;   
    System.out.println(Total$Socks);
        //these steps eliminate unneccesary digits
        //in output for the socks total sales tax cost.
        double part$SockTax=(100*nSocks*sockCost$*taxPercent);
        float Total$SocksTax=(int)part$SockTax/(float)100.0;
    System.out.print("The total sales taxes of socks is $");
    System.out.println(Total$SocksTax);
    //drinking glasses costs
    System.out.print("The total price of drinking glasses is $");
        //these steps eliminate unneccesary digits in print.out
        //in output for the glasses total cost.
        double part$Glasses=(100*nGlasses*glassCost$);
        float Total$Glasses=(int) part$Glasses/(float)100.0; 
    System.out.println(Total$Glasses);
        //these steps eliminate unneccesary digits in print.out
        //in output for the glasses total sales tax cost.
        double part$GlassesTax=(100*nGlasses*glassCost$*taxPercent);
        float Total$GlassesTax=(int) part$GlassesTax/(float)100.0;
    System.out.print("The total sales taxes of drinking glasses is $");
    System.out.println(Total$GlassesTax);
    //envelopes costs
    System.out.print("The total price of envelope is $");
        //these steps eliminate unneccesary digits in print.out
        //in output for envelope total cost.
        double part$Envelope=(100*nEnvelopes*envelopeCost$);
        float Total$Envelope=(int) part$Envelope/(float)100.0; 
    System.out.println(Total$Envelope);
        //these steps eliminate unneccesary digits in print.out
        //in output for the envelopes total sales tax cost.
        double part$EnvelopeTax=(100*nEnvelopes*envelopeCost$*taxPercent);
        float Total$EnvelopeTax=(int) part$EnvelopeTax/(float)100.0;
    System.out.print("The total sales tax of envelope is $");
    System.out.println(Total$EnvelopeTax);

//calculation 2: total cost of purchases (before tax)
    //the following calculates the total sales cost before taxes
    float TotalWithoutTax=(Total$Glasses+Total$GlassesTax+Total$Envelope);
    //the following generates an output for the total without taxes
    System.out.print("The total price of all products before tax is $");
    System.out.println(TotalWithoutTax);
//calculation 3: total actually paid for this
    //calculations for the total taxes
    float TotalTax=(Total$SocksTax+Total$GlassesTax+Total$EnvelopeTax);
    //calculation for the real total
    float Total1=(TotalWithoutTax+TotalTax);
    //turn the answer back to a $xx.xx format
    float Total2=(int)(Total1*100);
    float Total=Total2/100;
    //this is the output for the real total
    System.out.print("The total price of all products including tax is $");
    System.out.println(Total);
//transaction, including sales tax
}
}//end of the class