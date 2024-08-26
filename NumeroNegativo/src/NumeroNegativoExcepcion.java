public class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion() {
        super("El número es negativo");
    }

    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}
