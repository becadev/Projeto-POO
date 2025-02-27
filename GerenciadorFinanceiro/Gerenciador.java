package GerenciadorFinanceiro;
import java.util.ArrayList;
import java.util.List;

public class Gerenciador{
    protected List<Categoria> todasCategorias = new ArrayList<>();
    protected List<Receita> todasReceitas = new ArrayList<>();
    protected List<Gasto> todosGastos = new ArrayList<>();
    protected List<Meta> todasMetas = new ArrayList<>();
    protected List<Meta> metasRealizadas = new ArrayList<>();
    private double saldo = 0.00;
    private double totalGasto = 0.00;
    private List<String> meses = ["janeiro", "fevereiro", "março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"];

    // Gasto(List<Categoria> categoria, double valor, String data){
    public void cadastrarGasto(String descricao, double valor, String mes ) {
        todosGastos.add(new Gasto(new Categoria(descricao),valor,mes));
        System.out.println("Gasto cadastrado com sucesso!");
    }
    // Receita(List<Categoria> categoria, double valor){
    public void cadastrarReceita(String descricao, double valor, String mes ) {
        todasReceitas.add(new Receita(new Categoria(descricao),valor,mes));
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
            if(gasto.categoria.descricao.equals(categoria.descricao)){
                total += gasto.valor;
            }
        }
        System.out.println("Total gassto da categoria" + categoria + ":R$ " + total);
    }
    public double somarGastosMes(String mes){
        double gastoMes = 0.00;
        for(Gasto gasto : todosGastos){
            if(gasto.data.equals(mes)){
                gastoMes += gasto.valor;
            }
        }
        return gastoMes;
    }
    public double somarReceitasMes(String mes){
        double receitaMes = 0.00;
        for(Receita receita: todasReceitas){
            if(receita.data.equals(mes)){
                receitaMes += receita.valor;
            }
        }
        return receitaMes;
    }
    public void saldoAtual(){
        somarGastos();
        somarReceitas();
        this.saldo -= totalGasto;
    }
    public void verificarMetas(){
        for(Meta meta : todasMetas){
            if(meta.situacao.equals("realizada")){
                metasRealizadas.add(meta);
            }
        }
    }
    public void visuGeralMes(String mes){
        System.out.println("\n------------------Relatorio " + mes +"------------------");
        System.out.println("Total de gastos: R$"+ somarGastosMes(mes));
        System.out.println("Total de entradas: R$"+ somarReceitasMes(mes));
        if (todasReceitas.size() != 0){
            System.out.println("Receitas: ");
            int i = 0;
            for(Receita receita : todasReceitas){
                if(receita.data.equals(mes)){
                    i++;
                    System.out.println("["+ i +"]"+ receita.categoria.descricao + "| valor: R$"+receita.valor);
                }
            }
        }
        verificarMetas();
        System.out.print("Metas realizadas: ");
        if(metasRealizadas.size()!= 0){
            int i = 0;
            for(Meta meta : metasRealizadas){
                i++;
                System.out.println("[" + i + "]" + meta.descricao);
            }
        }else{
            System.out.println("Nenhuma meta realizada");
        }
        System.out.println("Gastos por categoria: ");
        if(todosGastos.size()!= 0){
            int i = 0;
            for(Gasto gasto : todosGastos){
                i++;
                System.out.println("[" + i + "]" + gasto.categoria.descricao + " | Total gasto: R$"+ gasto.valor);
            }
        }else{
            System.out.println("Nenhum gasto cadastrado");
        }
    } // saldo, total de gastos, se alguma meta foi realizada
    public void listarMetas() {
        if(todasMetas.size() == 0){
            System.out.println("Nenhuma meta cadastrada");
            return;
        }
        for(Meta meta : todasMetas) {
            System.out.println("[" + meta +"]" + meta.descricao);
        }
    }
    public void atualizarMeta(String m, String mudarSituacao) {
        for (int i = 0; i < todasMetas.size(); i++) {
            if (todasMetas.get(i).descricao.equals(m)) {
                todasMetas.get(i).situacao = mudarSituacao;
    
                if (mudarSituacao.equals("realizada")) {
                    metasRealizadas.add(todasMetas.get(i));
                    todasMetas.remove(i); // deleta da lista de metas principais
                }
    
                System.out.println("Meta atualizada!");
                return;
            }
        }
        System.out.println("Meta não cadastrada");
    }
    // vai mostrar um relatorio de gasto de todos os meses cadastrados, receitas, metas e tals
    public void gerarRelatorio(){
        for(int i = 0; i < todosGastos.size() ; i++ ){
            System.out.println("+----------------------------------------+");
            System.out.println("|       Relatório de "+ meses[i] + "     |");
            System.out.println("+----------------------------------------+");
            for(int k = 0; k < )
        }
    }
}
