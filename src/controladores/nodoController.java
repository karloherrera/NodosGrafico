
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Lista;
import vistas.frmNodos;
import vistas.frmPrincipal;

public class nodoController implements ActionListener {
    frmPrincipal vistaPrincipal;
    frmNodos vistaNodos;
    Lista listaGOD;
    
    public nodoController( frmPrincipal vistaPrincipal, frmNodos vistaNodos, Lista listaGOD){
    
    this.vistaPrincipal = vistaPrincipal;
    this.vistaNodos = vistaNodos;
    this.listaGOD = listaGOD;    
    
    this.vistaPrincipal.btnAgregarNodo.addActionListener(this);
    
    this.vistaPrincipal.setLocationRelativeTo(null);
    this.vistaPrincipal.setVisible(true);
  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== this.vistaPrincipal.btnAgregarNodo){
           //Abre la vista nodos
           //Poner a la escucha los botones
           this.vistaNodos.btnApilar.addActionListener(this);
           //Levantar formulario
           this.vistaNodos.setLocationRelativeTo(null);
           this.vistaNodos.setVisible(true);
    }
       if(e.getSource() == this.vistaNodos.btnApilar){
        this.listaGOD.Apilar(Integer.parseInt(this.vistaNodos.txtDato.getText())); 
        this.vistaNodos.txtLista.setText(this.listaGOD.ListarNodos());
        }
    }
}
