package Model.DAO;

import java.util.Vector;

import Model.Roupas;

public class RoupasBD {

    public static Vector<Roupas> roupas; // Vetor que armazena roupas no banco

    public static void inicarBdRoupas() {

        roupas = new Vector<>();

    }

    public static void inserirRoupas(Vector<Roupas> estoqueRoupas) { // rec

        for (int i = 0; i < estoqueRoupas.size(); i++) { // percorrer o vetor do estoque roupas

            roupas.add(estoqueRoupas.get(i)); // adicionando o estoque roupas no vetor roupas
        }

    }

    public static Vector<Roupas> recuperarRoupas(){ //recuperar as informaçoes quando necessario

        return roupas; //retornando as informaçoes do banco 

    }
}
