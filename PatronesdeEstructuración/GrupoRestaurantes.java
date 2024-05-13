package PatronesdeEstructuración;
// GrupoRestaurantes.java
import java.util.ArrayList;
import java.util.List;

public class GrupoRestaurantes implements ComponenteRestaurante {
    private List<ComponenteRestaurante> restaurantes = new ArrayList<>();

    public void agregarRestaurante(ComponenteRestaurante restaurante) {
        restaurantes.add(restaurante);
    }

    @Override
    public void servirComida() {
        for (ComponenteRestaurante restaurante : restaurantes) {
            restaurante.servirComida();
        }
    }
}
