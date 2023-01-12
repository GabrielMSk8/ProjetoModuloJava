package SrBatata;

public class Produto {
	private String nome;
    private double valor;
    private int qtde;

    Produto(String nome, double valor, int qtde){
        this.nome = nome;
        this.valor = valor;
        this.qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

}
