package Encapsulamento;

public class Endereco {
    public Endereco(int i, String ruaCarolina, int i1, String casa48, String centro, String rioDeJaneiro, String s, String sp) {
    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Giovanna Abreu Campos", "99781-0102", "987.654.321-26", "98.765.432-1");
        Endereco endereco = new Endereco(1, "Rua Carolina", 277, "Casa48", "Centro", "Rio De Janeiro", "04009-007", "SP");
        Tema tema = new Tema(1, "Aniversário", 500.00, "Vermelha");
        ItemTema item = new ItemTema(1, "Flores", "Decoração vermelha e branca");

        cliente.exibirInformacoes();
        endereco.exibirInformacoes();
        tema.exibirInformacoes();
        item.exibirInformacoes();
    }

    private void exibirInformacoes() {
        
    }
}
