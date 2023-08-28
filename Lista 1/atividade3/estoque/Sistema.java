package estoque;

import java.util.Scanner;

public class Sistema {
    
    

    public static void main(String[] args) {
        int opcao = 0;
        Estoque estoque = new Estoque();

        Scanner scanner = new Scanner(System.in);
        while (opcao != 5) {
            System.out.println("1 - Adicionar objeto");
            System.out.println("2 - Remover objeto");
            System.out.println("3 - Listar objeto");
            System.out.println("4 - Atualizar objeto");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();
            executarOpcao(opcao, scanner, estoque);
        }
        scanner.close();
        System.out.println("Sistema fechado.");
    }

    public static void executarOpcao(int op, Scanner sc, Estoque estoque){
        int idBusca;
        switch (op) {
            case 1:
                System.out.println("Adicionando objeto");
                System.out.println("Digite o ID");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome");
                String nome = sc.nextLine();
                System.out.println("Digite a quantidade");
                int quant = sc.nextInt();
                Objeto o = new Objeto(id, nome, quant);
                estoque.adicionarObjeto(o);
                break;
            case 2:
                System.out.println("Remover objeto");
                System.out.println("Remover objeto por ID:");
                idBusca = sc.nextInt();
                estoque.removerObjetoPorId(idBusca);
                break;
            case 3:
                System.out.println("Listando objeto");
                System.out.println(estoque.listarObjetos());
                break;
            case 4:
                System.out.println("Atualizar objeto");
                System.out.println("Atualizar objeto por ID:");
                idBusca = sc.nextInt();
                estoque.atualizarObjetoPorId(idBusca);
                break;
        }

    }

}
