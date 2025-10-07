import java.util.Scanner;

public class ExemploIfElse2 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double cptotal,vlfrete, vlfinal;

        System.out.println(" Digite o valor total da compra ");
        cptotal = ler.nextDouble();

        System.out.println(" Digite o valor do frete ");
        vlfrete = ler.nextDouble();

        Double fretefinal;
      

        if(cptotal < 500){
            vlfinal = cptotal + vlfrete;

        }else if(cptotal < 1000){
            vlfinal = cptotal + (vlfrete * 0.8);
        }else if(cptotal < 1500){
            vlfinal = cptotal + (vlfrete * 0.6);
        }else if(cptotal < 2000){
            vlfinal = cptotal +(vlfrete * 0.50);
        }else{
            vlfinal = cptotal;
        }
        System.out.println(" O valor final da conta é: R$ " +vlfinal);
     }
}
