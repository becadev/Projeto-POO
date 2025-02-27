package GerenciadorFinanceiro;
import java.util.List;


public class Meta {
    protected String descricao;
    protected String dataInicio;
    protected String dataFinal;
    protected String situacao;
    protected double valor;
    Meta(String descricao, String dataInicio, String dataFinal, String situacao, double valor){
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.situacao = situacao;
        this.valor = valor;
    }
}