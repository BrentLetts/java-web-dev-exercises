package exercises.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentID;

        System.out.println("Enter the students ID number then name (or Enter to finish):");

        //get the ID's and Names
        do{

            System.out.print("Student ID: ");
            studentID = input.nextLine();
//            if(studentID.isEmpty() || studentID.equals("")){
//                break;
//            }
            if(!studentID.equals("")){
                int id = Integer.parseInt(studentID);
                System.out.print("Name: ");
                String name = input.nextLine();
                students.put(id, name);

                //Read in the next line
                input.nextLine();
            }

        }while (!studentID.isEmpty());
        input.close();

        //Print the roster
        System.out.println("\nClass Roster:");;
        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
