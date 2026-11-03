public class VehiculoMensual extends Vehiculo implements Fidelizable {
    public VehiculoMensual(String placa, String propietario, double valorMensualidad) {
        super(placa, propietario, "MENSUAL", valorMensualidad, 0, 0);
    }

    public double calcularCobro() {
        return valorMensualidad;
    }

    public int calcularPuntos() {
        return (int) (valorMensualidad / 10000);
    }
}
