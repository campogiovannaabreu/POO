package MetodosConstrutores;
import java.util.Date;
public class Consulta {
    private Date data;
    private String nomePcte;
    private String nomeDents;


    public Consulta() {
        this.data = new Date();
        this.nomePcte = "Desconhecido";
        this.nomeDents = "Indefinido";
    }

    public Consulta(Date data, String nomePcte) {
        this.data = data;
        this.nomePcte = nomePcte;
        this.nomeDents = "Indefinido";
    }

    public Consulta(Date data, String nomePcte, String nomeDents) {
        this.data = data;
        this.nomePcte = nomePcte;
        this.nomeDents = nomeDents;
    }


    public Date getData() {
        return data;
    }

    public String getNomePcte() {
        return nomePcte;
    }

    public String getNomeDents() {
        return nomeDents;
    }


    public void setData(Date data) {
        this.data = data;
    }

    public void setNomePcte(String nomePcte) {
        this.nomePcte = nomePcte;
    }

    public void setNomeDents(String nomeDents) {
        this.nomeDents = nomeDents;
    }
}


