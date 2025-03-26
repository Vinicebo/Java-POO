
import java.util.Scanner;

public class Exercício_3 {
    public static void main(String[] args) {



        Scanner dindin = new Scanner(System.in);
        System.out.println("Digite salario: ");
        float salario = dindin.nextFloat();

        System.out.println("Digite pa (Só o numero :v ): ");
        float pa = dindin.nextFloat();


        float aumento = salario * (pa / 100);
        float novoSalario = salario + aumento;

        System.out.println("Novo salario: " + novoSalario);

    }
}
