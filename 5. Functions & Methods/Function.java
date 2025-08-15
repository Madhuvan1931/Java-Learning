import java.util.Scanner;

public class Function {
    public static void printHello(){
        System.out.println("Madhuvan Singh");
        return;
    }
    // Funtion with parameter
    public static int calculateSum(int a,int b){//parameters or formal parameters
        return a+b;
       }

       {
// Call by value
        /*Call by Value means that a copy of the actual value is passed to the method.
        Changes made inside the method do not affect the original value. */
    }
    public static void swap(int a, int b){
            int temp = a;
            a = b;
            b = temp;
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
        
    public static int multiply(int a,int b){//parameters or formal parameters
        return a*b;
       }

    public static int Factorial(int n){
            int fact = 1;
            int i = 1;
            while(i<=n){
                fact *= i;
                i++;
            }
            return fact;
        }
       
    public static int sum(int a,int b){
            return a+b;
        }

    public static int sum(int a,int b,int c){
            return a+b+c;
        } 

    public static float sum(float a, float b){
            return a+b;
        }

    // check if a number is prime or not
    public static boolean isPrime(int n){
            if (n <= 1) return false;       // 0, 1, and negatives are not prime
            if (n == 2 || n == 3) return true; // 2 and 3 are prime
            if (n % 2 == 0) return false;   // eliminate even numbers quickly
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
        }
        return true;
    }

    // Print all prime numbers in range
    public static void printInRange(int n){
            for(int i=2;i<=n; i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

    // Convert from Binary to Decimal
    public static int BinaryToDecimal(int n){
        int Decimal = 0;
        for(int i=0; n>0; i++){
            int lastDigit = n%10;
            Decimal = Decimal + (int)(Math.pow(2,i)*lastDigit);
            n/=10;
        }
        return Decimal;
    }

    // Convert Decimal to Binary
    public static int DecimalToBinary(int n){
        int Binary = 0;
        for(int i=0; n>0; i++){
            int rem = n%2; 
            Binary = Binary + rem*(int)(Math.pow(10,i));
            n = n/2;
        }
        return Binary;
    }

        public static void main(String[] args) {
        // printHello(); // function call
        Scanner in = new Scanner(System.in);
    {
        // System.out.println("Enter Number A: ");
        // int num1 = in.nextInt();
        // System.out.println("Enter Number B: ");
        // int num2 = in.nextInt();
        // System.out.println("Sum = "+calculateSum(num1, num2));//Argument or actual parameters 
    }  

    { // swap
    //     int a = 5;
    //    int b = 10;
    //    swap(a, b);
    //     System.out.println("a = "+a);
    //     System.out.println("b = "+b);
    }

    { // product
        // int a = 5;
        // int b = 7;
        // int product = multiply(a, b);
        // System.out.print("Product = "+product);
    }
    
    {//Factorial
    // int n = 5;
    // int fact = Factorial(n);
    // System.out.println("Factorial of "+n+" = "+fact);
    }

    {// Binomial Coefficient
        // int n = 5;
        // int r = 2;
        // int Binomial = (Factorial(n))/(Factorial(r)*(Factorial(n-r)));
        // System.out.println("Binomial Coefficient = "+Binomial);
    }

    {//Function Overloading
        // int a = sum(5,6);
        // int b = sum(5,6,7);
        // float c = sum(4.5f,6.7f);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
    }

    {// check if a number is prime or not
        // System.out.println(isPrime(23));
        // System.out.println(isPrime(22));
        // printInRange(40);
    }

    {//Convert from Binary to Decimal and (reverse)
        System.out.println(BinaryToDecimal(101));
        System.out.println(BinaryToDecimal(1000));
        System.out.println(DecimalToBinary(5));
        System.out.println(DecimalToBinary(11));
        System.out.println(DecimalToBinary(12));
    }

    in.close();

    }
}

