package br.com.zup;

public class Pratos {

    String nome, ingredientes;
    double valor;

    public Pratos(String nome, String ingredientes, double valor) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "|  ----->  " + nome + "  R$ " + valor +
                "\n|  Ingredientes:" + ingredientes;
    }
}
