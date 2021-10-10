package modelo;

import java.util.Observable;

public class Roda extends Observable{
    
    private boolean alerta;
    private Integer orientacao;
    
    public Roda(){
        this.orientacao = new Integer(50);
    }
    
    public boolean obterAlerta(){
        return alerta;
    }
    public void mudarAlerta(){
        if (alerta){
            this.alerta = false;
        }else{
            this.alerta = true;
        }
        setChanged();
        notifyObservers();
    }
    
    public Integer obterOrientacao(){
        return orientacao;
    }
    public void mudarOrientacao(Integer orientacao){
        this.orientacao = orientacao;
        setChanged();
        notifyObservers();
    }
}
