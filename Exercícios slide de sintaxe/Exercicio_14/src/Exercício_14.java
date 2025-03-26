import java.util.Scanner;
public class Exercício_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota = 0;
        int alunos = 0;
        float total = 0;
        double maiorNota = Double.NEGATIVE_INFINITY;
        double menorNota = Double.POSITIVE_INFINITY;

        while (true){



            System.out.println("Digite a nota do aluno: ");
            nota = sc.nextFloat();

            if (nota == -1){
                break;
            }

            total += nota;
            alunos++;


            if (nota > maiorNota) {
                maiorNota = nota;
            }

            // Atualiza a menor nota
            if (nota < menorNota) {
                menorNota = nota;
            }



        }
        System.out.println("A quantidade de alunos é: " + alunos);
        float media = total / alunos;
        System.out.println("A média dos alunos é: " + media );
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A maio nota é: " + maiorNota);


    }
}
