package View;

import java.util.Scanner;

public class Menu {

    public static Scanner teclado = new Scanner(System.in);

    public static void iniciarSecao() {

        System.out.println("\nEscolha uma opção:");
        System.out.println("\n1-Roupas;\n2-Cliente;\n3-Venda;\n0-SAIR");

        String opcao = teclado.nextLine();

        switch (opcao) { // Direcionar as seções

            case "1":
                System.out.println("Cadastrando Roupas....");

                RoupasView.cadastroRoupa(); // chamando o metodo para cadastrar roupa

                break;

            case "2":
                System.out.println("Cadastrando Clientes....");

                ClienteView.cadastroCliente(); // chamando metodo para cadastrar cliente

                break;

            case "3":
                System.out.println("Efetuando Venda");

                VendaView.efetuarVenda(); // chamar o metodo para efetuar a venda 

                break;

            case "0":
                System.out.println("Saindo...");

                break;

            default:
                System.out.println("Opção Invalida");

                iniciarSecao();

                break;

        }

    }

}
