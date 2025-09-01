package Polimorfismo;

public class PrincipalComputador {
    public static void main(String[] args) {

        // Polimorfismo: objetos diferentes tratados como Computador
        Computador pcGamer = new Gamer();
        Computador pcHome = new Home();

        System.out.println("=== Computador Gamer ===");
        pcGamer.ligar();
        pcGamer.carregandoSistema();
        pcGamer.reiniciar();
        pcGamer.desligar();

        System.out.println("\n=== Computador Home ===");
        pcHome.ligar();
        pcHome.carregandoSistema();
        pcHome.reiniciar();
        pcHome.desligar();
    }
}
