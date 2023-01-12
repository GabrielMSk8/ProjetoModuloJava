package SrBatata;

public class Bebida extends Produto {
    private boolean alcoolica;

    public Bebida(String nome, double valor, int qtde, boolean alcoolica) {
    	super(nome, valor, qtde);
        this.alcoolica = alcoolica;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

}