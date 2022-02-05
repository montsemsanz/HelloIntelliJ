import java.time.LocalDate;

public class Libro {
    private String titulo;
    private LocalDate fecha;
    private Estado estado;
    
    
    public Libro(String titulo, LocalDate fecha, Estado estado) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.estado = estado;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Titulo =" + titulo + '\'' +
                ", fecha = " + fecha +
                ", estado =" + estado;
    }
}
