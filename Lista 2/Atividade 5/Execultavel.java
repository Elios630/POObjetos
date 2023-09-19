import estoque.Bicicleta;
import estoque.Carro;
import estoque.Moto;
import estoque.Veiculo;

public class Execultavel {

    public static void main(String[] args) {

        Bicicleta bic = new Bicicleta("biquesX", "utra", 2001, 10);
        Carro car = new Carro("Fiat", "Picape", 2010, 40);
        Moto mot = new Moto("MotosY", "turbo", 2017, 100);
        
        imprimirVeiculo(bic);
        imprimirVeiculo(car);
        imprimirVeiculo(mot);
    }

    public static void imprimirVeiculo(Veiculo v) {
        System.out.println(v);
    }
    
}
