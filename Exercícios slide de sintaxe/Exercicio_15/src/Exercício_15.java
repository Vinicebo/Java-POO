import java.util.Scanner;

public class Exercício_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digitos = 0;
        int caracter = 0;
        int outroCaracter = 0;

        int vogais = 0;

        while (true){

            System.out.println("Digite um digito: ");
            digitos = sc.next().charAt(0);


            if (digitos == '.'){
                break;
            }

            caracter++;


            if (digitos == 'a' || digitos == 'e' || digitos == 'i' || digitos == 'o' || digitos == 'u'){
                vogais++;

            }

            else {
                outroCaracter++;
            }






        }


        System.out.println("Vogais: " + vogais);
        System.out.println("Quantidade de digitos: " + caracter);
        System.out.println("Quantidade dos demais caracteres: " + outroCaracter);





    }
}
