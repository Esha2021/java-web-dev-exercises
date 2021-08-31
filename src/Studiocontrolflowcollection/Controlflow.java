package Studiocontrolflowcollection;



import java.util.HashMap;
import java.util.Map;
import  java.util.Scanner;

public class Controlflow {
    public static void main(String[] args) {
        int count = 0;
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        str = input.nextLine();
       // String str1="hello";
        char[] charactersInString = str.toCharArray();
        HashMap<Character, Integer> characterArray = new HashMap<>();
        // char[] checkstring=charactersInString;
        //System.out.println(charactersInString[0]);
        for (char character : charactersInString) {
            // System.out.println(charactersInString[i])
            if (characterArray.containsKey(character)) {
                characterArray.put(character, characterArray.get(character) + 1);
            } else {
                characterArray.put(character, 1);
            }

        }
        for (Map.Entry<Character, Integer> character1 : characterArray.entrySet()) {
            System.out.println(character1.getKey() + "(" + character1.getValue() + ")");
        }
    }
}

//        for (int i=0; i<charactersInString.length ;i++) {
//            for (int j=0;j<checkstring.length;j++) {
//               if(charactersInString[i]==checkstring[j])
//               {
//                   System.out.println(charactersInString[i]);
//                    count++;
//                   System.out.println(count);
//               count}



