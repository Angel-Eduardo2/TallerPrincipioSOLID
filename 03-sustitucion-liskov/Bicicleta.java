public class Bicicleta extends Vehiculo {

    public Bicicleta(String codigo, String propietario, double valorMensualidad) {
        super(codigo, propietario, "MENSUAL", valorMensualidad, 0, 0);
    }

    public double calcularCobro() {
        return valorMensualidad;
    }
}
