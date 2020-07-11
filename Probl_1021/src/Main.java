import java.util.Scanner;
    public class Main {
            public static void main(String[] args) {
             Scanner leitor = new Scanner(System.in);
             double ve = leitor.nextDouble();
             double[] valor = {100,50,20,10,5,2,1,0.5,0.25,0.10,0.05,0.01};
             int[] a = {0,0,0,0,0,0,0,0,0,0,0,0};
             int b = 0;
             for(int c=0; c<12; c++){
                 while(ve >= valor[c]){
                     ve -= valor[c];
                   if (b==0){
                       ve += 0.00001;
                         b += 1;
                     }
                   a[c]++;
                 }    
             }
             System.out.printf("NOTAS:%n");
             System.out.printf("%d nota(s) de R$ 100.00%n", a[0]);
             System.out.printf("%d nota(s) de R$ 50.00%n", a[1]);
             System.out.printf("%d nota(s) de R$ 20.00%n", a[2]);
             System.out.printf("%d nota(s) de R$ 10.00%n", a[3]);
             System.out.printf("%d nota(s) de R$ 5.00%n", a[4]);
             System.out.printf("%d nota(s) de R$ 2.00%n", a[5]);
             System.out.printf("MOEDAS:%n");
             System.out.printf("%d moeda(s) de R$ 1.00%n", a[6]);
             System.out.printf("%d moeda(s) de R$ 0.50%n", a[7]);
             System.out.printf("%d moeda(s) de R$ 0.25%n", a[8]);
             System.out.printf("%d moeda(s) de R$ 0.10%n", a[9]);
             System.out.printf("%d moeda(s) de R$ 0.05%n", a[10]);
             System.out.printf("%d moeda(s) de R$ 0.01%n", a[11]);
             
          }
        }
