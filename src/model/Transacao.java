// interface para receitas e despesas
package src.model;

interface Transacao{
    double getValor();
    String getDescricao();
    String getData();
    String getCategoria();
}