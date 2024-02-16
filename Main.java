import models.Calificacion;
import models.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        boolean flag = true;
        do {
            System.out.println("----------Menu----------");
            System.out.println("-------1.Docente--------");
            System.out.println("------2.Estudiante------");
            System.out.println("--------X.Salir---------");
            System.out.print("---Seleccione una opcion:");
            String opcion = teclado.next();
            switch (opcion){
                case "1":
                    boolean flag2 = true;
                    do {
                        System.out.println("----------Menu----------");
                        System.out.println("--1.Agregar estudiante--");
                        System.out.println("-2.Asignar calificacion-");
                        System.out.println("-3.Imprimir estudiantes-");
                        System.out.println("--------X.Salir---------");
                        System.out.print("---Seleccione una opcion:");
                        String opscion2 = teclado.next();
                        switch (opscion2){
                            case "1":
                                System.out.print("Ingrese el nombre: ");
                                String nombre = teclado.next();
                                System.out.print("Ingrese el apellido: ");
                                String apellido = teclado.next();
                                System.out.print("Ingrese la matricula: ");
                                int matricula = teclado.nextInt();
                                teclado.nextLine();
                                Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, matricula);
                                estudiantes.add(nuevoEstudiante);
                                System.out.println("Estudiante agregado");
                                break;
                            case "2":
                                System.out.print("Ingrese la matrícula del estudiante: ");
                                int matriculaEstudiante = teclado.nextInt();
                                System.out.print("Ingrese la calificación del corte 1: ");
                                int corte1 = teclado.nextInt();
                                System.out.print("Ingrese la calificación del corte 2: ");
                                int corte2 = teclado.nextInt();
                                System.out.print("Ingrese la calificación del corte 3: ");
                                int corte3 = teclado.nextInt();

                                for (Estudiante estudiante : estudiantes) {
                                    if (estudiante.getMatricula() == matriculaEstudiante) {

                                        estudiante.getCalificacion().asignarCalificacion(corte1, corte2, corte3);
                                        System.out.println("Calificaciones asignadas correctamente");
                                        break;
                                    }
                                }
                                break;
                            case "3":
                                System.out.println("------ Lista de estudiantes ------");
                                int i = 1;
                                for (Estudiante estudiant : estudiantes) {
                                    System.out.println(i + ".- " + estudiant.toString());
                                    i++;
                                }
                                break;
                            default:
                                flag2 = false;
                                break;
                        }
                    }while (flag2);
                    break;
                case "2":
                    boolean flag3 = true;
                    do {
                        System.out.println("----------Menu----------");
                        System.out.println("1.Ver calificaciones y promedio");
                        System.out.println("--------X.Salir---------");
                        System.out.print("--Seleccione una opcion-");
                        String opscion3 = teclado.next();
                        switch (opscion3){
                            case "1":
                                System.out.print("Ingrese la matrícula del estudiante: ");
                                int matriculaEstudiante2 = teclado.nextInt();
                                boolean encontrado = false;

                                for (Estudiante estudiante : estudiantes) {
                                    if (estudiante.getMatricula() == matriculaEstudiante2) {
                                        encontrado = true;
                                        Calificacion calificacion = estudiante.getCalificacion();

                                        if (calificacion != null) {
                                            System.out.println("Calificación corte 1: " + calificacion.getCorte1());
                                            System.out.println("Calificación corte 2: " + calificacion.getCorte2());
                                            System.out.println("Calificación corte 3: " + calificacion.getCorte3());
                                            System.out.println("Promedio: " + calificacion.obtenerPromedio());
                                        } else {
                                            System.out.println("Este estudiante no tiene calificaciones asignadas.");
                                        }
                                    }
                                }

                                if (!encontrado) {
                                    System.out.println("Estudiante no encontrado.");
                                }
                                break;
                            default:
                                flag3 = false;
                                break;
                        }
                    }while (flag3);
                    break;
                default:
                    flag = false;
                    break;
            }
        }while (flag);
    }
}