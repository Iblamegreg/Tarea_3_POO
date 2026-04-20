import java.util.Scanner;

public class PlanillaLuz {
    String cliente;
    double consumo;
    double costoKw;

    public double calcularSubtotal() {
        return this.consumo * this.costoKw;
    }

    public double calcularIva() {
        return calcularSubtotal() * 0.15;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIva();
    }

    public void procesarPlanilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cliente: ");
        this.cliente = scanner.nextLine();
        System.out.print("Consumo (kW): ");
        this.consumo = scanner.nextDouble();
        System.out.print("Costo por kW: ");
        this.costoKw = scanner.nextDouble();

        System.out.println("----------- PLANILLA DE LUZ -----------");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("IVA: " + calcularIva());
        System.out.println("Total a pagar: " + calcularTotal());
        System.out.println("---------------------------------------");
    }

    public static void main(String[] args) {
        PlanillaLuz planilla = new PlanillaLuz();
        planilla.procesarPlanilla();
    }
}