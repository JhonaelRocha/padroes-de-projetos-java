package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Pessoa;
import one.digitalinnovation.gof.singleton.Singleton;
import one.digitalinnovation.gof.strategy.Inimigo;
import one.digitalinnovation.gof.strategy.estadosinimigo.Atacando;
import one.digitalinnovation.gof.strategy.estadosinimigo.Estado;
import one.digitalinnovation.gof.strategy.estadosinimigo.Patrulhando;
import one.digitalinnovation.gof.strategy.estadosinimigo.Perseguindo;

public class Test {
    public static void main(String[] args) {
        
        //Teste de Singleton

        Singleton singleton = Singleton.getInstancia();
        System.out.println(singleton);
        singleton.setPreco(12.50f);
        singleton.setProduto("Feijão");

        System.out.println(singleton);
        singleton.getInstancia();
        System.out.println(singleton);

        //Teste de Strategy Inimigo

        Inimigo inimigo = new Inimigo();

        Estado patrulhando = new Patrulhando();
        Estado atacando = new Atacando();
        Estado perseguindo = new Perseguindo();

        inimigo.setEstado(perseguindo);
        inimigo.agir("Jogador 1");
        inimigo.agir("Jogador 2");

        inimigo.setEstado(atacando);
        inimigo.agir("Jogador 1");
        inimigo.agir("Jogador 2");

        inimigo.setEstado(patrulhando);
        inimigo.agir("Jogador 1");
        inimigo.agir("Jogador 2");

        //Teste de Facade

        Pessoa pessoa = new Pessoa();
        pessoa.pergarInformacoes("1234");
        pessoa.pergarInformacoes("4321");
    }
}
