import java.util.Scanner;
public class Area{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String shape;
        int i = 0;
        double Area = 0;
        System.out.println("State the name of the shape that will have its area calculated.");
        while(i == 0){
            shape = input.next();
            if(shape == "Rectangle" || shape== "rectangle"){
                i = 1;//stops the loop
                Scanner input1 = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);
                System.out.println("Length of the rectangle?");
                double length = input1.nextDouble();
                System.out.println("Length of the other side of the rectangle?");
                double width = input2.nextDouble();
                Area = rectangle(length, width);
            }
            else if(shape == "circle"||shape == "Circle"){
                i = 1;//stop the loop
                Scanner input1 = new Scanner(System.in);
                System.out.println("Length of the radius?");
                double radius = input1.nextDouble();
                Area = circle(radius);
            }
            else if(shape == "triangle"||shape == "Triangle"){
                i = 1;//stop the loop
                Scanner input1 = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);
                System.out.println("Height of the triangle?");
                double height = input1.nextDouble();
                System.out.println("Width of the triangle?");
                double width = input2.nextDouble();
                Area = triangle(height, width);
            }
            else{
            System.out.println("This program only calculates rectangles, circles, and triangles.");
            i = 0; //this is put there as a reminder purpose that it would keep the loop going.
            }
        }
        System.out.println("The area is " + Area);
    }
    public static double circle(double radius){
        return 3.1415*radius*radius;
    }
    public static double rectangle(double length, double width){
        return length*width;
        }
    public static double triangle(double height, double width){
        return 0.5*height*width;
    }
}