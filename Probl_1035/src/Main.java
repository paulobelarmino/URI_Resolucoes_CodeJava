import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int D = leitor.nextInt();
        
        if( B > C &&  D > A && C + D > A + B &&  C >0 && D > 0 && A%2==0){
            System.out.printf( "Valores aceitos%n");
        }else {
            System.out.printf("Valores nao aceitos%n");     
            }
  }
       
}
    