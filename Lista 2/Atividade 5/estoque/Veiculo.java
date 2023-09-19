package estoque;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected Integer anoDeFab;


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoDeFab() {
        return this.anoDeFab;
    }

    public void setAnoDeFab(Integer anoDeFab) {
        this.anoDeFab = anoDeFab;
    }

    public int acelerar(int km) {
        return km;
    }

    public int frear(int km) {
        return km;
    }
    
}
