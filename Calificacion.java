import java.util.Scanner;

public class Calificacion {
    String nombre;
    double nota1;
    double nota2;
    double nota3;

    public double calcularPromedio() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public String determinarEstado() {
        if (calcularPromedio() >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void registrarYMostrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Nota 1: ");
        this.nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        this.nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        this.nota3 = scanner.nextDouble();

        System.out.println("-------- REPORTE ACADÉMICO --------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Promedio final: " + calcularPromedio());
        System.out.println("Estado: " + determinarEstado());
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Calificacion cal = new Calificacion();
        cal.registrarYMostrar();
    }
}