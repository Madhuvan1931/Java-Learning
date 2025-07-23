public class Operators {
    public static void main(String[] args) {
        
        // Arithemetic Operators 
        int a = 10, b = 5;
        System.out.println("Arithemetic Operators: ");
        System.out.println(a+"+"+b+ "= "+(a+b));
        System.out.println(a+"-"+b+ "= "+(a-b));
        System.out.println(a+"*"+b+ "= "+(a*b));
        System.out.println(a+"/"+b+ "= "+(a/b));
        System.out.println(a+"%"+b+ "= "+(a%b));
        System.out.println("Unary-Increment(++):"+a+" = "+(++a));
        System.out.println("Unary-Decrement(--):"+b+" = "+(--b));
        a-=1;
        b+=1;
        // Relational Operators
        System.out.println("Relational Operators: ");
        System.out.println(a+" == "+b+": "+(a==b));
        System.out.println(a+" != "+b+": "+(a!=b));
        System.out.println(a+" > "+b+": "+(a>b));
        System.out.println(a+" < "+b+": "+(a<b));
        System.out.println(a+" >= "+b+": "+(a>=b));
        System.out.println(a+" <= "+b+": "+(a<=b));

        // Logical Operators
        System.out.println("Logical Operators: ");
        int c = 10, d = 20;
        System.out.println(c < 15 && d > 15);  // true && true → true
        System.out.println(c > 15 && d > 15);  // false && true → false
        int x = 5, y = 10;
        System.out.println(x < 10 || y > 15);  // true || false → true
        System.out.println(x > 10 || y < 5);   // false || false → false
        boolean isRainy = false;
        System.out.println(!isRainy);   // true

        int u = 10;
        int v = 5;
        System.out.println("Assignment Operators: ");
        u += v;  // u = u + v → u = 15
        System.out.println("u += v : " + u);

        u -= v;  // u = u - v → u = 10
        System.out.println("u -= v : " + u);

        u *= v;  // u = u * v → u = 50
        System.out.println("u *= v : " + u);

        u /= v;  // u = u / v → u = 10
        System.out.println("u /= v : " + u);

        u %= v;  // u = u % v → u = 0
        System.out.println("u %= v : " + u);



    }
}
