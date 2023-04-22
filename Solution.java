public class Peaje {
    
    //EN ESTE ESPACIO SE ESCRIBEN LOS ATRIBUTOS DE LA CLASE Peaje
    
    
    //A CONTINUACIÓN, BAJO LOS ATRIBUTOS, SE ESCRIBEN LOS MÉTODOS DEFINIDOS
    //EN EL ENUNCIADO DEL PROBLEMA:

    public Peaje(String[] filaCoches) {
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO DEL PROBLEMA
    }
    
    public void proximoCoche(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for(String coche:cochesFlyPass){
            if(coche.equals(cocheABuscar)){
                break;
            }
            if(" ".equals(coche)){
                coche = cocheABuscar;
            }
        }
    }
    
    public void cambiarEstadoPeaje(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
    }
    
    //INSERTE LOS GETTERS Y SETTERS A PARTIR DE ACÁ:
    
    
    
}
