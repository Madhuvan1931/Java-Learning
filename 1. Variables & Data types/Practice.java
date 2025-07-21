import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enetr Number 1: ");
        // int A = sc.nextInt();
        // System.out.println("Enetr Number 2: ");
        // int B = sc.nextInt();
        // System.out.println("Enetr Number 3: ");
        // int C = sc.nextInt();

        // int avg = (A+B+C)/3;
        // System.out.println("Average = "+ avg);

        // System.out.println("Enetr side of a Square ");
        // float side = sc.nextFloat();
        // float area = (side*side);
        // System.out.println("Area of a Square = "+ area);

        System.out.println("Enter item 1 price: ");
        float p1 = sc.nextFloat();
        System.out.println("Enter item 2 price: ");
        float p2 = sc.nextFloat();
        System.out.println("Enter item 3 price: ");
        float p3 = sc.nextFloat();
        float total = (p1+p2+p3)*1.18f;
        System.out.println("item 1 : "+p1);
        System.out.println("item 2 : "+p2);
        System.out.println("item 2 : "+p3);
        System.out.println("Total : "+total);
        System.out.println("18% GST included");
        


        sc.close();
    }
}
