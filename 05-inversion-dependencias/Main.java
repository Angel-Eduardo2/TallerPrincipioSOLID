import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new VehiculoMensual("KLM321", "Camila Rojas", 180000));
        vehiculos.add(new VehiculoPorMinuto("XYZ45F", "Andrés Mora", 80, 1500));
        vehiculos.add(new Bicicleta("BIC-07", "Valentina Díaz", 40000));
        vehiculos.add(new VehiculoPorDia("DIA-11", "Laura Pérez", 2, 25000));

        RepositorioCobros repositorio = new RepositorioEnMemoria();
        GestorParqueadero gestor = new GestorParqueadero(repositorio);
        ExportadorCSV exportador = new ExportadorCSV();
        NotificadorSMS notificador = new NotificadorSMS();

        gestor.cerrarMes(vehiculos, exportador, notificador);
    }
}
