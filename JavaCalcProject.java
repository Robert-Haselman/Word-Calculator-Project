/*
Robert Haselman
CEST 3600
Dr. Jared Oluoch
Final Project
05/01/2020
Summary: Calculator program that takes two user inputs of numbers
and one user input of an operator and then outputs the computation
in word form except for the answer
*/
import java.util.Scanner;

public class JavaCalcProject {
	
	/*
	This is the main method where we are initializing our variables,
	getting user input through the scan utility by calling the 
	numToString method, using a switch statement to determine the
	operator the calculator will use, and then it will compute the inputs
    and output the answer.	
	*/
	
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Word Calculator.");
        System.out.println("You will be asked to enter two numbers.");
        System.out.println("Then you will enter an operator.");
        System.out.println("Finally, the inputs will be calculated.");
        System.out.println("");

        System.out.println("Please enter a number 0-9:");
        int x = scan.nextInt();
        String X = numToString(x);

        System.out.println("Please enter a number 0-9:");
        int y = scan.nextInt();
        String Y = numToString(y);
 
        System.out.println("Please enter an operator.");
        String o = scan.next();
        String O = "";

        int answer = 0;

        switch(o){ 

			case "+": O = " plus ";
                answer = x+y; break;
				
			case "-": O = " minus ";
                answer = x-y; break;
				
			case "*": O = " multiplied by ";
                answer = x*y; break;
				
			case "^": O = " to the power ";
				answer = (int) Math.pow(x,y); break;

			case "/":
				O = " divided by ";
                
				if(y == 0) {												
                    System.out.println("Division by zero is not allowed"); //Here we prevent a math error by dividing a number by zero
					System.exit(0);
                }
			
                answer = x/y; break;

			default: System.out.println("Invalid operator") //The program will end here if an invalid input is entered
			;System.exit(0);

        }

        System.out.println(X + O + Y +" is " + answer); //The output of the computed answer

    }
	
	/*
	Here we have the method for taking the number input and turning it into the word form of the number.
	The only reason we are using a method to do this is because we are reducing redudancy by having to code
	in the same switch statement twice.
	*/
	
    public static String numToString(int x){

        switch(x){

            case 1:return "one";

            case 2:return "two";

            case 3:return "three";

            case 4:return "four";

            case 5:return "five";

            case 6:return "six";

            case 7:return "seven";

            case 8:return "eight";

            case 9:return "nine";

            case 0:return "zero";

            default: System.out.println("Invalid number");System.exit(0); //Ending the program if in an invalid input is entered
        }
		
        return "";
    }
}