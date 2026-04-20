import java.util.Scanner;

public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        this.nombre = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        this.precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        this.cantidad = scanner.nextInt();
    }

    //lo de la actividad adicional
    public void mostrarFactura() {
        double total = this.precio * this.cantidad;
        if (total > 1000) {
            total = total - (total * 0.10);
        }

        System.out.println("----------- FACTURA -----------");
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio unitario: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Total a pagar: " + total);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Producto prod = new Producto();
        prod.ingresarDatos();
        prod.mostrarFactura();
    }
}