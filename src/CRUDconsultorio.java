import java.util.ArrayList;
import java.util.List;

public class CRUDconsultorio {
    List<Consultorio> consultorios = new ArrayList<>();

    public void criar(Consultorio consultorio) {
        Consultorio.add(consultorio);
    }

    public List<Consultorio> ler() {
        for (Consultorio a: consultorios) {
            System.out.println(a);
        }
        return consultorios;
    }

    public void atualizar(int id,Pacientes consutorio) {
        consultorios.set(id, (Consultorio) consultorios);
    }

    public void deletar (int id) {
        consultorios.remove(id);
    }
}


