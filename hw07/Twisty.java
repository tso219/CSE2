import java.util.Scanner;
public class Twisty{
    public static void main (String[]args){
        //starting off with length of the double helix rectangle
        Scanner input = new Scanner(System.in);
        String lengthInput;
        int length = 0;
        System.out.println("State the length of the double helix");
        do{
            lengthInput = input.next();
                if(input.hasNextInt()==true){
                    length = Integer.parseInt(lengthInput);
                    if(length<=80&&length>0){
                        continue;
                    }
                    else
                    System.out.println("ERROR: length needs to be between 0 and 80");
                }
                else
                System.out.println("ERROR: state a numeric value between 0 and 80");
        }while(input.hasNextInt()==false);
        //width of the the double helix rectangle
        Scanner input2 = new Scanner(System.in);
        String widthInput;
        int width = 0;
        System.out.println("State the width of the double helix");
        do{
           widthInput = input2.next();
               if(input2.hasNextInt()==true){
                   width = Integer.parseInt(widthInput);
                   if(width<length&&width>0){
                    }
                   else
                   System.out.println("ERROR: width must be smaller than length");
                }
                else
                System.out.println("ERROR: state a numeric value between 0 and " + length);
        }while(input2.hasNextInt()==false);
        //actual graphing starts
        for(int a = 1; a+1<length; a++){
            for(int b = 1; b+1<width; b++){
                if((a/b)%2==0 && b%(2*a)==a){//downward slope #
                    System.out.print("#");
                }
                else if((a/b)%2==1 && (length-a/b)%2==9){//downward slope \
                    System.out.print("\\");
                }
                else if((a/b)%2==0 && (width-(b-1)==a)){//upward slope /
                    System.out.print("/");
                }
                else if((a/b)%2==1 && a == 2*width-b){//upward slope #
                    System.out.print("#");
                }
                else
                System.out.print(".");
            }
            System.out.println("");
        }
    }//end of main method
}//end of the class 