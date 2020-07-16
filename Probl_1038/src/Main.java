
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       String[][] tabelaPrecos = {{"Código","1","2","3","4","5"},
                                  {"Especificação","Cachorro Quente","X-salada","X-Bacon","Torrada Simples","Refrigerante"},
                                  {"Preço","4.00","4.50","5.00","2.00","1.50"}  }; 
       int v1 = leitor.nextInt();
       int v2 = leitor.nextInt();
       double montante = v2 * Double.parseDouble(tabelaPrecos[2][v1]);
       System.out.printf("Total: R$ %.2f%n", montante);
               
               
    }
    
}
