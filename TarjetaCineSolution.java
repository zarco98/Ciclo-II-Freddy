public class TarjetaCine {
 //Atributos
    private String idTarjeta;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private int edad;
    private double porcentajeDescuento;
    //Constructor

    public TarjetaCine(String idTarjeta, String nombreCompleto, String email, String telefono, int edad, double porcentajeDescuento) {
        this.idTarjeta = idTarjeta;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    //Método
    public double pagar(String[] cuenta)
    {
        int cuentaTotal = 0;
        for (String factura:cuenta)
        {
            if(factura == "Boleta")
            {
                cuentaTotal += 6000;
            } 
            else if (factura == "Combo 1 - Crispetas + Gaseosa")
            {
                cuentaTotal += 8000;
            }
            else if (factura == "Combo 2 - Perro + Gaseosa")
            {
                cuentaTotal += 12000;
            }     
        }
        return cuentaTotal*(1 - this.porcentajeDescuento /100);
    }

    //Getters y Setters

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
