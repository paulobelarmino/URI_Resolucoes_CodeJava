import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int anos, meses, dias, diasRemanecentes;
        anos = idadeDias/365;
        diasRemanecentes = idadeDias - anos*365;
        meses = diasRemanecentes/30;
        dias = diasRemanecentes- meses*30;
        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n",anos,meses,dias);
    }
    
}
