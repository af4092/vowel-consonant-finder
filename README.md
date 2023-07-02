# Vowel-consonant-finder
Simple api which takes letter as an input from the console and shows in the output whether it is a vowel or consonant, and it continues until 'exit' keyword is entered.

- Project is built on gradle building tool, to run the program, enter to the directory where main class is located, the rung the following command './gradlew build'. When building is successful, find executable file *.jar. Then run the following command 'java -jar lib.jar'

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/228436907-eb639584-3a91-4e93-ad0e-da739f93667f.png" alt="Image">
</p>

## [Implementation](https://github.com/af4092/vowel-consonant-finder/blob/main/vowelorconsonant/lib/src/main/java/vowelorconsonant/vowelORconsonant.java)

- The program starts by importing the Scanner class from the `java.util` package, which allows reading user input.
- In the main method, a Scanner object named input is created to read user input.
- The program then enters an infinite loop (while (true)) to continuously prompt for user input.
- Within the loop, it displays a message to enter "exit" at any time to stop the program. It also prompts the user to enter a letter.
- The entered letter is stored in the letter variable.
- If the entered letter is equal to `exit`, the program calls `System.exit(1)` to terminate.
- If the length of the entered letter is not equal to 1, it means the user entered more than one character. In that case, it displays a message asking the user to enter only one letter.
- If the entered letter is a single character, it checks if it is one of the vowels ("a," "e," "i," "u," "o," or "y"). If it matches any of the vowels, it displays a message indicating that the letter is a vowel. Otherwise, it displays a message indicating that the letter is a consonant.
- After each iteration, it prints a line of dashes to separate the outputs.
- The program will continue prompting for input until the user enters "exit" to terminate the program.
