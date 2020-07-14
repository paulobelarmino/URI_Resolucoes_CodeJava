import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x = leitor.nextDouble();
        if (x > 75.00 && x <= 100.00){
            System.out.printf("Intervalo (75,100]%n");
        }else{
            if(x > 50.00 && x <= 75.00){
              System.out.printf("Intervalo (50,75]%n");
             }else{  
                if(x > 25.00 && x <= 50.00){
                   System.out.printf("Intervalo (25,50]%n");
            } else {
                    if(x >=0 && x <= 25){
                        System.out.printf("Intervalo [0,25]%n");
                    }else {System.out.printf("Fora de intervalo%n");}
                }
            
        }
        
               
    }
       
}

}
