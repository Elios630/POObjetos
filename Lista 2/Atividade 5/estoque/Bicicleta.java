package estoque;

public class Bicicleta extends Veiculo{

    private int peso;


    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Bicicleta(String marca, String modelo, Integer anoDeFab, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFab = anoDeFab;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{" +
            " Marca='" + getMarca() + "'" +
            ", Modelo='" + getModelo() + "'" +
            ", Ano de fab='" + getAnoDeFab() + "'" +
            ", peso='" + getPeso() + "'" +
            ", aceleração='" + acelerar(5) + "'" +
            ", Freio='" + frear(10) + "'" +
            "}";
    }

    
    

}
