package PatronesdeComportamiento;
// RestauranteMediador.java
public class RestauranteMediador implements MediadorRestaurante {
    private Cocina cocina;
    private ServicioCliente servicioCliente;
    private Entrega entrega;

    public RestauranteMediador(Cocina cocina, ServicioCliente servicioCliente, Entrega entrega) {
        this.cocina = cocina;
        this.servicioCliente = servicioCliente;
        this.entrega = entrega;
    }

    @Override
    public void enviar(String mensaje, ComponenteRestaurante origen) {
        if (origen instanceof Cocina) {
            servicioCliente.recibirMensaje(mensaje);
        } else if (origen instanceof ServicioCliente) {
            entrega.recibirMensaje(mensaje);
        }
        // Podríamos agregar más lógica según sea necesario para otras interacciones
    }
}
