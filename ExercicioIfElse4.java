import java.util.Scanner;
//--- Escreva um programa que leia dois números inteiros e informe qual deles é o maior.
public class ExercicioIfElse4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1, n2;

        System.out.println(" Digite o primeiro número ");
        n1 = ler.nextInt();

        System.out.println(" Digite o segundo número ");
        n2 = ler.nextInt();

        if(n1 > n2){
            System.out.println(" O número " + n1 + " ele é maior que  " + n2);
        }
        else{
            System.out.println(" O número " + n1 + " é menor que  " + n2);
    }
}
}