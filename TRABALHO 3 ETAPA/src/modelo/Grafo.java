package modelo;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private final List<Vertice> vertices;
    private boolean[][] matrizAdjacencia;
    private static final int CAPACIDADE_INICIAL = 10;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.matrizAdjacencia = new boolean[CAPACIDADE_INICIAL][CAPACIDADE_INICIAL];
    }

    public void adicionarVertice(String rotulo) {

        if (existeVertice(rotulo)) {
            throw new IllegalArgumentException(
                    "Já existe um vértice com o rótulo '" + rotulo + "'.");
        }

        Vertice novo = new Vertice(rotulo);

        vertices.add(novo);

        if (vertices.size() > matrizAdjacencia.length) {
            redimensionarMatriz();
        }
    }

    public boolean existeVertice(String rotulo) {
        return indiceDoVertice(rotulo) != -1;
    }

    private int indiceDoVertice(String rotulo) {

        for (int i = 0; i < vertices.size(); i++) {

            if (vertices.get(i).getRotulo().equalsIgnoreCase(rotulo)) {
                return i;
            }

        }

        return -1;
    }

    private void redimensionarMatriz(){
        int novaCapacidade = matrizAdjacencia.length * 2;
        boolean[][] novaMatriz = new boolean[novaCapacidade][novaCapacidade];


    }




}

