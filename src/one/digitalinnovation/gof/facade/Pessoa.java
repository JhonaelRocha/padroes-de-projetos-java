package one.digitalinnovation.gof.facade;

public class Pessoa {
    public void pergarInformacoes(String cpf){
        String nome = BancoDePessoas.getIntancia().pergarNome(cpf);
        String idade = BancoDePessoas.getIntancia().pegarIdade(cpf);
        String nomeMae = BancoDePessoas.getIntancia().pegarNomeMae(cpf);
        String nomePai = BancoDePessoas.getIntancia().pegarNomePai(cpf);

        System.out.println("Informações | Nome : " + nome + " | Idade : " + idade + " | Nome da Mãe : " + nomeMae + " | Nome do Pai : " + nomePai + ".");
    }
}
