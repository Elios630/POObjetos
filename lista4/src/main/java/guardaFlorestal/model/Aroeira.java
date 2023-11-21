package guardaFlorestal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aroeira extends Arvore{


    private String remédio;

    

    public String getRemédio() {
        return remédio;
    }

    public void setRemédio(String remédio) {
        this.remédio = remédio;
    }


    public Aroeira() {
    }

    public Aroeira(int altura, int profundidade, double espessura, int largura, String família, int quantidade, String remédio) {
        this.altura = altura;
        this.profundidade = profundidade;
        this.espessura = espessura;
        this.largura = largura;
        this.família = família;
        this.quantidade = quantidade;
        this.remédio = remédio;
    }

    
    @Override
    public String toString() {
        return "Aroeira [altura=" + altura + "m, profundidade=" + profundidade + "m, espessura=" + espessura + "m, largura="
                + largura + "m, família=" + família + ", quantidade=" + quantidade + ", remédio=" + remédio + "]";
    }

    


    
}
