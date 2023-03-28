package salud;

public class Per_ejecucion {

    public static void main(String[]args) {
        

        personas cliente = new personas(null, 0, null, null, 0, 0, 0, null);
        Empleado empleado = new Empleado(null, 0, null, null, 0, 0, 0, null, null, null, 0, 0);


        
        cliente.pedirDatos();
        /*cliente.mostrarDatospersona(); */
        

        cliente.mostrarDatospersona();
        cliente.calcularlmc();
        cliente.calcularHonorarios();
        
      
        
        
        
    }

    
}
