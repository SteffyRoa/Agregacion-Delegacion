
package modelohas.a;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //Atributos
    String nombre;
    Banco banco;

    
    //constructor
    public Cliente(String nombre) {
        //inicializamos
        this.nombre = nombre;
       
    }

    //
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + '}';
    }
    
    
  void  realizaPago(double cantidad){
      //delegamos a la vista
      banco.pagar(cantidad); //quiero que pagues la cantidad que te voy a pasar como parametro
   boolean resultado = banco.pagar(cantidad);
      System.out.println(""+resultado);
  }

}
