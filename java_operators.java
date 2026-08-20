public class java_operators {
public static void main(String[] args){
    //Arithematic Operators
    int x = 10 , y = 3 ;
    System.out.println("Sum : " + (x + y));
    System.out.println("Difference : " + (x - y));
    System.out.println("Product : " + (x*y) );
    System.out.println("Quotient : " + (x/y));
    System.out.println("Remainder : " + (x%y));

    //Assignment Operator
    int a = 5 ;
    a += 3 ;//a = a + 3 --> 8
    a -= 1 ; //  --> 7
    a *= 4 ; // --> 28
    System.out.println(a);

    //Comparison Operator
    int m = 5, n = 10;
    System.out.println(m==n); // ANS --> False 
    System.out.println(m!=n); // --> True
    System.out.println(m<n); // --> True

    // Logical operator
    boolean isSunny = true ;
    boolean isWarm = false ;
    System.out.println(isSunny&&isWarm);//  && --> AND operator
    System.out.println(isSunny||isWarm);//  || --> OR operator
    System.out.println(!isSunny);// ! --> NOT operator

    // --> Combined Example
    int z = 10;
    boolean check = ((x>5) && (x<15));
    System.out.println("Check result : " + check);
}

    
}
