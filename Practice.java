import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// Print numbers from 1 to 10
        // int count = 1;
        // while(count<=10){
        //     System.out.print(count+" ");
        //     count++;
        // }
// Print numbers from 1 to n
        // System.out.println("\nEnter Number: ");
        // int n = in.nextInt();
        // int i = 1;
        // while(i<=n){
        //     System.out.print(i+" ");
        //     i++;
        // }
// Sum of first N natural numbers
        // int num = 10;
        // int sum = 0;
        // int i1 = 1;
        // while(i1<=num){
        //     sum += i1;
        //     i1++;
        // }
        // System.out.println("Sum of First "+num+"natural numbers = "+sum);
// Print reverse of a number
        // int number = 10899;
        // int reverse = 0;
        // for(; number>0;number/=10){
        //     int lastDigit = number%10;
        //     reverse = (reverse*10+lastDigit);
        // }
        // System.out.println(reverse);
// Reverse the given number 
        // int num2 = 123432;
        // int copy = num2;
        // int reverse1  = 0;
        // for(;copy>0;copy/=10){
        //     int lastDigit = copy%10;
        //     reverse1 = (reverse1*10+lastDigit);
        //     num2 = reverse1;
        // }
        // System.out.println(num2);

// keep entering numbers till user enters a multiple of 10
        // while(true){
        //         System.out.println("Enter multiple of 10: ");
        //         int multi10 = in.nextInt();
        //         if(multi10%10!=0){
        //                 System.out.println(multi10+ " is not a multiple of ten");
        //                 break;
        //         }
        //         System.out.println("You Entered: = "+ multi10);
        // }

// display all numbers entered by user except multiple of 10
        // while(true){
        //         System.out.println("Enter Number (-1 to stop, multiples of 10 will be skipped): ");
        //     int exmulti10 = in.nextInt();
        //     if (exmulti10 == -1) {
        //         System.out.println("Loop stopped by user.");
        //         break;
        //     }
        //         if(exmulti10%10==0){
        //                 continue;
        //         }
        //         System.out.println("You Entered: = "+ exmulti10);
        // }

// Check if a number is prime or not
        // System.out.println("Enter number to Check Prime or not");
        // int checkNum = in.nextInt();
        // boolean isPrime = true;
        // int i = 2;
        // while(checkNum/2 >= i){
        //         if(checkNum%i==0){
        //                 isPrime = false;
        //                 break;
        //         } 
        //         i++;
        // }
        // if(isPrime){
        //         System.out.println(checkNum+" is a Prime Number ");
        // }else{
        //       System.out.println(checkNum+" is Not a Prime Number");  
        // }

// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        // int evenSum = 0;
        // int oddSum = 0;

        // while(true){
        //         System.out.println("Enter Number (0 to stop) ");
        //         int evenOdd = in.nextInt();
        //         if(evenOdd==0){
        //                 break;
        //         }
        //         if(evenOdd%2==0){
        //                 evenSum += evenOdd;
        //         } else{
        //                 oddSum += evenOdd;
        //         }
        // }
        // System.out.println(" Total Even Sum = "+evenSum);
        // System.out.println(" Total Odd Sum = "+oddSum);


// write a program to find the factorial of any number entered by the user.
        // System.out.println("Enter Number to find factorial ");
        // int factnum = in.nextInt();
        // long fact = 1;
        // for(int i=1; i<=factnum; i++){
        //         fact *= i;
        // }
        // System.out.println("Factorial of "+factnum+" = "+ fact);

// Write a program to print the multiplication table of a number N, entered by the user.
        // System.out.println("Enter number to print table: ");
        // int tablenum = in.nextInt();
        // for(int i=1; i<=10; i++){
        //         System.out.println(tablenum+" X "+i+" = "+(tablenum*i));
        // }

        in.close();
    }
}
