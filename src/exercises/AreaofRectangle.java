package exercises;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        Integer length = input.nextInt();
        System.out.println("Enter the breath of Rectangle");
        Integer breath =input. nextInt();
         Integer area= length *breath;
        System.out.println("Enter Area of Rectangle" + area);
    }
}
