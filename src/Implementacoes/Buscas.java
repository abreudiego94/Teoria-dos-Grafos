/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementacoes;

import Modelos.Aresta;
import Modelos.Grafo;
import Modelos.Vertice;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author a1380303
 */
public class Buscas {
    
    public void buscaEmProfundidade(Grafo g,Vertice Inicial){
        
    }
    public void buscaEmLargura(Grafo g){
        
       for (Map.Entry<Vertice, ArrayList<Aresta>> entry : g.getGrafo().entrySet()) {
           
           entry.getKey().setCor("CINZA");  
           
           for (int i = 0 ; i  < entry.getValue().size() ; i++){  
               Map.Entry<Vertice,ArrayList<Aresta>> e  = g.getVerticeDoGrafo(entry.getValue().get(i).getVerticeAdjacente());
                e.getKey().setCor("CINZA");  
               
           }
             entry.getKey().setCor("PRETA");
           
         
      }
        
    }
}
