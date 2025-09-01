package Heranca;

public class PrincipalVeiculo {
    public static void main(String[] args) {

        // Criando um veículo genérico
        Veiculo veiculo = new Veiculo("Ford", "Ka", "Branco", 2018);
        System.out.println("Veículo:");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Ano: " + veiculo.getAno());

        // Criando um automóvel
        Automovel automovel = new Automovel("Chevrolet", "Onix", "Preto", 2021, 1, 4);
        System.out.println("\nAutomóvel:");
        System.out.println("Marca: " + automovel.getMarca());
        System.out.println("Modelo: " + automovel.getModelo());
        System.out.println("Cor: " + automovel.getCor());
        System.out.println("Ano: " + automovel.getAno());
        System.out.println("Número de portas: " + automovel.getNumeroPortas());
        System.out.println("Motor: " + automovel.getMotor());

        // Criando uma moto
        Moto moto = new Moto("Yamaha", "MT-03", "Azul", 2022, 321);
        System.out.println("\nMoto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cilindrada: " + moto.getCilindrada() + "cc");
    }
}