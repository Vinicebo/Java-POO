import java.util.Scanner;
public class Exercício_2 {
    public static void main(String[] args) {
        float a, b;
        Scanner conta = new Scanner(System.in);
        System.out.println("Digite a: ");
        System.out.println("Digite b: ");
        a = conta.nextInt();
        b = conta.nextInt();
        float soma = a + b;
        float subtracao = a - b;
        float multiplicacao = a * b;
        float divisao = a / b;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisão: " + divisao);


    }
}
