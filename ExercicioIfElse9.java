import java.util.Scanner;
//--- Faça um programa onde o usuário entra com o peso de uma bagagem em kg. Se o peso for maior que 20 kg, cada kg excedente custa R$ 5. 
//--- Caso contrário, não há custo adicional. O programa deve calcular e imprimir o valor total a pagar pelo excesso de bagagem.
public class ExercicioIfElse9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double peso;
        System.out.println(" Digite o peso da sua bagagem ");
        peso = ler.nextDouble();

        Double pesolimite = 20.0;
        Double custokg = 5.0;
        Double vltotal = 0.0;

        if(peso > pesolimite){
              Double pesoacima = peso - pesolimite;
              vltotal = pesoacima * custokg;
              System.out.println(" O valor total a pagar pelo peso em excesso é de R$ " + vltotal);
        }
        else{
            System.out.println(" Não há custo adicional pelo excesso da bagagem.");
        }
        
       
    }
}
