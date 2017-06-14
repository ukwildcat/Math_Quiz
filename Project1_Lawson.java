/*
 * Project 1 for CS 1180
 * This project demonstrates decision statements and loops.
 * This program will give user choices for a math quiz, ask 5 questions
 * in that category, go back to menu and allow user to choose another quiz
 * or exit program with score.
 */
package project1_lawson;

/**
 * Stacey Lawson 
 * 1180-07 
 * Goshtasby 
 * Project 1: Arithmetic Quiz
 */
import java.util.Scanner;

public class Project1_Lawson 
{

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        //Correct answers variable
        int correct = 0;
        //Count the number of questions
        int count = 0;
        
        //Print welcome statement
                System.out.println("Welcome to the Wright State School of Math!"
                    + "\n");
        
        //Print option menu and start loop to return to menu after 5 questions
        Loop1: while (true)
        {
                System.out.print("Please choose one of the following options"
                + " for your math quiz: \n"
                + "1. Addition with numbers 1-10 \n"
                + "2. Additon with numbers 1-100 \n"
                + "3. Subtraction with numbers 1-10 \n"
                + "4. Subtraction with numbers 1-100 \n"
                + "5. Multiplication with numbers 1-10 \n"
                + "6. Exit the program \n\n");

        //Set up input
        int choice = input.nextInt();
        Loop2: 
        for (int i=0; i<5;i++) {
            //Generate random numbers
            int number1 = (int) (1 + Math.random() * 10);
            int number2 = (int) (1 + Math.random() * 10);
            int number3 = (int) (1 + Math.random() * 100);
            int number4 = (int) (1 + Math.random() * 100);

        //Set up case 1 for addition problems (1-10)
        switch (choice) {

            case 1:
                    System.out.print("Enter the answer to the following problem:"
                            + " " + number1 + " + " + number2 + "\n");
                    
            //Enter answer
            int answerAdd = input.nextInt();

            //Check if correct and print response
                if (number1 + number2 == answerAdd) 
                {
                    System.out.println("That is the correct answer! \n");
                    correct++;
                } 
                else 
                {
                    System.out.println("Sorry, that is incorrect. The "
                        + "correct" + " answer is " + (number1 + number2) 
                        + "\n");
                }
                    
            //Increase question count
                count++;
                break;

            //Set up case 2 for addition problems (1-100)
            case 2:
                    System.out.print("Enter the answer to the following "
                        + "problem: " + number3 + " + " + number4 + "\n");
                    
            //Enter answer
            int answerAdd2 = input.nextInt();

            //Check if correct and print response
                if (number3 + number4 == answerAdd2) 
                {
                    System.out.println("That is the correct answer! \n");
                    correct++;
                } 
                else 
                {
                    System.out.println("Sorry, that is incorrect. The "
                        + "correct" + " answer is " + (number3 + 
                        number4) + "\n");
                }
                        
            //Increase question count
                count++;
                break;
                
            //Set up case 3 for subtraction problems (1-10)
            case 3:
                    System.out.print("Enter the answer to the following "
                        + "problem: " + number1 + " - " + number2 + "\n");
                    
            //Enter answer
            int answerSub1 = input.nextInt();
                    
            //Check if correct and print response
                if ((number1 - number2) == answerSub1) 
                {
                    System.out.println("That is the correct answer! \n");
                        correct++;
                } 
                else 
                {
                    System.out.println("Sorry, that is incorrect. The "
                        + "correct" + " answer is " + (number1 - number2) 
                        + "\n");
                }
                    
            //Increase question count
                count++;
                break;
            
            //Set up case 4 for subtraction problems (1-100)
            case 4:
                    System.out.print("Enter the answer to the following "
                        + "problem: " + number3 + " - " + number4 + "\n");
                    
            //Enter answer
            int answerSub2 = input.nextInt();
                    
            //Check if correct and print response
                if ((number3 - number4) == answerSub2)
                {
                    System.out.println("That is the correct answer! \n");
                        correct++;
                } 
                else 
                {
                    System.out.println("Sorry, that is incorrect. The "
                        + "correct" + " answer is " + (number3 - number4) +
                        "\n");
                }
                        
            //Increase question count
                count++;
                break;
                        
            //Set up case 5 for multiplication problems (1-10)        
            case 5:
                    System.out.print("Enter the answer to the following "
                        + "problem: " + number1 + " * " + number2 + "\n");
                    
            //Enter answer
            int answerMult = input.nextInt();
                    
            //Check if correct and print response
                if ((number1 * number2) == answerMult) 
                {
                    System.out.println("That is the correct answer! \n");
                        correct++;

                } 
                else 
                {
                    System.out.println("Sorry, that is incorrect. The "
                        + "correct" + " answer is " + (number1 * number2) + 
                        "\n");
                }
                        
            //Increase question count
                count++;
                break;
                        
            //Set up case 6 to exit loop
            case 6: 
                    System.out.print("");
                    break Loop1;
            
            //Set up error message if invalid choice entered
            default: 
                    System.out.println("Valid choices are 1-6: please re-enter");
                    break Loop2;
            }   
            }
            
            
        }
            //Calculate number of problems correct and average
            double average = ((double) correct/ (double)count) * 100;
                
                    System.out.printf("You got " + correct + " problems correct"
                        + " out of " + count + " problems attempted. That "
                        + "is %.2f",average);
                    System.out.println(" percent correct.  Goodbye!");
                    
    }
}
 


