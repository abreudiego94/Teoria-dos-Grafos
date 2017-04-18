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
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author a1380303
 */
public class Buscas {
    
    
    public Map.Entry<Vertice, ArrayList<Aresta>> buscaEmProfundidade(Grafo g,Vertice verticeBuscado){
        for(Map.Entry<Vertice, ArrayList<Aresta>> entrada : g.getGrafo().entrySet()){
            
            if("BRANCO".equals(entrada.getKey().getCor())){
                   return this.DFSVisit(g, entrada,verticeBuscado);
            }
        }      
      
       return null;
    }
    public Map.Entry<Vertice,ArrayList<Aresta>> DFSVisit(Grafo g ,Map.Entry<Vertice,ArrayList<Aresta>> e,Vertice verticeBuscado){
        e.getKey().setTempoDeDescoberta(new Date());
        e.getKey().setCor("CINZA");
        
        
        if(e.getKey().getId() == verticeBuscado.getId()){
            return e;
        }
        
        for (Aresta a : e.getValue()) {
            Map.Entry<Vertice,ArrayList<Aresta>> p  = g.getVerticeDoGrafo(a.getVerticeAdjacente());
            if("BRANCO".equals(p.getKey().getCor())){
                return this.DFSVisit(g,p,verticeBuscado);
            }
            
          
        };
        
        e.getKey().setCor("PRETO");
        e.getKey().setTempoDeTermino(new Date());
        
        return null;
          

    }
    
    public Map.Entry<Vertice, ArrayList<Aresta>> buscaEmLargura(Grafo g,Vertice v){
       
       for (Map.Entry<Vertice, ArrayList<Aresta>> entry : g.getGrafo().entrySet()) {
     
           if(this.comparaDoisVertices(entry.getKey(), v)){
               return entry;
           }
           
           entry.getKey().setCor("CINZA");  
           
           for (int i = 0 ; i  < entry.getValue().size() ; i++){  
               Map.Entry<Vertice,ArrayList<Aresta>> e  = g.getVerticeDoGrafo(entry.getValue().get(i).getVerticeAdjacente()); 
               e.getKey().setCor("CINZA");
                 if(this.comparaDoisVertices(entry.getKey(), v)){
                      return e;
                }
               
           }
             entry.getKey().setCor("PRETA");
  
      }
       return null;
        
    }
    public boolean comparaDoisVertices(Vertice a, Vertice b){
        return a.getId() == b.getId();
    }
}
