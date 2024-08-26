import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor numérico: ");
        double numero = scanner.nextDouble();

        try {
            if (numero < 0) {
                throw new NumeroNegativoExcepcion("El número es negativo");
            } else {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}