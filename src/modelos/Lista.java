
package modelos;

import javax.swing.JOptionPane;

public class Lista {
    Nodo primero;
    Nodo Auxiliar;
    String cadena ="";
    
    public void Apilar(){     
    }
   
    public void Apilar(int dato){
    Nodo nodoNuevo = new Nodo(dato);
    if(primero == null){
      primero = nodoNuevo;  
    }
    else {
        nodoNuevo.siguiente = primero;
        primero = nodoNuevo;
    }
    JOptionPane.showMessageDialog(null,"Nodo Apilado");
}
    public String ListarNodos(){
        Auxiliar = primero;
        cadena ="";
        while(Auxiliar!=null){
        cadena = cadena + "{" + Auxiliar.getDato() + "}";
        Auxiliar = Auxiliar.siguiente;
        }
        return cadena;
    }
}
