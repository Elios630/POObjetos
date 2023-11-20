package guardaFlorestal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Juazeiro extends Arvore{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int nDeEspinhos;

    public int getnDeEspinhos() {
        return nDeEspinhos;
    }

    public void setnDeEspinhos(int nDeEspinhos) {
        this.nDeEspinhos = nDeEspinhos;
    }

    public Juazeiro(int altura, int profundidade, double espessura, int largura, String família, int quantidade, int nDeEspinhos) {
        this.altura = altura;
        this.profundidade = profundidade;
        this.espessura = espessura;
        this.largura = largura;
        this.família = família;
        this.quantidade = quantidade;
        this.nDeEspinhos = nDeEspinhos;
    }

    @Override
    public String toString() {
        return "Juazeiro [altura=" + altura + "m, profundidade=" + profundidade + "m, espessura=" + espessura + "m, largura="
                + largura + "m, família=" + família + ", quantidade=" + quantidade + ", numero de espinhos=" + nDeEspinhos + " por ramo]";
    }

    public Long getId() {
        return id;
    }

}
