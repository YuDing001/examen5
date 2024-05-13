package PatronesdeComportamiento;
// CancelarComando.java
public class CancelarComando implements Comando {
    private PatronesdeComportamiento.restaurante restaurante;

    public CancelarComando(PatronesdeComportamiento.restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void ejecutar() {
        restaurante.cancelar();
    }
}