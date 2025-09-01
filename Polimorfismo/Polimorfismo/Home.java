package Polimorfismo;

public class Home implements Computador {

    @Override
    public void ligar() {
        System.out.println("Ligando computador Home...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando computador Home...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando computador Home...");
    }

    @Override
    public void carregandoSistema() {
        System.out.println("Carregando sistema com configurações básicas para uso doméstico...");
    }
}