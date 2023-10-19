package one.digitalinnovation.gof.strategy.estadosinimigo;

public class Atacando implements Estado{
    @Override
    public void agir(String alvo) {
        System.out.println("Atacando... Atacando o " + alvo + ".");
    }
    
}
