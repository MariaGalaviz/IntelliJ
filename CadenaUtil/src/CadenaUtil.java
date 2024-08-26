public class CadenaUtil {

    public static class IndiceFueraDeRangoException extends Exception {
        public IndiceFueraDeRangoException(String mensaje) {
            super(mensaje);
        }
    }

    public static char caracterEn(String cadena, int indice) throws IndiceFueraDeRangoException {
        if (indice >= 0 && indice < cadena.length()) {
            return cadena.charAt(indice);
        } else {
            throw new IndiceFueraDeRangoException("El índice debe estar entre 0 y " + (cadena.length() - 1));
        }
    }
}
