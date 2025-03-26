import java.math.RoundingMode;
import java.util.Scanner;
import java.math.*;


public class Exercício_9 {
    public static void main(String[] args) {
        Scanner arredonda = new Scanner(System.in);



        double x;
        System.out.println("Digite um valor: ");
        x = arredonda.nextDouble();

        double arredondado = Math.round(x);

        System.out.println("Valor do arredondado: " + arredondado);


    }
}
