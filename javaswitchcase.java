public class javaswitchcase {
    public static void main(String[] args){
        int day = 3 ;
        switch (day) {
        // case and then value not number neeche case 1 me jo 1 hai vo value hai number 
            case 1 : System.out.println("Monday");
            break ;
            case 2 : System.out.println("Tuesday");
            break ;
            case 3 : System.out.println("Wednesday");
            break ;   
            default : System.out.println("Another day!"); 

        }

        char grade ='B';
        switch (grade) {
          case 'B' :  System.out.println("Good"); 
          break ;
          case 'A' :  System.out.println("Excellent"); 
          break ;
          default : System.out.println("Needs Improvement!"); 

        }
    }
    
}
