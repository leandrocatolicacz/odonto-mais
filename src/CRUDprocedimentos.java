import java.util.ArrayList;
import java.util.List;

public class CRUDprocedimentos {
    List<Procedimentos> procedimentos = new ArrayList<>();

    public void criar(Procedimentos procedimentos) {
        Procedimentos.add(procedimentos);
    }

    public List<Procedimentos> ler() {
        for (Procedimentos a: procedimentos) {
            System.out.println(a);
        }
        return procedimentos;
    }

    public void atualizar(int id,Procedimentos procedimentos) {
        procedimentos.set(id, (Procedimentos) procedimentos);
    }

    public void deletar (int id) {
        procedimentos.remove(id);
    }
}


