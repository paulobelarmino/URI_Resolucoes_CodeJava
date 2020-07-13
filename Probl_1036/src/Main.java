import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double R1, R2;
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        double delta = (b*b-(4*a*c));
        if (delta < 0 || a == 0 ){
            System.out.printf("Impossivel calcular%n");
        }else{
            R1 = (-b + Math.sqrt(delta))/(2*a);
            R2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("R1 = %.5f%n",R1);
            System.out.printf("R2 = %.5f%n",R2 );
        }
        
               
    }
       
}
  