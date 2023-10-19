package one.digitalinnovation.gof.facade;


public class BancoDePessoas {
    private static BancoDePessoas instancia = new BancoDePessoas();

    private BancoDePessoas(){
        super();
    }

    public static BancoDePessoas getIntancia(){
        return instancia;
    }

    public String pergarNome(String cpf){
        String nome = "";
        if(cpf == "1234"){
            nome = "Pedro";
        }else if(cpf == "4321"){
            nome = "Carlos";
        }
        return nome;
    }
    public String pegarIdade(String cpf){
        String idade = "0";
        if(cpf == "1234"){
            idade = "23";
        }else if(cpf == "4321"){
            idade = "18";
        }
        return idade;
    }
    public String pegarNomeMae(String cpf){
        String nomeMae = "";
        if(cpf == "1234"){
            nomeMae = "Maria";
        }else if(cpf == "4321"){
            nomeMae = "Denise";
        }
        return nomeMae;
    }
    public String pegarNomePai(String cpf){
        String nomePai = "";
        if(cpf == "1234"){
            nomePai = "João";
        }else if(cpf == "4321"){
            nomePai = "José";
        }
        return nomePai;
    }
}
