import java.util.Scanner;
//-- Faça um programa que calcule o valor da conta de energia elétrica de um cliente, considerando:
 //-- O usuário entra com a quantidade de kWh consumidos. Se o consumo for até 100 kWh, cada kWh custa R$ 0,50. Caso contrário, os primeiros 100 kWh custam R$ 0,50 cada,
//--  e os kWh excedentes custam R$ 0,75 cada. O programa deve calcular e imprimir o valor total da conta.
public class energia10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double kwhconsu;
        System.out.println(" Digite a quantidade de kWh consumidos ");
        kwhconsu = ler.nextDouble();

        Double valortotal;

        if(kwhconsu <=100){
            valortotal = kwhconsu * 0.50;
            
        }
        else {
             valortotal = (100 * 0.50) + ((kwhconsu - 100) * 0.75);
        }

        System.out.println(" O valor total da conta de energia é de R$ " +valortotal);


    }
}
