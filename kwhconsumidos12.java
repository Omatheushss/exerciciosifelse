import java.util.Scanner;
//-- Faça um programa onde o usuário entra com a quantidade de kWh consumidos. Se o consumo for maior que 200 kWh, o preço por kWh será R$ 0,30.
//-- Caso contrário, o preço será R$ 0,20. O programa deve calcular e imprimir o valor total da conta de energia.


public class kwhconsumidos12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double kWhconsu, vltotal;
        
        System.out.println("Digite a quantidade de kWh consumidos ");
        kWhconsu = ler.nextDouble();

        if(kWhconsu > 200){
              vltotal = kWhconsu * 0.30;
              System.out.println(" O kwh consumidos foi maior que 200 kWh, portanto o valor da sua conta vai ser de R$  " +vltotal);
        }
        else{
            vltotal = kWhconsu * 0.20;
            System.out.println("O kwh consumidos foi menor que 200 kWh, portanto o valor da sua conta vai ser de R$ " +vltotal);
        }

        
    }
}
