import java.util.Scanner;
public class Exercício_5 {

    public static void main(String[] args) {

        float t;
        Scanner tempo = new Scanner(System.in);

        System.out.println("Digite o tempo em segundos");
        t = tempo.nextFloat();

        float th = t / 60 ;
        System.out.println("Tempo em horas: " + th);


    }

}

