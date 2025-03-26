import java.util.Scanner;
public class Exercício_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um n° de alunos: ");
        int n = sc.nextInt();
        int i = 0;

        float total = 0;
        for (; i < n; i++) {
            System.out.println("Digite a nota do aluno: ");
            float nota = sc.nextFloat();
            System.out.println("Nota do aluno: " + nota);


            total += nota;

        }
        float media = total / i;
        System.out.println("Media da classe: " + media);


    }
}
