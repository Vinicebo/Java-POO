import java.util.Scanner;
public class Exercício_1 {
    public static void main(String[] args) {
        int a, b;
        Scanner conta = new Scanner(System.in);
        System.out.println("Digite a: ");
        System.out.println("Digite b: ");
        a = conta.nextInt();
        b = conta.nextInt();
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

    }
}
