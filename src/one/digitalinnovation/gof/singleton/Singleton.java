package one.digitalinnovation.gof.singleton;

public class Singleton {
    private String produto;
    private float preco;
    
    private static Singleton instancia = new Singleton();
    private Singleton(){
        super();
    }
    public static Singleton getInstancia(){
        return instancia;
    }

    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public static void setInstancia(Singleton instancia) {
        Singleton.instancia = instancia;
    }
    @Override
    public String toString() {
        return "Singleton [produto=" + produto + ", preco=" + preco + "]";
    }
    
    
}
