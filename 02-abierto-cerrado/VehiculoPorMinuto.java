public class VehiculoPorMinuto extends Vehiculo {
    public VehiculoPorMinuto(String placa, String propietario, int minutos, double tarifaMinuto) {
        super(placa, propietario, "MINUTOS", 0, tarifaMinuto, minutos);
    }

    public double calcularCobro() {
        return minutos * tarifaMinuto;
    }
}
