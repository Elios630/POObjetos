package controle;
import floresta.*;

public class ControleCentral {

    public static void main(String[] args) {
        
        Aroeira aro = new Aroeira(10, 10, 1, 15, "Anacardiaceae", 11, "DST");
        Bambu bam = new Bambu(50, 25, 0.5, 2, "Poaceae", 50, "Dendrocalamus");
        Jatobá jat = new Jatobá(40, 80, 1.5, 20, "Fabaceae", 20, "captopril" );
        Juazeiro jua = new Juazeiro(30, 40, 1.3, 10, "Rhamnaceae", 17, 2);
        
        imprimirArvore(aro);
        imprimirArvore(bam);
        imprimirArvore(jat);
        imprimirArvore(jua);
    }

    public static void imprimirArvore(Arvore a) {
        System.out.println(a);
    }
    
}
