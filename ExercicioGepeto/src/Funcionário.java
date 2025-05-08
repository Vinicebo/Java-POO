public class Funcionário {
    protected String  nome;
    protected Double salarioBase;

    public Funcionário(String nome, Double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;

    }

}
