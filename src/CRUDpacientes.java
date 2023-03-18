import java.util.ArrayList;
import java.util.List;

public class CRUDpacientes {
    List<Pacientes> pacientes = new ArrayList<>();

    public void criar(Pacientes pacientes) {
        Pacientes.add(pacientes);
    }

    public List<Pacientes> ler() {
        for (Pacientes a: pacientes) {
            System.out.println(a);
        }
        return pacientes;
    }

    public void atualizar(int id,Pacientes pacientes) {
        pacientes.set(id, pacientes);
    }

    public void deletar (int id) {
        pacientes.remove(id);
    }
}

