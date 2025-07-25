import java.util.*;

public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // This section is commented out. It takes age input and checks if the user is eligible to vote or drive.
        /*
        System.out.println("Enter Your age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Your age is "+age +" and You are Eligible to Vote and Drive ");
        }
        else{
            System.out.println("Your age is "+age +" and You are Not Eligible to Vote and Drive ");
        }
        */

        // This section determines the largest of two numbers.
        /*
        int num1, num2;

        System.out.println("Enter Number 1 :");
        num1 = sc.nextInt();
        System.out.println("Enter Number 2 :");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 +" is Greater Between " +num1 +" & "+  num2 );
        }
        else if(num1 == num2){
            System.out.println(" Both are Equal Between " +num1 +" & "+  num2);
        }
        else{
            System.out.println(num2 +" is Greater Between " +num1 +" & "+  num2 );
        }
        */

        // This section checks whether a number is odd or even.
        /*
        System.out.println("Enter Number to Check Odd or Even : ");
        int Number = sc.nextInt();

        if(Number%2 == 0){
            System.out.println(Number + " is Even ");
        } else{
            System.out.println(Number + " is Odd");
        }
        */

        // Income Tax Calculator
        /*
        System.out.println("Enter Your Income(in INR) for Tax Calculation (Avoid Decimal ): ");
        int Income = sc.nextInt();
        int MC = 800000; // Middle Class threshold
        int UMC = 2000000; // Upper Middle Class threshold
        int RC = 10000000; // Rich Class threshold

        if(Income < MC){
            System.out.println("Your Income is : " + Income + " You are giving 0% Tax to the Government of India ");
        }
        else if(Income >= MC && Income < UMC){
            System.out.println("Your Income is : " + Income + " You are giving 20% Tax: " + (int)(Income*0.2));
        }
        else if(Income >= UMC && Income <= RC){
            System.out.println("Your Income is : " + Income + " You are giving 30% Tax: " + (int)(Income*0.3));
        }
        else if(Income > RC){
            System.out.println("Your Income is : " + Income + " You are giving 35% Tax: " + (int)(Income*0.35));
        } else{
            System.out.println("Enter Valid Income ");
        }
        */

        // Largest of Three Numbers
        /*
        System.out.println("Enter three numbers to find the greatest:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A > B && A > C){
            System.out.println(A + " is the Greatest ");
        }
        else if(B > A && B > C){
            System.out.println(B + " is the Greatest ");
        }
        else if(C > A && C > B){
            System.out.println(C + " is the Greatest ");
        }
        else {
            System.out.println("Some numbers are equal or invalid input.");
        }
        */

        // Ternary Operator
        /*
        int num = 11;
        String OE = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(OE);

        int marks = 85;
        String PF = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(PF);
        */

        // Switch Statement Example (Simple Menu for a Calculator)
        System.out.println("Choose an Operator : \n 1 : + \n 2 : - \n 3 : * \n 4 : / \n 5 : % ");
        int operator = sc.next().charAt(0);

        switch(operator){
            case 1:
            case '+': // Addition
                System.out.println("You selected Addition. Enter two numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
            case '-': // Subtraction
                System.out.println("You selected Subtraction. Enter two numbers:");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                System.out.println("Subtraction = " + (a1 - b1));
                break;

            case 3:
            case '*': // Multiplication
                System.out.println("You selected Multiplication. Enter two numbers:");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                System.out.println("Multiplication = " + (a2 * b2));
                break;

            case 4:
            case '/': // Division
                System.out.println("You selected Division. Enter two numbers:");
                int a3 = sc.nextInt();
                int b3 = sc.nextInt();
                System.out.println("Division = " + ((float) a3 / b3)); // Typecast to float for precision
                break;

            case 5:
            case '%': // Modulo
                System.out.println("You selected Modulo (%). Enter two numbers:");
                int a4 = sc.nextInt();
                int b4 = sc.nextInt();
                System.out.println("Remainder = " + (a4 % b4));
                break;

            default:
                System.out.println("Please enter a valid choice.");
        }

        sc.close();
    }
}
