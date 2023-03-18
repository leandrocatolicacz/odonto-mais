public class Consultorio {

    int number;
    double hora;

    public Consultorio(int number, double hora) {
        this.number = number;
        this.hora = hora;
    }

    public static void add(Consultorio consultorio) {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }
}
