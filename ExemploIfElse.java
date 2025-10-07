import java.util.Scanner;

public class ExemploIfElse {
    
   public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int idade;

    System.out.println(" Qual a sua idade ? ");
    idade = ler.nextInt();

    if(idade < 18){
    System.out.println(" Voçê é menor de idade ");
    }
    else{ 
    System.out.println(" Voçê é maior de idade");

   }
   }

}
