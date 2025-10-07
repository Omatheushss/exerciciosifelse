import java.util.Scanner;
//--- Faça um programa onde o usuário entra com a quantidade de horas extras trabalhadas e o valor da hora normal.
//--- Se a quantidade de horas extras for maior que 10, o valor da hora extra é 50% a mais do que o valor normal.
//--- Caso contrário, o valor da hora extra é 25% a mais do que o valor normal. 
//--- O programa deve calcular e imprimir o total a receber pelas horas extras.
public class ExercicioIfElse8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double horasextras, vlnormal;

        System.out.println(" Digite a quantidade de horas trabalhadas ");
        horasextras = ler.nextDouble();

        System.out.println(" Digite o valor da hora normal ");
        vlnormal = ler.nextDouble();
        
        Double vlextra;
        Double vltotal;

        if(horasextras > 10){
            vlextra = vlnormal * 1.50;
            
        }
        else{
            vlextra = vlnormal * 1.25;
            
        }
        vltotal = vlextra * horasextras;
            System.out.println(" O valor total a receber pelas horas extras é de R$ " +vltotal);
    }
}
