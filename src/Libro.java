import java.time.LocalDate;

public class Libro {
    private String titulo;
    private LocalDate fecha;
    private Estado estado;
    
    
    public Libro(String titulo, LocalDate fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.estado = Estado.NOPRESTADO;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    
    @Override
    public String toString() {
        return "Titulo =" + titulo + '\'' +
                ", fecha = " + fecha +
                ", estado =" + estado;
    }
}
