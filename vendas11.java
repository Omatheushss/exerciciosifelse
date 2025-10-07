import java.util.Scanner;
//-- Faça um programa onde o usuário entra com a meta de vendas e o valor realmente vendido por um funcionário. 
//-- Se o valor vendido for maior ou igual à meta, o funcionário receberá um bônus de 10% sobre o valor vendido. Caso contrário, 
//-- o bônus será de apenas 3%. O programa deve imprimir o valor do bônus que o funcionário irá receber.

public class vendas11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double mtvenda, vlreal;
        
        System.out.println(" Digite sua meta de venda ");
        mtvenda = ler.nextDouble();
        
        System.out.println(" Digite o valor real vendido ");
        vlreal = ler.nextDouble();

        Double bonus = 0.0;

        if(vlreal >= mtvenda){
            bonus = vlreal * 0.10;
            System.out.println(" Parabéns você atingiu a meta e irá receber R$ " +bonus);
        }
        else{
          bonus = vlreal * 0.03;
          System.out.println(" A meta não foi atingida, mas parabéns pelo esforço, você receberá R$ " +bonus);

        }
        



    }
}
