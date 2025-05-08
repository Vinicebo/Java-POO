public class Pograma {

    public static void main(String[] args) {

        Funcionário p1 = new Funcionário("João", 3000.0);
        Vendedor p2 = new Vendedor("Pedro", 2500.0, 100.0, 30);
        Gerente p3 = new Gerente("Maria", 5000.0, 2000.0);

        System.out.println("Salario: " + p1.calcularSalario());
        System.out.println("Salario: " + p2.calcularSalario());
        System.out.println("Salario: " + p3.calcularSalario());



    }
}
