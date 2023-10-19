package one.digitalinnovation.gof.strategy.estadosinimigo;

public class Perseguindo implements Estado{


    @Override
    public void agir(String alvo) {
        System.out.println("Perseguindo... Correndo em direção ao " + alvo + ".");
    }
    
}
