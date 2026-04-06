import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double[] ventas = new double[7];
        double suma = 0;
        double mayor = 0;
        double menor = 0;
        int contadorMayor100k = 0;
        int contadorMenor50k = 0;
        
        
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese la venta del día " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
            
            
            if (ventas[i] < 0) {
                System.out.println("Valor inválido. Intente nuevamente.");
                i--; // repetir ese día
                continue;
            }
            
            
            suma += ventas[i];
            
            if (i == 0) {
                mayor = ventas[i];
                menor = ventas[i];
            } else {
                if (ventas[i] > mayor) {
                    mayor = ventas[i];
                }
                if (ventas[i] < menor) {
                    menor = ventas[i];
                }
            }
            
        
            if (ventas[i] > 100000) {
                contadorMayor100k++;
            }
            
            if (ventas[i] < 50000) {
                contadorMenor50k++;
            }
        }
        
        
        double promedio = suma / ventas.length;
        
        
        System.out.println("\n===== VENTAS DE LA SEMANA =====");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Día " + (i + 1) + ": $" + ventas[i]);
        }
        
    
        System.out.println("\n===== RESUMEN =====");
        System.out.println("Venta más alta: $" + mayor);
        System.out.println("Venta más baja: $" + menor);
        System.out.printf("Promedio de ventas: $%.2f\n", promedio);
        System.out.println("Días con ventas > 100.000: " + contadorMayor100k);
        System.out.println("Días con ventas < 50.000: " + contadorMenor50k);
        System.out.println("Total acumulado: $" + suma);
    }
}