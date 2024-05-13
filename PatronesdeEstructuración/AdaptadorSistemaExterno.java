package PatronesdeEstructuración;
// AdaptadorSistemaExterno.java
public class AdaptadorSistemaExterno implements ComponenteRestaurante {
    private SistemaExterno sistemaExterno;

    public AdaptadorSistemaExterno(SistemaExterno sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    @Override
    public void servirComida() {
        // Adaptamos la operación para que funcione con nuestro sistema interno
        sistemaExterno.entregarComida();
    }
}
