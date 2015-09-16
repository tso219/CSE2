//Timothy Oak
//cse2
//The program will calculate the volume and the surface area of a block
//after prompting the user for the length, width, and height of a block.
import java.util.Scanner;
//class name
public class Block{
    public static void main (String[]args){
        Scanner Block=new Scanner(System.in);
            //this method lets Java take data from the user to calculate the output.
        System.out.println("Enter the length of the block: ");
            //prompts the user to input length.
        double length=Block.nextDouble();
            //takes the data and uses that value for [length]
        System.out.println("Enter the width of the block: ");
            //prompts the user to input width
        double width=Block.nextDouble();
            //takes the data and uses that value for [width]
        System.out.println("Enter the height of the block: ");
            //prompts user to input height
        double height=Block.nextDouble();
            //takes the data and uses the value for [height]
        double volume=length*width*height;
            //formula for volume of rectangular prism
        System.out.print("The volume of the block at dimensions " + length + " x ");
        System.out.println(width + " x " + height + " is " + volume);
        //the system.out was done in 2 separate lines for neatness purposes on coding
        //for a single line output. This is the output for volume that the user receives.
        double SurfaceArea=2*(length*width+length*height+width*height);
            //formula for surface area of a rectangular prism
        System.out.print("The surface area of the block at dimensions " + length + " x ");
        System.out.println(width + " x " + height + " is " + SurfaceArea);
        //the system.out was done in 2 separate lines for neatness purposes on coding
        //for a single line output. This is the output for surface area that the user receives.
    }
}