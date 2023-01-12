package SrBatata;

public class Batata extends Produto {
    private String tamanho;

    public Batata(String nome, double valor, int qtde, String tamanho) {
        super(nome, valor, qtde);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}