import java.util.ArrayList;
import java.util.List;

public class CRUDdentistas {
    List<Dentistas> dentistas = new ArrayList<>();

    public void criar(Dentistas dentistas) {
        Dentistas.add(dentistas);
    }

    public List<Dentistas> ler() {
        for (Dentistas a: dentistas) {
            System.out.println(a);
        }
        return dentistas;
    }

    public void atualizar(int id,Dentistas dentistas) {
        dentistas.set(id, (Dentistas) dentistas);
    }

    public void deletar (int id) {
        dentistas.remove(id);
    }
}


