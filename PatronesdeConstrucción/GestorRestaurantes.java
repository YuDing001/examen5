package PatronesdeConstrucción;

// PatronesdeConstrucción.GestorRestaurantes.java
public class GestorRestaurantes {
    private static GestorRestaurantes instancia;

    private GestorRestaurantes() {
        // Constructor privado para evitar instanciación externa
    }

    public static synchronized GestorRestaurantes getInstancia() {
        if (instancia == null) {
            instancia = new GestorRestaurantes();
        }
        return instancia;
    }

    // Aquí irían métodos para gestionar los restaurantes
}
