
public class App {

    public static void main(String[] args) throws Exception {
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = i + 1;
            System.out.println(numeros[i]);
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
                                                                                                                                                                                                                                                                      