public class calculatesimpleinterest {
    public static void main(String[] args){
        double principle = 1000 ;
        double rate = 5.5;
        int time = 2 ;
        double sim_int = (principle*rate*time)/100 ; // <-- simple interest formula
        System.out.println("The interest is : " + sim_int);


    }
    
}
