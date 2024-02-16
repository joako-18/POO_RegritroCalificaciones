package models;

public class Calificacion {
    private int corte1;
    private int corte2;
    private int corte3;

    public Calificacion() {
        this.corte1 = 0;
        this.corte2 = 0;
        this.corte3 = 0;
    }

    public void asignarCalificacion(int corte1, int corte2, int corte3) {
        this.corte1 = corte1;
        this.corte2 = corte2;
        this.corte3 = corte3;
    }

    public int obtenerPromedio() {
        return (corte1 + corte2 + corte3) / 3;
    }

    public int getCorte1() {
        return corte1;
    }

    public int getCorte2() {
        return corte2;
    }

    public int getCorte3() {
        return corte3;
    }
}
