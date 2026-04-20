import java.util.Scanner;

public class Empleado {
    String nombre;
    double horasTrabajadas;
    double pagoPorHora;

    public double calcularSueldoBase() {
        return this.horasTrabajadas * this.pagoPorHora;
    }

    public double calcularBono() {
        return 20.0;
    }

    public double calcularSueldoFinal() {
        return calcularSueldoBase() + calcularBono();
    }

    public void mostrarReporte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Horas trabajadas: ");
        this.horasTrabajadas = scanner.nextDouble();
        System.out.print("Pago por hora: ");
        this.pagoPorHora = scanner.nextDouble();

        System.out.println("----------- REPORTE DE EMPLEADO -----------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Sueldo base: " + calcularSueldoBase());
        System.out.println("Bono: " + calcularBono());
        System.out.println("Sueldo final: " + calcularSueldoFinal());
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.mostrarReporte();
    }
}