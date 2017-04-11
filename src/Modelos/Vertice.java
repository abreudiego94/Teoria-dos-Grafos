package Modelos;

import java.util.Date;


public  class Vertice {
     int id ;
     String cor;
     Date tempoDeDescoberta;
     Date tempoDeTermino;

    public Date getTempoDeDescoberta() {
        return tempoDeDescoberta;
    }

    public void setTempoDeDescoberta(Date tempoDeDescoberta) {
        this.tempoDeDescoberta = tempoDeDescoberta;
    }

    public Date getTempoDeTermino() {
        return tempoDeTermino;
    }

    public void setTempoDeTermino(Date tempoDeTermino) {
        this.tempoDeTermino = tempoDeTermino;
    }
     
    public Vertice(int id) {
        this.id = id;
        this.cor = "BRANCO";
   
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String Cor) {
        this.cor = Cor;
    }
        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
