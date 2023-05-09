import java.time.LocalDate;  
import java.time.Period;  
public class Persona {
    // ATRIBUTOS

    // CONSTRUCTOR
    public Persona(String identificacion, String nombre, String apellidos, String fechaNacimiento, String email, String telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
    }
    
    // METODO -> NO MODIFICAR NI ELIMINAR
    public int calcularEdad() {  
        // El método parse() retorna una instancia de LocalDate recibiendo una fecha como string
        LocalDate dob = LocalDate.parse(this.fechaNacimiento);  
        // Se obtiene la fecha actual del sistema
        LocalDate curDate = LocalDate.now();  
        // Se calcula la cantidad de tiempo entre fechas y se seleccionan los años
        if ((dob != null) && (curDate != null)) {  
            return Period.between(dob, curDate).getYears();  
        } else {  
            return 0;  
        }  
    }  
    
    // GETTERS Y SETTERS
    public String getIdentificacion() {
        
    }

    public void setIdentificacion(String identificacion) {
        
    }

    public String getNombre() {
        
    }

    public void setNombre(String nombre) {
        
    }

    public String getApellidos() {
        
    }

    public void setApellidos(String apellidos) {
        
    }

    public String getFechaNacimiento() {
        
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        
    }

    public String getEmail() {
        
    }

    public void setEmail(String email) {
        
    }

    public String getTelefono() {
        
    }

    public void setTelefono(String telefono) {
        
    }
}
