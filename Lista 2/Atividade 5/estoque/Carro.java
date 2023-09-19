package estoque;

public class Carro extends Veiculo{

    private int cavalos;


    public int getCavalos() {
        return this.cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public Carro(String marca, String modelo, Integer anoDeFab, int cavalos) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFab = anoDeFab;
        this.cavalos = cavalos;
    }

    @Override
    public String toString() {
        return "{" +
            " Marca='" + getMarca() + "'" +
            ", Modelo='" + getModelo() + "'" +
            ", Ano de fab='" + getAnoDeFab() + "'" +
            ", Cavalos='" + getCavalos() + "'" +
            ", aceleração='" + acelerar(15) + "'" +
            ", Freio='" + frear(20) + "'" +
            "}";
    }

}
