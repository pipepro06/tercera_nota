import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el valor total de la compra: ");
        double valorCompra = scanner.nextDouble();
        
        
        if (valorCompra < 0) {
            System.out.println("Error: El valor ingresado es inválido.");
            return;
        }
        
        double porcentajeDescuento = 0;
        
        
        if (valorCompra < 50000) {
            porcentajeDescuento = 0;
        } else if (valorCompra >= 50000 && valorCompra <= 99999) {
            porcentajeDescuento = 0.05;
        } else if (valorCompra >= 100000 && valorCompra <= 199999) {
            porcentajeDescuento = 0.10;
        } else {
            porcentajeDescuento = 0.15;
        }
        
        
        double valorDescuento = valorCompra * porcentajeDescuento;
        double valorFinal = valorCompra - valorDescuento;
        
        System.out.println("\n===== RESUMEN DE COMPRA =====");
        System.out.println("Cliente: " + nombre);
        System.out.println("Valor original: $" + valorCompra);
        System.out.println("Descuento aplicado: " + (porcentajeDescuento * 100) + "%");
        System.out.println("Valor descontado: $" + valorDescuento);
        System.out.println("Valor final a pagar: $" + valorFinal);
        
    }
}
