import java.util.Scanner;

public class Practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Question 1: Check if a number is positive, negative, or zero
        // System.out.print("Enter a number: ");
        // int check = sc.nextInt();
        // if (check > 0) {
        //     System.out.println(check + " is Positive Number");
        // } else if (check < 0) {
        //     System.out.println(check + " is Negative Number");
        // } else {
        //     System.out.println("Number is Zero");
        // }

        // Question 2: Check body temperature and classify fever levels
        // System.out.print("Enter Your Body Temperature : ");
        // float temp = sc.nextFloat();
        // if (temp < 100) {
        //     System.out.println("You don't have a fever");
        // } else if (temp >= 100 && temp < 110) {
        //     System.out.println("You have a fever");
        // } else if (temp > 110 && temp < 118) {
        //     System.out.println("You have a High fever");
        // } else {
        //     System.out.println("Please Enter Correct Value");
        // }

        // Question 3: Print the day of the week based on user input (1-7)
        // System.out.println("Enter Week Number (1 - 7) : ");
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Please Enter Correct Day Value");
        // }

        // Question 4: Check if a year is a leap year
        System.out.println("Enter Year :");
        int year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " Not a Leap Year");
        }

        sc.close();
    }
}

/*
Additional Important Notes:
1. The Scanner object "sc" should always be closed after use to prevent resource leaks.
2. Leap year logic: A year is a leap year if it is divisible by 400, or divisible by 4 but not by 100.
3. Switch statements are useful when dealing with multiple cases efficiently.
4. Always validate user inputs to prevent errors in execution.
5. When checking conditions, use parentheses to improve readability.
6. Java follows a "short-circuiting" approach in logical operations, meaning conditions are evaluated from left to right.
7. For floating-point comparisons, avoid direct equality checks; instead, use an acceptable margin of error.
*/
