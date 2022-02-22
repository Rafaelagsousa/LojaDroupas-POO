import Model.DAO.ClientesBD;
import Model.DAO.RoupasBD;
import View.Menu;

public class App {
    public static void main(String[] args) throws Exception {

        RoupasBD.inicarBdRoupas(); //iniciando o bancoRoupas 
        ClientesBD.iniciarBdClientes(); // '''' banco clientes
        Menu.iniciarSecao();    //inicializaçao do programa
    }
}
