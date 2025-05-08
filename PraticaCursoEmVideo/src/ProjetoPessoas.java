public class ProjetoPessoas {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Juninho");
        p2.setNome("Pedrinho");
        p3.setNome("Enaldinho");
        p4.setNome("Geraldinho");


        p1.setIdade(18);
        p1.setSexo("Neutro");
        p2.setMatricula("69699696");
        p2.setCurso("Computaria");
        p3.setEspecialidade("DATA");
        p3.setSalario(1000.0);
        p4.setSetor("estoque");
        p4.setTrabalhando(Boolean.TRUE);



        p2.cancelarMatriucula();
        p3.receberAumento(1000);
        p4.mudarTrabalho();


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());



    }
}
