package exercises;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
      String str;
      str="Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do:once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
      String str1=str.toLowerCase();
      Scanner input;

        input = new Scanner(str);
        System.out.println("Result: " + input.hasNext());
        System.out.println("Result: " + str1.contains("alice"));
        System.out.println("Enter the string:");
        Scanner input1 = new Scanner(System.in);
        String  str2=input1.nextLine();
        System.out.println("Enter the searchTerm:");
        String searchstr = input1.nextLine();
        int s=searchstr.length();
        System.out.println(s);
        System.out.println(str2.indexOf(searchstr));
      System.out.println(str2.replace(searchstr,""));

    }
    }
