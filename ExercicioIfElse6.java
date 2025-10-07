import java.util.Scanner;
//--- Faça um programa onde o usuário entra com um valor de depósito em uma poupança. Se o valor for maior que 1000, aplique um rendimento de 3%, 
//--- Caso contrário, aplique um rendimento de 1,5%. O programa deve imprimir o valor final do depósito.
public class ExercicioIfElse6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double vldeposito, vlfinal;
        int rend;

        System.out.println(" Digite o valor do deposito que deseja fazer ");
        vldeposito = ler.nextDouble();

        if(vldeposito > 1000){
            vlfinal = vldeposito * 1.03;
        }
        else{
            vlfinal = vldeposito * 1.015;
        System.out.println(" O valor final do deposito é de R$ " +vlfinal);
        }



    }
}
