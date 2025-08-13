import java.util.Scanner;
public class Animal{
    String nome;
    String especie;
    int idade;
    double peso;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        Animal animal1 = new Animal();
        System.out.println("Digite o nome do animal:");
        animal1.setNome(scanner.nextLine());
        System.out.println("Digite a espécie do animal:");
        animal1.setEspecie(scanner.nextLine());
        System.out.println("Digite a idade do animal:");
        animal1.setIdade(scanner.nextInt());
        System.out.println("Digite o peso do animal:");
        animal1.setPeso(scanner.nextDouble());

        System.out.println("----- Informaçoes do animal -----");
        System.out.println("O nome do animal é: " + animal1.getNome());
        System.out.println("A espécie do animal é: " + animal1.getEspecie());
        System.out.println("A idade do animal é: " + animal1.getIdade());
        System.out.println("O peso do animal é: " + animal1.getPeso());

        scanner.close();
    }

}