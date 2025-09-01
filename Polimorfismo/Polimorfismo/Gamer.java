package Polimorfismo;

public class Gamer implements Computador {

    @Override
    public void ligar() {
        System.out.println("Ligando computador Gamer...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando computador Gamer...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando computador Gamer...");
    }

    @Override
    public void carregandoSistema() {
        System.out.println("Carregando sistema com configurações de alto desempenho para jogos...");
    }
}
