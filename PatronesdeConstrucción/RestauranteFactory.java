package PatronesdeConstrucción;

// PatronesdeConstrucción.RestauranteFactory.java
public class RestauranteFactory {
    public Restaurante crearRestaurante(String tipo) {
        if (tipo.equalsIgnoreCase("rapido")) {
            return new RestauranteRapido();
        } else if (tipo.equalsIgnoreCase("tematico")) {
            return new RestauranteTematico();
        } else if (tipo.equalsIgnoreCase("lujo")) {
            return new RestauranteDeLujo();
        } else {
            throw new IllegalArgumentException("Tipo de restaurante no válido");
        }
    }
}

