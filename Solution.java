public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static int [] reporte(int [] participantes)
    {
        //EN ESTE ESPACIO PONER SU LÓGICA
        int tiempoMenor = participantes[0];
        int tiempoMayor = participantes[0];
        int cantidadParticipantes = 0;
        
        for (int i=0; i<participantes.length; i++)
        {
            cantidadParticipantes = participantes.length;
            if (participantes[i]>tiempoMayor)
            {
                tiempoMayor = participantes[i];
            }
            else if (participantes[i]<tiempoMenor)
            {
                tiempoMenor = participantes[i];
            }    
        }
        int[] reporte = {cantidadParticipantes, tiempoMenor, tiempoMayor}; 
        return reporte;
    }
}
