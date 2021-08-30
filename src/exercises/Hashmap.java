package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Hashmap {



    public static void main(String[] args) {

        HashMap<String,Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newStudent, newID);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        //double sum = 0.0;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " Id:" + student.getValue() );
            //sum += student.getValue();
        }

        //double avg = sum / students.size();
        //System.out.println("Average grade: " + avg);
    }
}
