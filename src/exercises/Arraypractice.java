package exercises;


import java.util.Arrays;


public class Arraypractice {
    public static void main(String[] args) {
        int[] arrayvalue= { 1,1,2,3,5,8};

        for(int n : arrayvalue){
            System.out.println(n);
        }
        String str ="I would not, could not, in a box.I would not, could not with a fox.I will not eat them in a house.I will not eat them with a mouse";
        String[] splitedstr = str.split(" ");
        String[] sentence = str.split("\\.");
        System.out.println(Arrays.toString(splitedstr));
        System.out.println(Arrays.toString(sentence));

    }
}
