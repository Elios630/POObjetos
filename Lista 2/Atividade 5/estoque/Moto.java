package estoque;

public class Moto extends Veiculo{

    private int potencia;


    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Moto(String marca, String modelo, Integer anoDeFab, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFab = anoDeFab;
        this.potencia = potencia;
    }
    
    @Override
    public String toString() {
        return "{" +
            " Marca='" + getMarca() + "'" +
            ", Modelo='" + getModelo() + "'" +
            ", Ano de fab='" + getAnoDeFab() + "'" +
            ", Potencia='" + getPotencia() + "'" +
            ", aceleração='" + acelerar(10) + "'" +
            ", Freio='" + frear(15) + "'" +
            "}";
    }


}
