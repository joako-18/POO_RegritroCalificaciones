package models;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int matricula;
    private Calificacion calificacion;

    public Estudiante(String nombre, String apellido, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.calificacion = new Calificacion();
    }
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Matrícula: " + matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
