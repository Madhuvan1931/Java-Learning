public class Practice {

public static int averageOfThreeNumbers(int a,int b, int c){
    return (a+b+c)/2;
}

public static boolean isEven(int n){
    if(n%2==0){
        return true;
    } else{
        return false;
    }
}
public static int Reverse(int n){
    int rev = 0;
    for(;n>0;){
        int lastDigit = n%10;
        rev = rev*10+lastDigit;
        n= n/10;
    }
    return rev;
}

public static boolean isPalindrome(int n){
    if(Reverse(n)==n){
        return true;
    }else{return false;}
}

public static int sumOfDigits(int n){
    int sum = 0;
    while(n>0){
        int lastDigit = n%10;
        sum += lastDigit;
        n/=10;
    }
    return sum;
}

    public static void main(String[] args) {
        
    System.out.println(averageOfThreeNumbers(32, 43, 35));
    System.out.println(isEven(45));
    System.out.println(isEven(32));
    System.out.println(Reverse(2345));
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(15435));
    System.out.println(sumOfDigits(12345));

    }
}
