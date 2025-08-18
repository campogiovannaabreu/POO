import java.util.Scanner;
public class ObjetoCadeira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        class Cadeira{
            String modelo;
            String cor;
            String tecido;
            int anoDeFabricacao;


            public void setModelo(String modelo){
                this.modelo = modelo;
            }

            public String getModelo() {
                return modelo;
            }

            public void setCor(String cor){
                this.cor = cor;
            }
            public String getCor(){
                return cor;
            }
            public void setTecido(String tecido){
                this.tecido = tecido;
            }
            public String getTecido(){
                return tecido;
            }

            public void setanoDeFabricacao(int anoDeFabricacao){
                this.anoDeFabricacao = anoDeFabricacao;
            }

            public int getanoDeFabricacao() {
                return anoDeFabricacao;
            }

        }

        System.out.println("Entre com o numero de cadeiras: ");
        int n = scan.nextInt();
        scan.nextLine();

        for(int i=0; i<4;i++) {


            System.out.println("Entre com o modelo da cadeira: ");//]
            String modelo = scan.nextLine();
            System.out.println("Entre com a cor do cadeira: ");
            String cor = scan.nextLine();
            System.out.println("Entre com o ano de Fabricação do avião: ");
            int anoDeFabricacao = scan.nextInt();
            System.out.println("Entre com o tecido da cadeira: ");
            String tecido = scan.nextLine();
            scan.nextLine();

            Cadeira Cadeira1 = new Cadeira();

            Cadeira1.setModelo(modelo);
            Cadeira1.setCor(cor);
            Cadeira1.setanoDeFabricacao(anoDeFabricacao);
            Cadeira1.setTecido(tecido);

            System.out.println("-------- CADEIRA " + (i + 1) + " --------");
            System.out.println("Modelo: " + Cadeira1.getModelo());
            System.out.println("Cor: " + Cadeira1.getCor());
            System.out.println("Velocidade: " + Cadeira1.getanoDeFabricacao() + " Km/h");
            System.out.println("Quantidade de Assentos: " + Cadeira1.getTecido());
            System.out.println("-------------------------");

        }
    }
}