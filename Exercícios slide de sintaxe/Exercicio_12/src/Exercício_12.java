import  java.util.Scanner;
public class Exercício_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para a: ");
        double a = sc.nextDouble();

        System.out.println("Digite um valor para b: ");
        double b = sc.nextDouble();

        if (a < b){
            double i = a;
            while (i <= b){
                i += 1;
                if (i == b){
                    break;
                }
                else if (i % 2 == 0){
                    System.out.println("É par: " + i);

                }

            }
        }
        else{
            double i = a;
            while (i > b){
                i -= 1;
                if (i == b){
                    break;
                }
                else if (i % 2 == 0){

                    System.out.println("É par: " + i);
                }

            }
        }


    }
}
