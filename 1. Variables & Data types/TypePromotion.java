public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);

        short s = 5;
        byte b1 = 25;
        char c = 'c';
        byte bt = (byte)(s + b1 + c);
         System.out.println(bt);

         int i = 10;
         float f = 20.25f;
         long l = 25;
         double d = 30;
         double ans = i+f+l+d;
         System.out.println(ans);

    }
}
