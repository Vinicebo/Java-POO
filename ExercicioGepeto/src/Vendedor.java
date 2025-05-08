public class Vendedor extends Funcionário{
    private Double comissao;
    private Integer vendasRealizadas;

    public Vendedor(String nome, Double salarioBase, Double comissao, Integer vendasRealizadas) {
        super(nome, salarioBase);
        this.comissao = comissao;
        this.vendasRealizadas = vendasRealizadas;


    }

    @Override
    public double calcularSalario() {
        return salarioBase + (comissao * vendasRealizadas);
    }
}
