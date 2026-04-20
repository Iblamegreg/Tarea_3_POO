import java.util.Scanner;

public class Estudiante {
    String nombre;
    String carrera;
    int edad;

    public void registrarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Ingrese la carrera: ");
        this.carrera = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        this.edad = scanner.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("----- DATOS DEL ESTUDIANTE -----");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Edad: " + this.edad);
    }

    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.registrarDatos();
        est.mostrarDatos();
    }
}