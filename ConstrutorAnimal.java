package MetodosConstrutores;

public class ConstrutorAnimal {

        public static void main(String[] args) {
            Animal animal = new Animal(10.5f, "Castanho");

            System.out.println("Tamanho: " + animal.getTamanho());
            System.out.println("Cor: " + animal.getCor());
        }
    }

