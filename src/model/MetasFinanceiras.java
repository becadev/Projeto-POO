package src.model;

public class MetasFinanceiras{
    protected List listaMetas;
    MetasFinanceiras(){
        List listaMetas = new List();
    }
    public String addMetas(Meta metas){
        this.listaMetas.add(metas);
    }
}