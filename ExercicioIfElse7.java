import java.util.Scanner;
//--- Faça um programa onde o usuário entra com a velocidade de um carro. Se a velocidade for maior que 100 km/h, 
//--- calcule uma multa de R$ 57 por km acima de 100. 
//--- Caso contrário, a multa é 0. O programa deve imprimir o valor da multa.
public class ExercicioIfElse7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double vlkm, multa, vlalt;

        System.out.println(" Digite a velocidade do carro ");
        vlkm = ler.nextDouble();
        
        int vlmulta = 57;
        multa = 0.0;
        if(vlkm > 100){
            vlalt = vlkm - 100;
            multa = vlalt *vlmulta;
            System.out.println(" Sua velocidade foi acima do limite! Multa: R$ " + multa);
        }
        else{
            
        System.out.println(" Você está dentro do limite de velocidade. Multa: R$  " +multa);
        }

    }
}

