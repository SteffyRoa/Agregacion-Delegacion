/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohas.a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sroa
 */
public class Cuenta {
    
    String clave;
List<Cuenta> listaCuentas = new ArrayList<>();
    List<Cliente> listaClientes;//lista de clientes
    public Cuenta(String clave) {
        this.clave = clave;
         listaClientes = new ArrayList<>();//Inicializacion de Array de clientes
    }

    @Override
    public String toString() {
        return "Cuenta{" + "clave=" + clave + '}';
    }
    
       ///Creacion de SETTER
    void setCuenta(Cuenta cuenta){
        listaCuentas.add(cuenta);
    }
    
    
    
    void setListaClientes(List<Cliente>listaClientes){
        this.listaClientes = listaClientes;
     
    }
}
