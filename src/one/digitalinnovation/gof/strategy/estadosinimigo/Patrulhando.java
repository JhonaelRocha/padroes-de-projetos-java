package one.digitalinnovation.gof.strategy.estadosinimigo;

public class Patrulhando implements Estado {

    @Override
    public void agir(String alvo) {
        System.out.println("Patrulhando.. Ignorando o " + alvo + ".");
    }
    
}
