import java.util.Scanner;

public class Exercício_8 {
    public static void main(String[] args) {

        Scanner kilouwatis = new Scanner(System.in);
        System.out.println("Quanto foi consumido?: ");
        int consumo = kilouwatis.nextInt();
        System.out.println("Quanto é o valor dos K?: ");
        double valor = kilouwatis.nextDouble();

        double pagamento = consumo * valor;
        double pagamentoDesc = pagamento / 10;
        if (consumo < 150) {
            System.out.println("Pagamento: R$ " + pagamentoDesc);
        }
        else {
            System.out.println("Pagamento: R$ " + pagamento);
        }



    }
}
