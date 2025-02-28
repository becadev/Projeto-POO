package com.meuprojeto;
import java.util.List;
import java.util.ArrayList;

public class DadosMes {
    private List<Receita> receitas;
    private List<Gasto> gastos;
    private List<Meta> metas;

    public DadosMes(List<Receita> receitas, List<Gasto> gastos, List<Meta> metas) {
        this.receitas = receitas;
        this.gastos = gastos;
        this.metas = metas;
    }

    public List<Receita> getReceitas() { return receitas; }
    public List<Gasto> getGastos() { return gastos; }
    public List<Meta> getMetas() { return metas; }
}