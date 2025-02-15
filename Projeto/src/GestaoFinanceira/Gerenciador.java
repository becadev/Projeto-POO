package GestaoFinanceira;
import java.util.List;
// Cadastrar novos gastos/receitas.
//Calcular totais de gastos/receitas.
//Verificar e controlar metas financeiras.
//Organizar dados financeiros por categorias.
public class Gerenciador {
	protected List<Categoria> allGastos;
	protected double totalGastos;
	//private int action;
	
	public void cadastrarGasto(Categoria categoria, double valor, String descricao) {
		
	}
	
	public void cadastrarReceita(Receitas receita) {
		
	}
	
	public double somarGastosPorCategoria(String categoria) {
		return allGastos.stream()
				.filter (e -> e.nome().equals(categoria))
				.mapToDouble(e -> e.gasto().valor())
				.sum();
	}
	public double somarAllgastos() {
		return allGastos.stream()
				.mapToDouble(e -> e.gasto().valor())
				.sum();
	}
}
