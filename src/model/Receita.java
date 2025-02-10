package src.model;

public class Receita implements Transacao{
    protected double valor;
    protected String descricao;
    protected String categoria;
    protected String data;

    Receita(double valor, String descricao, String categoria, String data){
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
    }
    @Override
    public double getValor(){
        return this.valor;
    }
    @Override
    public String getDescricao(){
        return this.descricao;
    }
    @Override
    public String getData(){
        return this.data;
    }
    @Override
    public String getCategoria(){
        return this.categoria;
    }
}