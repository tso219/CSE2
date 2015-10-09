//this program checks if a barcode number is valid or not.
import java.util.Scanner;
public class Background{
    public static void main (String[]args){
    //if it's a valid code, it stops. If not, it says it's not valid and repeats the question.
        int digitcheck = 0;
        int valueForDigits = 0;
        int digitManager = 0;
        String identityCorrection = "";
        String digits = "0123456789";
    for(int c=1;c==1;c++){
        Scanner validity = new Scanner(System.in);
        System.out.println("Please enter a 10 digit barcode: ");
        String ISBN = validity.next();
        //variable set-up ends here for
        if(ISBN.length()!=10){
            System.out.println("This is NOT a valid ISBN.");
            c=0;
        }
        else{
            char isItValid = ISBN.charAt(9);
            for(int i=0; i<10; i++){
                for(digitcheck=0; digitcheck<10; digitcheck++){
                    if(ISBN.charAt(digitcheck)== digits.charAt(i)){
                        for(int j=0; j<9; j++){
                        valueForDigits = ISBN.charAt(digitcheck);
                        valueForDigits+=valueForDigits*(10-j);
                           if(valueForDigits%11 == Character.getNumericValue(isItValid)){
                                System.out.println("This is a valid ISBN.");
                            }
                           else{
                                System.out.println("This is NOT a valid ISBN. Check digit should be ");
                                int FinalDigit=digitcheck%11;
                                switch(FinalDigit){
                                        case 1: identityCorrection = "1"; break;
                                        case 2: identityCorrection = "2"; break;
                                        case 3: identityCorrection = "3"; break;
                                        case 4: identityCorrection = "4"; break;
                                        case 5: identityCorrection = "5"; break;
                                        case 6: identityCorrection = "6"; break;
                                        case 7: identityCorrection = "7"; break;
                                        case 8: identityCorrection = "8"; break;
                                        case 9: identityCorrection = "9"; break;
                                        case 10: identityCorrection= "x"; break;
                                    }
                                System.out.print(identityCorrection + ".");
                                digitcheck = 10; //break off of the higher loop
                                i = 10; //break off of the higher-higher loop
                                break;
                            }
                        }
                }
                    else{
                        System.out.println("This is NOT a valid ISBN.");
                        i=-1;
                        digitcheck=10;
                        c = 0;
                        System.exit(1);
                    }
                }
            }
        }
    }
}
}

            