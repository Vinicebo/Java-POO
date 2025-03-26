
import java.util.Scanner;
public class Exercício_11 {
    public static void main(String[] args) {

        Scanner operacao = new Scanner(System.in);

        System.out.println("Digite uma operação: ");
        char op = operacao.next().charAt(0);

        System.out.println("Digite um valor para a: ");
        double a = operacao.nextDouble();

        System.out.println("Digite um valor para b: ");
        double b = operacao.nextDouble();

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }



    }
}
