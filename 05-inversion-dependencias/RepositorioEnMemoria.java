import java.util.LinkedHashMap;
import java.util.Map;

public class RepositorioEnMemoria implements RepositorioCobros {
    private final Map<String, Double> cobros = new LinkedHashMap<>();

    public void insertar(String placa, double cobro) {
        cobros.put(placa, cobro);
        System.out.println("[Memoria] Cobro guardado para " + placa + ": " + cobro);
    }
}
