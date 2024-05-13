package PatronesdeComportamiento;
// ReservarComando.java
public class ReservarComando implements Comando {
    private PatronesdeComportamiento.restaurante restaurante;

    public ReservarComando(PatronesdeComportamiento.restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void ejecutar() {
        restaurante.reservar();
    }
}
