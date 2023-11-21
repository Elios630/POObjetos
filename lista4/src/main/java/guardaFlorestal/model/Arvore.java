package guardaFlorestal.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Arvore implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public int altura;
    public int profundidade;
    public double espessura;
    public int largura;
    public String família;
    public int quantidade;


    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }


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
