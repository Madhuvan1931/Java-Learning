public class NestedLoop {

// Print star pattern
public static void starPattern(int line){
                for(int i=1; i<=line; i++){
                // one line
                for(int j=1;j<=i; j++){
                        System.out.print(" * ");
                }
                System.out.println();
                }
        }

// Print INVERTED-STAR pattern
public static void invertedStarPattern(int line){
        for(int i=1; i<=line; i++){
            // one line
            for(int j=1;j<=line-i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
}

// Print Half Pyramid pattern
public static void halfPyramidPattern(int line){
        for(int i=1; i<=line; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
}

// Print HOLLOW RECTANGLE pattern
public static void hollowRectanglePattern(int line){
        for(int i=1; i<=line; i++){
              for(int j=1; j<=line; j++){
                if(i==1 || i==line || j==1 || j==line){
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }
              }
              System.out.println();
        }
}

// Print Half Pyramid pattern
public static void halfPyramidCharecterPattern(int line){
        char ch = 'A';
        for(int i=1; i<=line; i++){
            for(int chars=1; chars<=i; chars++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
}

// Print INVERTED HALF-PYRAMID with Numbers pattern
public static void invertedHalfPyramidNumberPattern(int line){
        for(int i=line; i>=1; i--){
                for(int j=1; j<=i; j++){
                        System.out.print(j+" ");
                }
                System.out.println();
        }
}

// Print FLOYD'S Triangle pattern
public static void floydTriangleNumberPattern(int line){
        int n = 1;
        for(int i=1; i<=line; i++){
                for(int j=1; j<=i; j++){
                        System.out.print(n+" ");
                        n++;
                }
                System.out.println();
        }
}

// Print INVERTED & ROTATED HALF PYRAMID pattern
public static void invertedRotatedHalfPyramidPattern(int line){
        for(int i=1; i<=line; i++){
                for(int j=1; j<=line-i; j++){
                        System.out.print("   ");
                }
                for(int j=1; j<=i; j++){
                        System.out.print(" * ");
                }
                System.out.println();
        }
}

// Print 0-1 Triangle pattern
public static void zeroOneTrianglePattern(int line){
        for(int i=1; i<=line; i++){
                for(int j=1; j<=i; j++){
                        if((i+j)%2==0){
                                System.out.print(" 1 ");
                        }else{
                                System.out.print(" 0 ");
                        }
                }
                System.out.println();
        }
}

// Print Butterfly pattern
public static void ButterflyPattern(int line){
        // outer 1
        for(int i=1; i<=line; i++){
                // stars
                for(int j=1; j<=i; j++){
                        System.out.print(" . ");
                }
                // spaces
                for(int j=line*2-i*2; j>=1; j--){
                        System.out.print("   ");
                }
                // stars
                for(int j=1; j<=i; j++){
                        System.out.print(" . ");
                }
                System.out.println();
        }
        // outer 2
        for(int i=line; i>=1; i--){
                // stars
                for(int j=1; j<=i; j++){
                        System.out.print(" . ");
                }
                // spaces
                for(int j=line*2-i*2; j>=1; j--){
                        System.out.print("   ");
                }
                // stars
                for(int j=1; j<=i; j++){
                        System.out.print(" . ");
                }
                System.out.println();
        }
}

// Print Solid RHOMBUS Pattern
public static void solidRhombusPattern(int line){
        for(int k=1; k<=line;k++){
                for(int i=line-k; i>=1; i--){
                        System.out.print("   ");
                }
                for(int j=line; j>=1; j--){
                        System.out.print(" * ");
                }
                System.out.println();
        }
}


// Print Solid RHOMBUS Pattern
public static void hollowRhombusPattern(int line){
        for(int k=1; k<=line;k++){
                for(int i=line-k; i>=1; i--){
                        System.out.print("   ");
                }
                for(int j=line; j>=1; j--){
                        if(k==1 || k==line || j==1 || j==line){
                                System.out.print(" $ ");
                        }else{
                                System.out.print("   ");
                }
                }
                System.out.println();
        }
}

// Print Diamond Pattern 
public static void DiamondPattern(int line){
        // outer1
        for(int i=1; i<=line; i++){
                for(int j=line-i; j>=1; j--){
                        System.out.print("   ");
                }
                for(int j=1; j<=2*i-1; j++){
                        System.out.print(" . ");
                }
                System.out.println();
        }
        // outer 2
        for(int i=line; i>=1; i--){
                for(int j=line-i; j>=1; j--){
                        System.out.print("   ");
                }
                for(int j=1; j<=2*i-1; j++){
                        System.out.print(" . ");
                }
                System.out.println();
        }
}
    public static void main(String[] args) {

    System.out.println("STAR Pattern:");
    starPattern(8);

    System.out.println("\n INVERTED-STAR Pattern:");
    invertedStarPattern(8);

    System.out.println("\n HALF PYRAMID Number Pattern:");
    halfPyramidPattern(8);

    System.out.println("\n HOLLOW RECTANGLE Pattern:");
    hollowRectanglePattern(8);

    System.out.println("\n HALF PYRAMID Character Pattern:");
    halfPyramidCharecterPattern(8);

    System.out.println("\n INVERTED HALF-PYRAMID with Numbers:");
    invertedHalfPyramidNumberPattern(8);

    System.out.println("\n FLOYD'S Triangle Number Pattern:");
    floydTriangleNumberPattern(8);

    System.out.println("\n INVERTED & ROTATED HALF PYRAMID Pattern:");
    invertedRotatedHalfPyramidPattern(8);

    System.out.println("\n 0-1 Triangle Pattern:");
    zeroOneTrianglePattern(8);

    System.out.println("\nBUTTERFLY Pattern:");
    ButterflyPattern(8);

    System.out.println("\nSOLID RHOMBUS Pattern:");
    solidRhombusPattern(8);

    System.out.println("\nHOLLOW RHOMBUS Pattern:");
    hollowRhombusPattern(8);

    System.out.println("\nDIAMOND Pattern:");
    DiamondPattern(8);
}

}
