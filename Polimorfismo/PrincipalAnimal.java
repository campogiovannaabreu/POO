package Polimorfismo;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Lobo lobo = new Lobo("lobo", "M", "Qualquer");
        lobo.emitirSom();

        Leao leao = new Leao("Leão", "M", "Qualquer");
        leao.emitirSom();

        Tigre tigre = new Tigre("Tigre", "M", "Qualquer");
        tigre.emitirSom();

        Cachorro cachorro = new Cachorro("Cachorra", "F", "Golden");
        cachorro.emitirSom();

        Gato gato = new Gato("Gata", "F", "Qualquer");
        gato.emitirSom();
    }
}

