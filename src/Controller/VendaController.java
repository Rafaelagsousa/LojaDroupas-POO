package Controller;

import java.util.Vector;

import Model.Roupas;

public class VendaController {

    public static void emitirBoleto(Vector<Roupas> carrinho, Vector<Integer> quantidades, String data, String opcao) { // recebe
                                                                                                                       // parametros/informações

        if (opcao.equals("1") == true) {

            double valorTotal = 0;

            System.out.println("\nGerando emissão do Boleto...\n");
            System.out.println("Data da venda " + data + "\n");

            for (int i = 0; i < carrinho.size(); i++) {// passando pelo vetor do tipo roupas carrinho para pegar o
                                                       // tamanho do vetor

                valorTotal = valorTotal + (carrinho.get(i).getPreco() * quantidades.get(i));

            }
            valorTotal = valorTotal - (valorTotal * 0.05);

            System.out.println("O valor total é:R$ " + valorTotal  + " com 5% de desconto");

        } else {

            double valorTotal = 0;

            System.out.println("\nGerando emissão do Boleto...\n");
            System.out.println("Data da venda " + data + "\n");

            for (int i = 0; i < carrinho.size(); i++) {// passando pelo vetor do tipo roupas carrinho para pegar o
                                                       // tamanho do vetor

                valorTotal = valorTotal + (carrinho.get(i).getPreco() * quantidades.get(i));

            }
            System.out.println("O valor total é:R$ " + valorTotal);

        }

    }

}
