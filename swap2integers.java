public class swap2integers {
    public static void main(String[] args){
        // 1. using 3rd variable
        int a = 20 , b = 40 ;
        System.out.println("Value before swapping is : " + "a = " + a + " , " + "b = " + b);
        int temp ;
        temp = b ;
        b = a ;
        a = temp ;
    System.out.println("Value after swapping is : " + "a = " + a + " , " + "b = " + b);
        
        
        // 2. without using 3rd variable 
        int x = 55 ,  y = 45  ;
        System.out.println("Value before swapping is : " + "x = " + x + " , " + "y = " + y);
        x += y ; // x = 100
        y = x - y ; // y --> x = 100 - y = 45
        x -= y ; // x --> x = 100 - y = 45
        System.out.println("Value after swapping is : " + "x = " + x + " , " + "y = " + y);
        


        




    }
    
}
