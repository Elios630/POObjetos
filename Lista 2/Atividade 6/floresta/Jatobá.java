package floresta;

public class Jatobá extends Arvore{
    

    private String remédio;

    public String getRemédio() {
        return remédio;
    }

    public void setRemédio(String remédio) {
        this.remédio = remédio;
    } 

    public Jatobá(int altura, int profundidade, double espessura, int largura, String família, int quantidade, String remédio) {
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
        return "Jatobá [altura=" + altura + "m, profundidade=" + profundidade + "m, espessura=" + espessura + "m, largura="
                + largura + "m, família=" + família + ", quantidade=" + quantidade + ", remédio=" + remédio + "]";
    }

    


}
