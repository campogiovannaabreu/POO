package Heranca;

public class Automovel extends Veiculo {
    private int motor;
    private int numeroPortas;

    public Automovel(String marca, String modelo, String cor, int ano, int motor, int numeroPortas) {
        super(marca, modelo, cor, ano);
        this.motor = motor;
        this.numeroPortas = numeroPortas;
    }

    public String getMotor() {
        return String.valueOf(motor); // Retorna String, mas pode ser int
    }

    public void setMotor(int motor) { // Tipo do parâmetro corrigido para int
        this.motor = motor;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}