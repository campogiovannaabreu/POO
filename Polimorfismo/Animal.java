package Polimorfismo;

public class Animal {
    private String nome;
    private String sexo;
    private String raca;

    public Animal(String nome, String sexo, String raca) {
    }

    // Métodos comuns a todos os animais
    public void dormir() {
        System.out.println("O animal está dormindo.");
    }

    public void caminhar() {
        System.out.println("O animal está caminhando.");
    }

    public void correr() {
        System.out.println("O animal está correndo.");
    }

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

