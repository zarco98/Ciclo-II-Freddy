public class TarjetaPlata extends TarjetaCine {
    //Atributos
    private int cantidadVisitas = 0;
    private boolean elegibleOro = false;

    //Constructor
    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad){    
        super(idTarjeta, nombreCompleto, email, telefono, edad, 10);
    }

    //Método
   
    @Override
    public double pagar(String[] cuenta) {
        this.cantidadVisitas++;
        if (this.cantidadVisitas >= 5)
        {
            this.elegibleOro = true;
        }
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
        return cuentaTotal*(1 - super.getPorcentajeDescuento() /100);
    }

    //Getters y Setters

    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }
}
