package vowelorconsonant;

import java.util.Scanner;

public class vowelORconsonant {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
        System.out.println("enter 'exit' anytime to stop the program");
        System.out.println("------------------------------------------------------");
        System.out.print("Enter a letter: ");
        String letter = input.next();
        if(letter.equals("exit"))
            System.exit(1);

        if(letter.length() != 1){
            System.out.println("Please enter one letter");
            System.out.println("------------------------------------------------------");
            
        }else {
             if(letter.equals("a") || letter.equals("e")
                || letter.equals("i") || letter.equals("u")
                || letter.equals("o") || letter.equals("y")){
                    System.out.println(letter + " is a vowel");
                    System.out.println("------------------------------------------------------");
                }else{
                    System.out.println(letter + " is a consonant");
                    System.out.println("------------------------------------------------------");
                }
            }
        }
    }
}
