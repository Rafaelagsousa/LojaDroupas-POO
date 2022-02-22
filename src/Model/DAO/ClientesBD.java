package Model.DAO;

import java.util.Vector;

import Model.Cliente;

public class ClientesBD {

    public static Vector<Cliente> clientes;

    public static void iniciarBdClientes() {

        clientes = new Vector<>();

    }

    public static void inserirClientes(Vector<Cliente> armazenaClientes) {

        for (int i = 0; i < armazenaClientes.size(); i++) {

            clientes.add(armazenaClientes.get(i));
        }

    }

    public static Vector<Cliente> recupeClientes() {

        return clientes;

    }

}
