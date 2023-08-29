package estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    
    ArrayList<Objeto> objetos;

    Estoque(){
        this.objetos = new ArrayList<Objeto>();
    }

    public void adicionarObjeto(Objeto o){
        this.objetos.add(o);
    }
    
    public void removerObjetoPorId(int id){
        objetos.removeIf(objetos -> objetos.id == id);
    }

    public String listarObjetos(){
        String listaObjetos = "";

        for (Objeto o : this.objetos) {
            listaObjetos += o.imprimir() + "\n";
        }

        return listaObjetos;
    }

    public void atualizarObjetoPorId(int id){

        for (Objeto o : this.objetos) {
            if(o.id == id){
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome");
                String nome = sc.nextLine();
                System.out.println("Digite a quantidade");
                int quant = sc.nextInt();

                o.nome = nome;
                o.quant = quant;
            }
        }
    }

    

}
