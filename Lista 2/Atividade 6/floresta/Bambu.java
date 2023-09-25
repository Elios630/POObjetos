package floresta;

public class Bambu extends Arvore{

    private String gênero;

    public String getGênero() {
        return gênero;
    }

    public void setGênero(String gênero) {
        this.gênero = gênero;
    }

    public Bambu(int altura, int profundidade, double espessura, int largura, String família, int quantidade, String gênero) {
        this.altura = altura;
        this.profundidade = profundidade;
        this.espessura = espessura;
        this.largura = largura;
        this.família = família;
        this.quantidade = quantidade;
        this.gênero = gênero;
    }

    
    @Override
    public String toString() {
        return "Bambu [altura=" + altura + "m, profundidade=" + profundidade + "m, espessura=" + espessura + "m, largura="
                + largura + "m, família=" + família + ", quantidade=" + quantidade + ", gênero=" + gênero + "]";
    }

    
    
}
