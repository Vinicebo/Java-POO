public class Gerente extends Funcionário{
    private Double bonus;



    public Gerente(String nome, Double salarioBase, Double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;

    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
