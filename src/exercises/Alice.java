package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String openSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

//        boolean isInSentence;
        String userInput;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a word that might be in the first sentence of Alice's Adventures in Wonderland.");
        userInput = scanner.nextLine();



        System.out.println(isInSentence(openSentence, userInput));


    }
    public static String isInSentence(String openSentence, String userInput){
        if(openSentence.toLowerCase().contains(userInput.toLowerCase())) {
            return userInput + " is located at index of " + openSentence.indexOf(userInput) + " the sentence.";
        }
        else
            return userInput + " does not exist in the sentence";
    }
}
