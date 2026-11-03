public class VehiculoPorDia extends Vehiculo {
    private int dias;
    private double tarifaDia;

    public VehiculoPorDia(String placa, String propietario, int dias, double tarifaDia) {
        super(placa, propietario, "DIAS", 0, 0, 0);
        this.dias = dias;
        this.tarifaDia = tarifaDia;
    }

    public double calcularCobro() {
        return dias * tarifaDia;
    }
}
