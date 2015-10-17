import java.util.Scanner;
public class encrypted_x{
    public static void main(String[]args){
        Scanner toScan = new Scanner(System.in);
        System.out.println("How big do you want the message to be?");
        String squareSide = "";
/*        for(int c=0; c==0; c++){ //the variable c is used for determining whether the loop stops or not.
            while(toScan.hasNextInt() == false){*/
                System.out.println("Name a number between 0 and 100");
                squareSide = toScan.next();
                /*c=-1; //-1 + 1 = 0 so it stays 0 and loop repeats.
            }
            if(toScan.hasNextInt() == true){*/
                int hiddenCodeSize = Integer.parseInt(squareSide);
                /*if(hiddenCodeSize>100||hiddenCodeSize<0){
                    System.out.println("Name a number between 0 and 100");
                }//end of if statement prompting user to use number between 0 and 100
                else{*/
                    System.out.println(""); //makes sure the message starts the line after the input line
                    for(int a=0; a<hiddenCodeSize; a++){
                        for (int b=0; b<hiddenCodeSize; b++){
                             if(a==b||hiddenCodeSize-a==b){
                                 System.out.print(".");
                             }
                             else
                             System.out.print("x");
                        }
                        System.out.println("");
                    }//end of the core of this class
                }//end of if-*else* statement checking for numeric size appropriateness
            }//end of if statement that actually does the work
/*        }//end of the outermost for loop checking for String / integer issue
    }//end of main method
}//end of class