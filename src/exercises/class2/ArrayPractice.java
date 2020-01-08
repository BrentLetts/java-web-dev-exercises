package exercises.class2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {


    public static void main(String[] args) {
        Integer numArray[] = {1, 1, 2, 3, 5, 8};
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //loop and print each value
        for(int num : numArray){
            //now just print the odd numbers
            if(num % 2 != 0){
                System.out.println(num);
            }
        }

        String sentenceArray[] = sentence.split("\\. ");

//        System.out.println(Arrays.toString(sentenceArray));
        for(String word : sentenceArray){
            System.out.println(word);
        }
    }


}
