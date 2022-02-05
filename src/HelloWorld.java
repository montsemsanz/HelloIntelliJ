import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        pruebaParsear();
    }
    
    private static void pruebaParsear() {
        String linea = "04/02/2021;prestado";
        String[] datos = linea.trim().split(";");
        LocalDate fechaPrestamo = LocalDate.parse(datos[0].trim(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Estado estado = Estado.valueOf(datos[1].trim().toUpperCase());
        Libro libro = new Libro("Probando", fechaPrestamo, estado);
        System.out.println(libro);
    }
}
