import java.util.Scanner;
public class Exercício_7 {
    public static void main(String[] args) {
        Scanner parouimpar = new Scanner(System.in);

        int n;
        System.out.println("Digite um valor: ");
        n = parouimpar.nextInt();

        int div = n % 2;

        if ( div == 0 ) {
            System.out.println("N é par");
        }
        else {
            System.out.println("N é impar");
        }


    }
}
