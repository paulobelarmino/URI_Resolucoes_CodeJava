
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int seg = leitor.nextInt();
        int horas, minutos, segundos;
        horas = seg/3600;
        minutos = seg/60 - horas*60;
        segundos = seg - horas*3600 - minutos*60;
       System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
             
    }
    
}
