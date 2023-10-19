package one.digitalinnovation.gof.strategy;

import one.digitalinnovation.gof.strategy.estadosinimigo.Estado;

public class Inimigo {
    private Estado estado;



    public void setEstado(Estado estado){
        this.estado = estado;
    }
    public void agir(String alvo){
        estado.agir(alvo);
    }
}
