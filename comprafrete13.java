import java.util.Scanner;
//-- Faça um programa onde o usuário entra com o valor total da compra e o valor do frete. Se o valor da compra for maior que R$ 500, o cliente ganha 50% de desconto no frete. 
//-- Caso contrário, paga o valor inteiro do frete. O programa deve imprimir o valor final a pagar (compra + frete final).



public class comprafrete13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double cptotal,vlfrete, vlfinal;

        System.out.println(" Digite o valor total da compra ");
        cptotal = ler.nextDouble();

        System.out.println(" Digite o valor do frete ");
        vlfrete = ler.nextDouble();

        Double fretefinal;

        if(cptotal >500){
           fretefinal = vlfrete * 0.50;
           System.out.println(" Sua compra foi acima de R$500, e recebeu 50% de desconto.");
        }
        else{
            fretefinal = vlfrete;
            System.out.println(" Sua compra foi abaixo de R$500 portanto pagar o frete integral.");
        }
        vlfinal = cptotal + fretefinal;
        System.out.println(" O valor final a pagar é R$ " +vlfinal);
    }
}
