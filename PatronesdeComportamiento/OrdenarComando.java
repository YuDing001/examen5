package PatronesdeComportamiento;
// OrdenarComando.java
public class OrdenarComando implements Comando {
    private PatronesdeComportamiento.restaurante restaurante;

    public OrdenarComando(PatronesdeComportamiento.restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void ejecutar() {
        restaurante.ordenar();
    }
}