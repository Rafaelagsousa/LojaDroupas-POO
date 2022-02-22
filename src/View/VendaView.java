package View;

import java.util.Scanner;
import java.util.Vector;

import Controller.VendaController;
import Model.Roupas;
import Model.DAO.ClientesBD;
import Model.DAO.RoupasBD;

public class VendaView {

    public static Scanner teclado = new Scanner(System.in); // String
    public static Scanner teclado1 = new Scanner(System.in); // numero

    public static void efetuarVenda() {

        Vector<Roupas> carrinhoRoupas = new Vector<>(); // recebe roupas que o cliente compra

        Vector<Integer> quant = new Vector<>();// recebe a quantidade que o cliente comprou de cada peça

        System.out.println("É cliente Cadastrado?\n1-SIM\n2-NAO");
        String opcao = teclado.nextLine();

        if (opcao.equals("1") == true) {

            System.out.println("Informe o nome:");
            String nome = teclado.nextLine();

            for (int i = 0; i < ClientesBD.recupeClientes().size(); i++) { // percorre o bd cliente

                if (nome.equals(ClientesBD.recupeClientes().get(i).getNome()) != true) { // verificar se esta no bd,
                                                                                         // caso nao encontrar é
                                                                                         // invalido

                    System.out.println("Cliente nao cadastrado");
                    opcao = "2";

                }

            }

        }

        if (RoupasBD.recuperarRoupas().isEmpty() == true) { // verificando se o BDroupas estar vazio

            System.out.println("Cadastre as roupas antes de finalizar venda:");

            RoupasView.cadastroRoupa(); // chamando o metodo

        } else {

            System.out.println("Listando Roupas do estoque!\n"); ////
            System.out.println("ID | MARCA | NOME | TAM | PREÇO ");///

            for (int i = 0; i < RoupasBD.recuperarRoupas().size(); i++) { // percorrer o vetor que é meu banco
                                                                          // size() = pegar o tamanho do vetor

                System.out.println(i + " | " + RoupasBD.recuperarRoupas().get(i).getMarca() + " | "
                        + RoupasBD.recuperarRoupas().get(i).getNome() + " | "
                        + RoupasBD.recuperarRoupas().get(i).getTamanho() + " | "
                        + RoupasBD.recuperarRoupas().get(i).getPreco());
                // mostrando os valores que estao no meu BD, passando por todos os indices (for)

            }

            System.out.println("Informe a Data da Venda:");
            String data = teclado.nextLine();

            while (true) {

                System.out.println("Informe o ID da peça:\n Obs: Valor negativo para finalizar");
                int id = teclado1.nextInt(); // o id corresponde ao indice que esta a roupa no vetor do meu banco

                if (id < 0) { // condiçao para parar de add roupas no carrinho

                    break;
                }

                System.out.println("Informe a quantidade:");

                int quantPecas = teclado1.nextInt();

                carrinhoRoupas.add(RoupasBD.recuperarRoupas().get(id)); // add no carrinho a roupa que esta no bd no
                                                                        // indice que o usuario passou

                quant.add(quantPecas); // adicionando a quantiade de roupas que corresponde que esta no carrinho
                                       // naquele indice (ID)
            }
            VendaController.emitirBoleto(carrinhoRoupas, quant, data, opcao); // chama metodo para emitir o boleto
                                                                              // passando como parametro
        }

    }

}
