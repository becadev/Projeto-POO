package GerenciadorFinanceiro;
import java.util.ArrayList;
import java.util.List;

public class Gerenciador{
    protected List<Categoria> todasCategorias = new ArrayList<>();
    protected List<Receita> todasReceitas = new ArrayList<>();
    protected List<Gasto> todosGastos = new ArrayList<>();
    protected List<Meta> todasMetas = new ArrayList<>();
    private double saldo = 0.00;
    private double totalGasto = 0.00;

    // Gasto(List<Categoria> categoria, double valor, String data){
    public void cadastrarGasto(String descricao, double valor, String data ) {
        todosGastos.add(new Gasto(new Categoria(descricao),valor,data));
        System.out.println("Gasto cadastrado com sucesso!");
    }
    // Receita(List<Categoria> categoria, double valor){
    public void cadastrarReceita(String descricao, double valor, String data ) {
        todasReceitas.add(new Receita(new Categoria(descricao),valor,data));
        System.out.println("Receita cadastrada com sucesso!");
    }
    public void cadastrarMeta(String descricao, String dataInicio, String dataFinal, String situacao, double valor ) {
        todasMetas.add(new Meta(descricao, dataInicio, dataFinal, situacao, valor));
        System.out.println("Meta cadastrada com sucesso!");
    }
    public void somarGastos(){
        for(Gasto gasto : todosGastos){
            this.totalGasto+= gasto.valor;
        }
    }
    public void somarReceitas(){
        for(Receita receita : todasReceitas){
            this.saldo += receita.valor;
        }
    }
    public void somarGastoPorCategoria(Categoria categoria){
        double total = 0.00;
        for(Gasto gasto : todosGastos){
            if(gasto.categoria.nome.equals(categoria.nome)){
                total += gasto.valor;
            }
        }
        System.out.println("Total gassto com a categoria" + categoria + "R$" + total);
    }
    public void saldoAtual(){
        somarGastos();
        somasReceitas();
        this.saldo -= totalGasto;
    }
    
}