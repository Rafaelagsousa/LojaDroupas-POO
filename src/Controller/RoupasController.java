package Controller;

import java.util.Scanner;

public class RoupasController {

    public static Scanner teclado = new Scanner(System.in);

    public static String validaTamanho(String tamanho) {

        while (true) {

            if (tamanho.equals("P") != true && tamanho.equals("M") != true && tamanho.equals("G") != true
                    && tamanho.equals("GG") != true) {

                System.out.println("Tamanho invalido, Informe novamente:");

                tamanho = teclado.nextLine().toUpperCase(); // Nao importa se digitar de outra forma

            } else {

                break;
            }

        }

        return tamanho;
    }

    public static String validarMarca(String marca) {

        while (true) {

            if (marca.equals("NIKE") != true && marca.equals("PUMA") != true && marca.equals("ADIDAS") != true && marca.equals("FIM") != true) {

                System.out.println("Marca não encontrada, Informe novamente:");

                marca = teclado.nextLine().toUpperCase();
            } else {

                break;

            }

        }

        return marca;
    }

}
