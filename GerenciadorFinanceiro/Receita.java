package GerenciadorFinanceiro;
import java.util.List;
// Class de estrutura para array com todas as entradas de valores

public class Receita {
    protected Categoria categoria;
    protected double valor;
    protected String data;
    Receita(Categoria descricao, double valor, String data){
        this.categoria = descricao;
        this.data = data;
        this.valor = valor;
    }
}