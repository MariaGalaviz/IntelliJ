public class Main {
    public static void main(String[] args) {
        try {
            String cadena = "Hola mundo";
            char caracter = CadenaUtil.caracterEn(cadena, 3);
            System.out.println("El carácter en la posición 3 es: " + caracter);
        } catch (CadenaUtil.IndiceFueraDeRangoException e) {
                    System.out.println("Error: " + e.getMessage());
        }
    }
}
