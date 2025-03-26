import java.util.Scanner;
public class Exercício_4 {
    public static void main(String[] args) {

        Scanner bola = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        float raio = bola.nextFloat();


        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);

    }

}
