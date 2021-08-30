package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Scanner inputstr = new Scanner(System.in);
        System.out.println(" Enter 10 integer number:");

        for (int i = 0; i <= 10; i++) {
            int inputnumber = input.nextInt();
            numbers.add(inputnumber);
        }
        System.out.println(numbers);
        System.out.println(sumeven(numbers));
        System.out.println("Entet the string: ");
        for (int j = 0; j<= 10; j++) {
            String str = inputstr.next();
            strings.add(str);
        }
        wordlength(strings);
    }
    public static int wordlength(ArrayList<String> strings){

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == 5){
                System.out.println("The value is: " + strings.get(i));
            }
        }
        return 0;
    }
    public static int sumeven(ArrayList<Integer> numbers){
        int sum=0;
        for(int num :numbers){
            if(num%2==0){
                sum+=num;
            }
        }return sum;
    }
}

