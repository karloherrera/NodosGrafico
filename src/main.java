
import controladores.nodoController;
import modelos.Lista;
import vistas.frmPrincipal;
import vistas.frmNodos;

public class main {

    public static void main(String[] args) {
        frmPrincipal vistaPrincipal = new frmPrincipal();
        frmNodos vistaNodos = new frmNodos(vistaPrincipal,true);
        Lista NuevaLista = new Lista();
        
        //LEVANTAR EL CONTROLADOR
        nodoController nuevoControlador = new nodoController(vistaPrincipal, vistaNodos, NuevaLista);
    }
    
}
