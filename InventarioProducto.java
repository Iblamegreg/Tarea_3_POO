public class InventarioProducto {
    private String codigo;
    private String nombreComercial;
    private String categoria;
    private double precioUnitario;
    private int stockDisponible;
    private int stockMinimo;

    public InventarioProducto(String codigo, String nombreComercial, String categoria, double precioUnitario, int stockDisponible, int stockMinimo) {
        this.codigo = codigo;
        this.nombreComercial = nombreComercial;
        this.categoria = categoria;
        setPrecioUnitario(precioUnitario);
        setStockMinimo(stockMinimo);
        setStockDisponible(stockDisponible);
    }

    public String getCodigo() { return codigo; }
    public String getNombreComercial() { return nombreComercial; }
    public String getCategoria() { return categoria; }
    public double getPrecioUnitario() { return precioUnitario; }
    public int getStockDisponible() { return stockDisponible; }
    public int getStockMinimo() { return stockMinimo; }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("ERROR: El precio unitario debe ser mayor a cero. Se mantiene el valor actual.");
        }
    }

    public void setStockMinimo(int stockMinimo) {
        if (stockMinimo >= 0) {
            this.stockMinimo = stockMinimo;
        } else {
            System.out.println("ERROR: El stock mínimo no puede ser negativo. Se mantiene el valor actual.");
        }
    }

    public void setStockDisponible(int stockDisponible) {
        if (stockDisponible >= 0) {
            this.stockDisponible = stockDisponible;
        } else {
            System.out.println("ERROR: El stock disponible no puede ser negativo. Intento de asignar: " + stockDisponible + ". Se mantiene el valor actual.");
        }
    }

    public double calcularValorInventario() {
        return this.precioUnitario * this.stockDisponible;
    }

    public String evaluarEstadoStock() {
        if (this.stockDisponible == 0) {
            return "Producto agotado";
        } else if (this.stockDisponible < this.stockMinimo) {
            return "Requiere reposición";
        } else {
            return "Stock suficiente";
        }
    }

    public void generarReporte() {
        System.out.println("\n===== REPORTE DE INVENTARIO =====");
        System.out.println("Código: " + this.codigo);
        System.out.println("Producto: " + this.nombreComercial);
        System.out.println("Categoría: " + this.categoria);
        System.out.println("Precio Unitario: $" + this.precioUnitario);
        System.out.println("Stock Disponible: " + this.stockDisponible);
        System.out.println("Stock Mínimo: " + this.stockMinimo);
        System.out.println("Valor Total del Inventario: $" + calcularValorInventario());
        System.out.println("Estado del Stock: " + evaluarEstadoStock());
        System.out.println("=================================\n");
    }

    public static void main(String[] args) {
        InventarioProducto producto = new InventarioProducto("PRD-105", "Disco SSD 1TB", "Almacenamiento", 89.50, 12, 8);
        producto.generarReporte();

        producto.setPrecioUnitario(95.00);
        producto.setStockDisponible(5);
        producto.generarReporte();

        producto.setStockDisponible(-3);
        producto.generarReporte();
    }
}