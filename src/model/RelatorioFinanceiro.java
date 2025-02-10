// interface para geração de relatórios/gráficos
package src.model;

interface RelatorioFinanceiro{
    double getSaldoInicial();
    double getSaldoAtual();
    double getEntradas();
    double getSaidas();
    String getCategorias();
    String getMetasAtingidas();
}