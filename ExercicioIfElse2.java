import java.util.Scanner;
//--- Escreva um programa que leia um número inteiro e informe se ele é positivo ou negativo.
public class ExercicioIfElse2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println(" Digite um numero ");
        num = ler.nextInt();
 
        if (num < 0 ) {
            System.out.println(" O número " + num + " é negativo ");
        }
        else{
            System.out.println(" O número " + num +  " é positivo ");
        }
    }
}
