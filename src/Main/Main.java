/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Implementacoes.Buscas;
import Modelos.Aresta;
import Modelos.Grafo;
import Modelos.Vertice;
import java.util.ArrayList;
import java.util.Map;


/**
 * 
 * @author a1380303
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Grafo grafo = new Grafo();
        grafo.iniciaGrafo();
        
        Buscas b = new Buscas();
        Map.Entry<Vertice,ArrayList<Aresta>> e = b.buscaEmProfundidade(grafo,new Vertice(1));
            
    }
    
}
