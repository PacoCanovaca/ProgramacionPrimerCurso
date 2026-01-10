import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Empleado {
    private String nombre, puesto;
    private double salario;

    @Override
    public String toString() {
        return nombre + " - " + puesto + " - " + salario + "€";
    }
}
