import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int n2 = sc.nextInt();

        int Sum = n1+n2;
        int product = n1*n2;
        System.out.println("Sum of "+n1+" and "+n2 +" :) "+ Sum);
        System.out.println("Product of "+n1+" and "+n2 +" :) "+ product);
        
        System.out.println("Enter Radius : ");
        float rad = sc.nextFloat();
        float area = 3.14f*(rad*rad);
        System.out.println("Area oc Circle is :) "+ area);

        sc.close();
    }
}
