package Polimorfismo;

public class PrincipalTesteFuncionario{
    public static void main(String[] args) {
        Funcionario f1 = new Jornada(1, "Carlos", "11999999999", 101, "Rua A", 25.0, 160);
        Funcionario f2 = new Horista(2, "Ana", "11888888888", 102, "Rua B", 30.0, 120);
        Funcionario f3 = new PessoaJuridica(3, "Empresa X", "11777777777", 103, "Rua C", 8000.0, 1200.0);

        f1.calculaSalario();
        f2.calculaSalario();
        f3.calculaSalario();
    }
}
