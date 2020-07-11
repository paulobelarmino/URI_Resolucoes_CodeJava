import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int anos, meses, dias;
        anos = idadeDias/365;
        meses = idadeDias/30 - anos*12;
        dias = idadeDias- meses*30 - anos*365;
        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n",anos,meses,dias);
    }
    
}
