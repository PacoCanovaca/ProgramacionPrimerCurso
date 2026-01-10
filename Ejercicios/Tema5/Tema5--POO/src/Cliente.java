import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Cliente {
    private String nombre, email;
    private Direccion direccion;

    @Override
    public String toString() {
        return "Cliente: " + nombre + "\n" +
                "Email: " + email + "\n" +
                "Dirección: " + direccion.getCalle() + ", " + direccion.getCiudad() + ", " + direccion.getCodigoPostal();
    }
}
