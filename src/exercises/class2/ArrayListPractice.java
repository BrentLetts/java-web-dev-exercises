package exercises.class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        String sentence = "I, would, not, could, not, in, a, box, I, would, not, could, not, with, a, fox, I, will, not, eat, them, in, a, house, I, will, not, eat, them, with, a, mouse.";

        numList.add(3);
        numList.add(25);
        numList.add(60);
        numList.add(55);
        numList.add(24);
        numList.add(12);
        numList.add(35);
        numList.add(21);
        numList.add(30);
        numList.add(20);
        addEven(numList);
        printWord(sentence);
        userInput(sentence);
    }

    public static void addEven(ArrayList<Integer> list){
        int sum = 0;
        for(int i : list){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void printWord(String list){
        String str[] = list.split(", ");
        List<String> sL = new ArrayList<String>();
        sL = Arrays.asList(str);
        for(String s : sL){
            if(s.length() == 5){
                System.out.println(s);
            }
        }
    }

    public static void userInput(String list){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int input = scanner.nextInt();
        scanner.close();

        String str[] = list.split(", ");
        List<String> sL = new ArrayList<String>();
        sL = Arrays.asList(str);
        for(String s : sL){
            if(s.length() == input){
                System.out.println(s);
            }
        }
    }
}
