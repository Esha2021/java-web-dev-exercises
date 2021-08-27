package studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        double pi = 3.14;
        Scanner input;
        input = new Scanner(System.in);
        //System.out.println("Enter the radius:");
        //radius= input.nextFloat();
        //input.close();
        do {
            System.out.println("Enter the radius:");
            if (input.hasNextDouble()) {
                //System.out.println("Enter the radius:");
                radius = input.nextDouble();

                if (radius > 0) {
                    double area = circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
               } //else if (radius < 0) {
//                    System.out.println("Enter positive number");
//                }
            } else {
                radius=-1;
                System.out.println("please Enter the number");
                 input.next();
               //System.out.println("Enter  number");
            }

        }while(radius<=0);
    }
}
