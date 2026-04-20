import java.util.Scanner;

public class PedidoRestaurante {
    String cliente;
    String plato;
    double precio;
    int cantidad;

    public double calcularSubtotal() {
        return this.precio * this.cantidad;
    }

    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        if (subtotal > 25) {
            return subtotal * 0.10;
        }
        return 0.0;
    }

    public double calcularTotalFinal() {
        return calcularSubtotal() - calcularDescuento();
    }

    public void imprimirCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cliente: ");
        this.cliente = scanner.nextLine();
        System.out.print("Plato: ");
        this.plato = scanner.nextLine();
        System.out.print("Precio: ");
        this.precio = scanner.nextDouble();
        System.out.print("Cantidad: ");
        this.cantidad = scanner.nextInt();

        System.out.println("------------- CUENTA DEL PEDIDO -------------");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Plato: " + this.plato);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("Descuento: " + calcularDescuento());
        System.out.println("Total final: " + calcularTotalFinal());
    }

    public static void main(String[] args) {
        PedidoRestaurante pedido = new PedidoRestaurante();
        pedido.imprimirCuenta();
    }
}