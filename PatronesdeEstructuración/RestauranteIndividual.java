package PatronesdeEstructuración;

// RestauranteIndividual.java
public class RestauranteIndividual implements ComponenteRestaurante {
    private String nombre;

    public RestauranteIndividual(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void servirComida() {
        System.out.println("Sirviendo comida en restaurante individual " + nombre);
    }
}
