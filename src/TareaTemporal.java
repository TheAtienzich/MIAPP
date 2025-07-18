import java.util.*;

public class TareaTemporal extends Tarea {
    Calendar FechaLimite;

    public TareaTemporal(String nombre, String descripcion, Calendar fechaLimite) {
        super(nombre, descripcion);
        FechaLimite = fechaLimite;
    }

    public Calendar getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(Calendar fechaLimite) {
        FechaLimite = fechaLimite;
    }

    @Override
    public String toString() {
        return "TareaTemporal{" +
                "FechaLimite=" + FechaLimite +
                ", descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
