import java.util.Scanner;
public class Exercício_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        float inferior, superior;

        System.out.println("Digite um valor n: ");
        n = sc.nextInt();

        System.out.println("Digite o valor inferior: ");
        inferior = sc.nextFloat();

        System.out.println("Digite o valor superior: ");
        superior = sc.nextFloat();

        if (n < inferior) {
            System.out.println("Valor eatá antes do intervalo");
        }
        else if (n > superior) {
            System.out.println("Valor está depois do intervalo");
        }
        else {
            System.out.println("Valor está dentro do intervalo");
        }


    }
}
