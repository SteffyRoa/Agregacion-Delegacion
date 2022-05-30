
package modelohas.a;

public class Banco {
 String nombre;

    public Banco(String nombre) {
        this.nombre = nombre;
    }
    
    boolean pagar(double cantidad){
        //logica para el pago
        System.out.println("El banco:"+nombre+"realizo pago de "+cantidad);
        
     return true;
     //siempre sale en true
        
    }
 
}
