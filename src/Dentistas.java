public class Dentistas {

    String name;
    int idad;
    String especialidade;

    public Dentistas(String name, int idad, String especialidade) {
        this.name = name;
        this.idad = idad;
        this.especialidade = especialidade;
    }

    public static void add(Dentistas dentistas) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdad() {
        return idad;
    }

    public void setIdad(int idad) {
        this.idad = idad;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void set(int id, Dentistas dentistas) {
    }
}
