import java.util.Scanner;

public class CompetenciaSalto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 10;

        String[] nombres = new String[MAX];
        double[] marca2024 = new double[MAX];
        double[] marca2025 = new double[MAX];
        double[] marca2026 = new double[MAX];

        int contador = 0;
        int opcion;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Inscribir participante");
            System.out.println("2. Mostrar listado por dorsal");
            System.out.println("3. Mostrar listado por marca 2024 (mayor a menor)");
            System.out.println("4. Finalizar");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    if (contador < MAX) {
                        System.out.println("\n--- Nuevo Participante ---");

                        System.out.print("Nombre: ");
                        nombres[contador] = sc.nextLine();

                        System.out.print("Mejor marca 2024: ");
                        marca2024[contador] = sc.nextDouble();

                        System.out.print("Mejor marca 2025: ");
                        marca2025[contador] = sc.nextDouble();

                        System.out.print("Mejor marca 2026: ");
                        marca2026[contador] = sc.nextDouble();

                        contador++;
                        System.out.println("Participante inscrito correctamente.");
                    } else {
                        System.out.println("No hay más cupos disponibles.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTADO POR DORSAL ---");

                    for (int i = 0; i < contador; i++) {
                        System.out.println("Dorsal #" + (i + 1));
                        System.out.println("Nombre: " + nombres[i]);
                        System.out.println("2024: " + marca2024[i]);
                        System.out.println("2025: " + marca2025[i]);
                        System.out.println("2026: " + marca2026[i]);
                        System.out.println("----------------------");
                    }
                    break;

                case 3:
                    System.out.println("\n--- LISTADO ORDENADO (2024) ---");

                    // Copias para no alterar el original
                    String[] nombresOrden = nombres.clone();
                    double[] m2024Orden = marca2024.clone();
                    double[] m2025Orden = marca2025.clone();
                    double[] m2026Orden = marca2026.clone();

                    // Ordenamiento burbuja (mayor a menor)
                    for (int i = 0; i < contador - 1; i++) {
                        for (int j = 0; j < contador - i - 1; j++) {
                            if (m2024Orden[j] < m2024Orden[j + 1]) {

                                // Intercambiar marcas 2024
                                double temp = m2024Orden[j];
                                m2024Orden[j] = m2024Orden[j + 1];
                                m2024Orden[j + 1] = temp;

                                // Intercambiar marcas 2025
                                temp = m2025Orden[j];
                                m2025Orden[j] = m2025Orden[j + 1];
                                m2025Orden[j + 1] = temp;

                                // Intercambiar marcas 2026
                                temp = m2026Orden[j];
                                m2026Orden[j] = m2026Orden[j + 1];
                                m2026Orden[j + 1] = temp;

                                // Intercambiar nombres
                                String tempNombre = nombresOrden[j];
                                nombresOrden[j] = nombresOrden[j + 1];
                                nombresOrden[j + 1] = tempNombre;
                            }
                        }
                    }

                    // Mostrar ordenado
                    for (int i = 0; i < contador; i++) {
                        System.out.println((i + 1) + ". " + nombresOrden[i] +
                                " | 2024: " + m2024Orden[i] +
                                " | 2025: " + m2025Orden[i] +
                                " | 2026: " + m2026Orden[i]);
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}

