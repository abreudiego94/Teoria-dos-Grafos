package Modelos;


public  class Vertice {
     int id ;
     String cor;
     
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
