package exercises;

import java.util.Scanner;
public class MilesperGallon {
    public static void main(String[] args) {
        int drivenmiles;
        int gasconsumed;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driven miles:");
        drivenmiles = input.nextInt();
        System.out.println("Enter the  gas consumed:");
        gasconsumed = input.nextInt();
        input.close();
        int milespergallon= drivenmiles/gasconsumed;
        System.out.println(" miles per gallon :" + milespergallon + "MPG");


    }
    }



