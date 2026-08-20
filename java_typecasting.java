public class java_typecasting {
    public static void main(String[] args){
        //implicit typecasting (Ex : int to double) --> Implicit
        int a = 50;
        double b = a;
        System.out.println(b);


        //Explicit typecasting (Ex : double to int){In this, you read line right to left} --> Explicit
        double c = 4.67;
        int d = (int)c;
        System.out.println(c);
        System.out.println(d);


        //casting char to int  --> Explicit
        char e = 'A';
        int f = e;
        int g = 103;
        char h = (char)g;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


        // Long to int (data loss possibility)  --> Explicit

        long i = 18973645195L;
        int j = (int) i ;
        System.out.println(i);
        System.out.println(j);


        //float to int in arithematic  --> Explicit
        float k = 3.14f;
        int result = (int)k + 2 ;
        System.out.println("result : " + result);




    }
    
}
