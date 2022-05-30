/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohas.a;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        
        //iniciamos el almacen
        Almacen almacen1 = new Almacen("Centro");
        
      //definimos nuestrops tres clientes
     Cliente cli1 = new Cliente("Patrobas");
        Cliente cli2 = new Cliente("Andronico");
        Cliente cli3 = new Cliente("Tercio");
        
        cli1.banco= new Banco("Azteca");//asignamos banco
        cli1.realizaPago(85.00);
        
        
        //lista de clietes
       
        
        List <Cliente> listaClientes = new ArrayList<>();
        //insertamos los clientes
        listaClientes.add(cli1);
         listaClientes.add(cli2);
          listaClientes.add(cli3);
          
          System.out.println(almacen1.listaClientes);
          //almacen uno quiero asignarle esta lista de clientes
          //ASIGNAMOS LA LISTA DE CLIENTE AL ALMACEN
          almacen1.setListaClientes(listaClientes);
          
          //RESULTADO
          System.out.println(almacen1.listaClientes);
          
          listaClientes.add(new Cliente("Rolas"));
          //le agregamos Rolas al Almacen
          
          
          
          almacen1=null; //eliminamos
         
          System.out.println("hey"+listaClientes);
          
          //**/
    }
    
}
