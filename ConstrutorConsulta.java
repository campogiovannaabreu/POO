package MetodosConstrutores;
import java.util.Date;
public class ConstrutorConsulta {
    public static void main(String[] args) {
        Date dataConsulta = new Date();
        Consulta consulta = new Consulta(dataConsulta, "Giovanna");

        System.out.println("Data: " + consulta.getData());
        System.out.println("Nome Paciente: " + consulta.getNomePcte());
    }
}
