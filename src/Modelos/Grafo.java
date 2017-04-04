package Modelos;


import Modelos.Aresta;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1380303
 */
public  class Grafo {

  
    private  Map<Vertice,ArrayList<Aresta>> grafo =   new HashMap<>();

    
    public Map<Vertice, ArrayList<Aresta>> getGrafo() {
        return grafo;
    }

    
    
    public void setGrafo(Map<Vertice, ArrayList<Aresta>> grafo) {
        this.grafo = grafo;
    }
    
    public void inserirVertice(Vertice e ,ArrayList<Aresta> listaDeArestas){
       
        this.getGrafo().put(e, listaDeArestas);
    
    }
   
    public Map.Entry<Vertice,ArrayList<Aresta>> getVerticeDoGrafo(Vertice v){
      
  
       for (Map.Entry<Vertice, ArrayList<Aresta>> entry : this.getGrafo().entrySet()) {
           
           if(v.getId() == entry.getKey().getId())  {
               
               return entry;
           }  
           

      }
       return null;
   }
 
   public void inserirVerticeAdjacenteGrafo(Vertice v,Aresta a){
       Map.Entry <Vertice,ArrayList<Aresta>>  item  =   this.getVerticeDoGrafo(v);
       
       item.getValue().add(a);
       
   }
   
   public void iniciaGrafo(){
        Vertice a = new Vertice(1);
        Vertice b = new Vertice(2);
        Vertice c = new Vertice(3);
        Vertice d = new Vertice(4);
        Vertice e = new Vertice(6);
        
        this.inserirVertice(a,new ArrayList<>());
        this.inserirVertice(b,new ArrayList<>());
        this.inserirVertice(c,new ArrayList<>());
        this.inserirVertice(d,new ArrayList<>());
        this.inserirVertice(e,new ArrayList<>());
       
        this.inserirVerticeAdjacenteGrafo(a, new Aresta(b, 58));
        this.inserirVerticeAdjacenteGrafo(a, new Aresta(c, 8));
        this.inserirVerticeAdjacenteGrafo(a, new Aresta(d, 9));
        this.inserirVerticeAdjacenteGrafo(a, new Aresta(e, 7));
        
        
        this.inserirVerticeAdjacenteGrafo(b, new Aresta(a, 5));
        this.inserirVerticeAdjacenteGrafo(b, new Aresta(c, 80));
        this.inserirVerticeAdjacenteGrafo(b, new Aresta(d, 7));
        this.inserirVerticeAdjacenteGrafo(b, new Aresta(e, 45));
        
        
        this.inserirVerticeAdjacenteGrafo(c, new Aresta(a, 8));
        this.inserirVerticeAdjacenteGrafo(c, new Aresta(b, 86));
        this.inserirVerticeAdjacenteGrafo(c, new Aresta(d, 68));
        this.inserirVerticeAdjacenteGrafo(c, new Aresta(e, 98));
        
        this.inserirVerticeAdjacenteGrafo(d, new Aresta(a, 8));
        this.inserirVerticeAdjacenteGrafo(d, new Aresta(b, 86));
        this.inserirVerticeAdjacenteGrafo(d, new Aresta(c, 68));
        this.inserirVerticeAdjacenteGrafo(d, new Aresta(e, 98));
        
        this.inserirVerticeAdjacenteGrafo(e, new Aresta(a, 8));
        this.inserirVerticeAdjacenteGrafo(e, new Aresta(b, 86));
        this.inserirVerticeAdjacenteGrafo(e, new Aresta(c, 68));
        this.inserirVerticeAdjacenteGrafo(e, new Aresta(d, 98));
       
   }
   
}
