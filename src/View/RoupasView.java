package View;

import java.util.Scanner;
import java.util.Vector;

import Controller.RoupasController;
import Model.Roupas;
import Model.DAO.RoupasBD;

public class RoupasView {

    public static Scanner teclado = new Scanner(System.in); // String
    public static Scanner teclado1 = new Scanner(System.in); // numero

    public static void cadastroRoupa() {

        Vector<Roupas> estoqueRoupas = new Vector<>(); // recebe objeto roupas

        while (true) {     //laço

            System.out.println("\nInforme fim para parar!!");

            System.out.println("\nEscolha uma Marca: ADIDAS, NIKE ou PUMA");

            String marca = teclado.nextLine().toUpperCase(); // Leitura e condição para validar 
            marca = RoupasController.validarMarca(marca); 

            if (marca.equals("FIM")) {

                break;
            }

            System.out.println("Informe o nome"); // camisa, short, blusas ...
            String nome = teclado.nextLine();

            System.out.println("escolha um tamanho");
            System.out.println("P, M, G ou GG");
            String tamanho = teclado.nextLine().toUpperCase();
            tamanho = RoupasController.validaTamanho(tamanho);

            System.out.println("Informe o preco");
            double preco = teclado1.nextDouble();

            Roupas novaRoupa = new Roupas(marca, nome, tamanho, preco); // Cria um objeto do tipo roupa passadas pelo usuario

            estoqueRoupas.add(novaRoupa); //armazenando no vetor um objeto do tipo roupa 

        }

        RoupasBD.inserirRoupas(estoqueRoupas); // passando o vetor roupas para o metodo inserir roupas

        Menu.iniciarSecao();
    }

}
