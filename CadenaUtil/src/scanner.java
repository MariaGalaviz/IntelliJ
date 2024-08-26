import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner lectTeclado = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = lectTeclado.nextLine();

        try {
            char caracter = CadenaUtil.caracterEn(cadena, 7);
            System.out.println("El carácter en la posición 7 es: " + caracter);

        } catch (CadenaUtil.IndiceFueraDeRangoException e) {

            System.out.println("Error: " + e.getMessage());
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe;");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        lectTeclado.close();

    }
}
