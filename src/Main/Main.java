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
import static java.io.FileDescriptor.err;
import static java.lang.System.err;
import java.util.ArrayList;
import java.util.Map;
import static jdk.nashorn.internal.runtime.Context.err;
import static jdk.nashorn.internal.runtime.Context.err;

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
        
        Map.Entry<Vertice, ArrayList<Aresta>> entry =  b.buscaEmLargura(grafo,new Vertice(2));
       
       
   
       
        
    }
    
}
