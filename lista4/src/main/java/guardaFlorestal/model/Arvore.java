package guardaFlorestal.model;

import javax.persistence.Entity;

@Entity
abstract  class Arvore {

    protected int altura;
    protected int profundidade;
    protected double espessura;
    protected int largura;
    protected String família;
    protected int quantidade;

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }
    public double getEspessura() {
        return espessura;
    }
    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }
    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    public String getFamília() {
        return família;
    }
    public void setFamília(String família) {
        this.família = família;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    

    
}
