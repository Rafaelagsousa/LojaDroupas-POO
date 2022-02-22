package View;

import java.util.Scanner;
import java.util.Vector;

import Model.Cliente;
import Model.DAO.ClientesBD;

public class ClienteView {

    public static Scanner teclado = new Scanner(System.in); // String

    public static void cadastroCliente() {

        Vector<Cliente> armazenaClientes = new Vector<>();

        while (true) {

            System.out.println("Informe fim para parar!!");

            System.out.println("Informe seu nome:");
            String nome = teclado.nextLine();

            if (nome.equals("fim")) { //parar de cadastrar cliente

                break;

            }

            System.out.println("informe seu endereço:");
            String endereco = teclado.nextLine();

            System.out.println("Informe seu telefone:");
            String telefone = teclado.nextLine();

            Cliente novoCliente = new Cliente(nome, endereco, telefone); //Cria um objeto do tipo cliente passadas pelo usuario

            armazenaClientes.add(novoCliente); // armazenando no vetor um objeto do tipo cliente
        }

        ClientesBD.inserirClientes(armazenaClientes);

          Menu.iniciarSecao();
    }

}
