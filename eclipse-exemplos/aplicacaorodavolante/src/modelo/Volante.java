package modelo;

public class Volante {
    
    private Roda roda;
   
    public Volante(Roda roda){
        this.roda = roda;
    }
   
    public void mudarAlerta(){
        this.roda.mudarAlerta();
    }
    
    public void mudarOrientacao(Integer orientacao){
        this.roda.mudarOrientacao(orientacao);
    }
}