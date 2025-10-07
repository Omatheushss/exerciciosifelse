import java.util.Scanner;

import javax.swing.JOptionPane;
//--- Faça um programa que peça para o usuário digitar duas notas (valores de 0 a 10).
// Calcule a média e mostre:
// "Aprovado" se a média for maior ou igual a 6,
// "Reprovado" caso contrário.
public class ExercicioIfElse3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, media;

     System.out.println(" Digite sua primeira nota ");
     n1 = ler.nextDouble();

     System.out.println(" Digite sua segunda nota ");
     n2 = ler.nextDouble();

    media = (n1 + n2) / 2;

    System.out.println(" Sua média é " + media);

    if (media < 6 ) {
        System.out.println(" Que pena, voçê foi reprovado. ");
    }
    else{
        System.out.println(" Que bom, Parabéns voçê foi aprovado!. ");
    }
}
}

