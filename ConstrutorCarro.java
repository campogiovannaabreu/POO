package MetodosConstrutores;

public class ConstrutorCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("2630", 121);

        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Numero Chassi: " + carro.getNumChassi());
    }
}

