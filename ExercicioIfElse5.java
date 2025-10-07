import java.util.Scanner;

public class ExercicioIfElse5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double vltotal, vlfinal;
        int fmpgto;

        System.out.println(" Digite o valor total da sua compra ");
        vltotal = ler.nextDouble();

        System.out.println(" Digite a forma de pagamento: ");
        System.out.println(" 1- PIX ");
        System.out.println(" 2- Cartão ");
        fmpgto = ler.nextInt();
       

        if(fmpgto == 1 ){
               vlfinal = vltotal * 0.95;
        }

        
        else{
            vlfinal = vltotal * 1.05;
        }
        System.out.println(" O valor final da compra é de R$ " + vlfinal);
    }
}
