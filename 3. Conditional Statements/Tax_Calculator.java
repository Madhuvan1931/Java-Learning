import java.util.*;
public class Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income in Ruppees :");
        int income = sc.nextInt();
        if(income<500000){
            System.out.println("Your income is : Rs."+income);
            System.out.println("Congratulations, You are not eligible for Tax\n enjoy your Money");
        } else if(income>500000 && income<1000000){
            double taxAmount = income*0.2;
            double remainingAmount = income-taxAmount;
            System.out.println("Thank you for contributing the Indian Economy ");
            System.out.println("You paid tax to the Indian Government : Rs."+ taxAmount);
            System.out.println("Money left after paying tax : Rs."+remainingAmount+" \n Enjoy your Money");
        } else if(income > 1000000){
            double taxAmount = income*0.3;
            double remainingAmount = income-taxAmount;
            System.out.println("Thank you for contributing the Indian Economy ");
            System.out.println("You paid tax to the Indian Government : Rs."+ taxAmount);
            System.out.println("Money left after paying tax : Rs."+remainingAmount+" \n Enjoy your Money");
        }
        else{
            System.out.println("Please Enter the correct amount ");
        }
        sc.close();
    }
}
