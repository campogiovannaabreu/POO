package MetodosConstrutores;

public class Animal {
    private float tamanho;
    private String cor;

    public Animal() {
        this.tamanho = tamanho;
        this.cor = cor;
    }
    public Animal(float tamanho) {
        this.tamanho = tamanho;
        this.cor = cor;

    }
    public Animal(float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }
    public float getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }
}

