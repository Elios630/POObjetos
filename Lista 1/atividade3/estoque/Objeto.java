package estoque;

public class Objeto {
    int id;
    String nome;
    int quant;

    Objeto (int id, String nome, int quant){
        this.id = id;
        this.nome = nome;
        this.quant = quant;
    }

    String imprimir(){
        String ret = "";
        ret = this.id + " - " + this.nome + " - " + this.quant;
        return ret;
    }

}
