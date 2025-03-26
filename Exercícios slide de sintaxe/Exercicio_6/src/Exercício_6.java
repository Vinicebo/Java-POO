import java.util.Scanner;

public class Exercício_6 {
    public static void main(String[] args) {
        Scanner vloecidade = new Scanner(System.in);

        float distancia, tempo, gas;
        System.out.println("Digite o valor da kilometragem: ");
        distancia = vloecidade.nextFloat();
        System.out.println("Digite o valor do tempo em horas: ");
        tempo = vloecidade.nextFloat();
        System.out.println("Digite o valor do combustível gasto: ");
        gas = vloecidade.nextFloat();
        float vel = distancia / tempo ;
        float kl = distancia / gas ;
        System.out.println("Velocidade em Km/h: " + vel);
        System.out.println("Consumo de combustível por Km/l: " + kl);







    }
}
