package GerenciadorFinanceiro;
import java.util.List;

public class Gasto {
    protected Categoria categoria;
    protected double valor;
    protected String data;
    Gasto(Categoria categoria, double valor, String data){
        this.categoria = categoria;
        this.data = data;
        this.valor = valor;
    }
}