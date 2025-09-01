package Heranca;

public class Moto extends Veiculo {
    private int cilindrada;


    public Moto(String marca, String modelo, String cor, int ano, int cilindrada) {
        super(marca, modelo, cor, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}