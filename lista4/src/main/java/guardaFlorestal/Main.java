package guardaFlorestal;

import java.util.Scanner;

import guardaFlorestal.dao.AroeiraDAO;
import guardaFlorestal.dao.BambuDAO;
import guardaFlorestal.dao.JatobáDAO;
import guardaFlorestal.dao.JuazeiroDAO;
import guardaFlorestal.model.Aroeira;
import guardaFlorestal.model.Bambu;
import guardaFlorestal.model.Jatobá;
import guardaFlorestal.model.Juazeiro;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        
        AroeiraDAO aroeiraDAO = new AroeiraDAO();
        BambuDAO bambuDAO = new BambuDAO();
        JatobáDAO jatobáDAO = new JatobáDAO();
        JuazeiroDAO juazeiroDAO = new JuazeiroDAO();
        int escolha, escolhaPrinc;

        do {
            System.out.println("==== Menu Principal ====");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Atualizar");
            System.out.println("4. Excluir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            escolhaPrinc = scanner.nextInt();

            switch (escolhaPrinc) {
                case 1:
                    do {
                        System.out.println("==== Cadastrar ====");
                        System.out.println("1. Cadastrar Aroeira");
                        System.out.println("2. Cadastrar Bambu");
                        System.out.println("3. Cadastrar Jatobá");
                        System.out.println("4. Cadastrar Juazeiro");
                        System.out.println("5. Sair");
                        System.out.print("Escolha uma opção: ");

                        escolha = scanner.nextInt();

                        switch (escolha) {
                            case 1:
                                cadastrarAroeira();
                                break;
                            case 2:
                                cadastrarBambu();
                                break;
                            case 3:
                                cadastrarJatobá();
                                break;
                            case 4:
                                cadastrarJuazeiro();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }

                    } while (escolha != 5);

                    break;
                case 2:
                    do {
                        System.out.println("==== Consultar ====");
                        System.out.println("1. Consultar Aroeira");
                        System.out.println("2. Consultar Bambu");
                        System.out.println("3. Consultar Jatobá");
                        System.out.println("4. Consultar Juazeiro");
                        System.out.println("5. Sair");
                        System.out.print("Escolha uma opção: ");

                        escolha = scanner.nextInt();

                        switch (escolha) {
                            case 1:
                                aroeiraDAO.ConsultarAroeira();
                                break;
                            case 2:
                                bambuDAO.ConsultarBambu();
                                break;
                            case 3:
                                jatobáDAO.ConsultarJatobá();
                                break;
                            case 4:
                                juazeiroDAO.ConsultarJuazeiro();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }

                    } while (escolha != 5);
                    break;
                case 3:
                    do {
                        System.out.println("==== Atualizar ====");
                        System.out.println("1. Atualizar Aroeira");
                        System.out.println("2. Atualizar Bambu");
                        System.out.println("3. Atualizar Jatobá");
                        System.out.println("4. Atualizar Juazeiro");
                        System.out.println("5. Sair");
                        System.out.print("Escolha uma opção: ");

                        escolha = scanner.nextInt();

                        switch (escolha) {
                            case 1:
                                atualizarAroeira();
                                break;
                            case 2:
                                atualizarBambu();
                                break;
                            case 3:
                                atualizarJatobá();
                                break;
                            case 4:
                                atualizarJuazeiro();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }

                    } while (escolha != 5);
                    break;
                case 4:
                    do {
                        System.out.println("==== Excluir ====");
                        System.out.println("1. Excluir Aroeira");
                        System.out.println("2. Excluir Bambu");
                        System.out.println("3. Excluir Jatobá");
                        System.out.println("4. Excluir Juazeiro");
                        System.out.println("5. Sair");
                        System.out.print("Escolha uma opção: ");

                        escolha = scanner.nextInt();

                        switch (escolha) {
                            case 1:
                                excluirAroeira();
                                break;
                            case 2:
                                excluirBambu();
                                break;
                            case 3:
                                excluirJatobá();
                                break;
                            case 4:
                                excluirJuazeiro();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }

                    } while (escolha != 5);
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolhaPrinc != 5);
        aroeiraDAO.close();
        bambuDAO.close();
        jatobáDAO.close();
        juazeiroDAO.close();

    }

                

    private static void cadastrarAroeira() {
        AroeiraDAO aroeiraDAO = new AroeiraDAO();

        System.out.println("==== Cadastrar Aroeira ====");
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();
        System.out.print("Digite a profundidade: ");
        int profundidade = scanner.nextInt();
        System.out.print("Digite a espessura: ");
        double espessura = scanner.nextDouble();
        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();
        System.out.print("Digite a família: ");
        String família = scanner.next();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o remédio: ");
        String remédio = scanner.next();

        Aroeira aroeira = new Aroeira(altura, profundidade, espessura, largura, família, quantidade, remédio);
        aroeiraDAO.salvarAroeira(aroeira);

        System.out.println("Cadastro realizado com sucesso!");
    }
                
    
                

    private static void cadastrarBambu() {
        BambuDAO bambuDAO = new BambuDAO();

        System.out.println("==== Cadastrar Bambu ====");
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();
        System.out.print("Digite a profundidade: ");
        int profundidade = scanner.nextInt();
        System.out.print("Digite a espessura: ");
        double espessura = scanner.nextDouble();
        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();
        System.out.print("Digite a família: ");
        String família = scanner.next();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o gênero: ");
        String gênero = scanner.next();

        Bambu bambu = new Bambu(altura, profundidade, espessura, largura, família, quantidade, gênero);
        bambuDAO.salvarBambu(bambu);

        System.out.println("Cadastro realizado com sucesso!");
    }
                
    


    private static void cadastrarJatobá() {
        JatobáDAO jatobáDAO = new JatobáDAO();

        System.out.println("==== Cadastrar Jatobá ====");
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();
        System.out.print("Digite a profundidade: ");
        int profundidade = scanner.nextInt();
        System.out.print("Digite a espessura: ");
        double espessura = scanner.nextDouble();
        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();
        System.out.print("Digite a família: ");
        String família = scanner.next();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o remédio: ");
        String remédio = scanner.next();


        Jatobá jatobá = new Jatobá(altura, profundidade, espessura, largura, família, quantidade, remédio);
        jatobáDAO.salvarJatobá(jatobá);

        System.out.println("Cadastro realizado com sucesso!");
    }

                
    private static void cadastrarJuazeiro() {
        JuazeiroDAO juazeiroDAO = new JuazeiroDAO();

        System.out.println("==== Cadastrar Juazeiro ====");
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();
        System.out.print("Digite a profundidade: ");
        int profundidade = scanner.nextInt();
        System.out.print("Digite a espessura: ");
        double espessura = scanner.nextDouble();
        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();
        System.out.print("Digite a família: ");
        String família = scanner.next();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o nDeEspinhos: ");
        int nDeEspinhos = scanner.nextInt();

        Juazeiro juazeiro = new Juazeiro(altura, profundidade, espessura, largura, família, quantidade, nDeEspinhos);
        juazeiroDAO.salvarJuazeiro(juazeiro);

        System.out.println("Cadastro realizado com sucesso!");
    }
    private static void atualizarAroeira() {
        System.out.println("==== Atualizar Aroeira ====");
        AroeiraDAO aroeiraDAO = new AroeiraDAO();
        aroeiraDAO.ConsultarAroeira();
        
        System.out.print("Digite o id da Aroeira: ");
        Long idEscolha = scanner.nextLong();

        Aroeira aroeiraEncontrada = aroeiraDAO.getAroeiraById(idEscolha);
        
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();
        aroeiraEncontrada.setAltura(altura);

        System.out.print("Digite a profundidade: ");
        int profundidade = scanner.nextInt();
        aroeiraEncontrada.setProfundidade(profundidade);

        System.out.print("Digite a espessura: ");
        double espessura = scanner.nextDouble();
        aroeiraEncontrada.setEspessura(espessura);

        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();
        aroeiraEncontrada.setLargura(largura);
        
        System.out.print("Digite a família: ");
        String família = scanner.next();
        aroeiraEncontrada.setFamília(família);

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        aroeiraEncontrada.setQuantidade(quantidade);

        System.out.print("Digite o remédio: ");
        String remédio = scanner.next();
        aroeiraEncontrada.setRemédio(remédio);

        aroeiraDAO.atualizarAroeira(aroeiraEncontrada);

        System.out.println("Atualização realizado com sucesso!");
    }


    private static void atualizarBambu() {
        System.out.println("==== Atualizar Bambu ====");
        BambuDAO bambuDAO = new BambuDAO();
        bambuDAO.ConsultarBambu();
        
        System.out.print("Digite o id do Bambu: ");
        Long idEscolha = scanner.nextLong();

        Bambu bambuEncontrada = bambuDAO.getBambuById(idEscolha);
        
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();
        bambuEncontrada.setAltura(altura);

        System.out.print("Digite a profundidade: ");
        int profundidade = scanner.nextInt();
        bambuEncontrada.setProfundidade(profundidade);

        System.out.print("Digite a espessura: ");
        double espessura = scanner.nextDouble();
        bambuEncontrada.setEspessura(espessura);

        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();
        bambuEncontrada.setLargura(largura);
        
        System.out.print("Digite a família: ");
        String família = scanner.next();
        bambuEncontrada.setFamília(família);

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        bambuEncontrada.setQuantidade(quantidade);

        System.out.print("Digite o gênero: ");
        String gênero = scanner.next();
        bambuEncontrada.setGênero(gênero);

        bambuDAO.atualizarBambu(bambuEncontrada);

        System.out.println("Atualização realizado com sucesso!");
    }
    private static void atualizarJatobá() {
        System.out.println("==== Atualizar Jatobá ====");
        JatobáDAO jatobáDAO = new JatobáDAO();
        jatobáDAO.ConsultarJatobá();
        
        System.out.print("Digite o id do Jatobá: ");
        Long idEscolha = scanner.nextLong();

        Jatobá jatobáEncontrada = jatobáDAO.getJatobáById(idEscolha);
        
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();
        jatobáEncontrada.setAltura(altura);

        System.out.print("Digite a profundidade: ");
        int profundidade = scanner.nextInt();
        jatobáEncontrada.setProfundidade(profundidade);

        System.out.print("Digite a espessura: ");
        double espessura = scanner.nextDouble();
        jatobáEncontrada.setEspessura(espessura);

        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();
        jatobáEncontrada.setLargura(largura);
        
        System.out.print("Digite a família: ");
        String família = scanner.next();
        jatobáEncontrada.setFamília(família);

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        jatobáEncontrada.setQuantidade(quantidade);

        System.out.print("Digite o remédio: ");
        String remédio = scanner.next();
        jatobáEncontrada.setRemédio(remédio);

        jatobáDAO.atualizarJatobá(jatobáEncontrada);

        System.out.println("Atualização realizado com sucesso!");
    }


    private static void atualizarJuazeiro() {
        System.out.println("==== Atualizar Juazeiro ====");
        JuazeiroDAO juazeiroDAO = new JuazeiroDAO();
        juazeiroDAO.ConsultarJuazeiro();
        
        System.out.print("Digite o id do Juazeiro: ");
        Long idEscolha = scanner.nextLong();

        Juazeiro juazeiroEncontrada = juazeiroDAO.getJuazeiroById(idEscolha);
        
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();
        juazeiroEncontrada.setAltura(altura);

        System.out.print("Digite a profundidade: ");
        int profundidade = scanner.nextInt();
        juazeiroEncontrada.setProfundidade(profundidade);

        System.out.print("Digite a espessura: ");
        double espessura = scanner.nextDouble();
        juazeiroEncontrada.setEspessura(espessura);

        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();
        juazeiroEncontrada.setLargura(largura);
        
        System.out.print("Digite a família: ");
        String família = scanner.next();
        juazeiroEncontrada.setFamília(família);

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        juazeiroEncontrada.setQuantidade(quantidade);

        System.out.print("Digite o nDeEspinhos: ");
        int nDeEspinhos = scanner.nextInt();
        juazeiroEncontrada.setnDeEspinhos(nDeEspinhos);

        juazeiroDAO.atualizarJuazeiro(juazeiroEncontrada);

        System.out.println("Atualização realizado com sucesso!");
    }
    private static void excluirAroeira() {
        System.out.println("==== Excluir Aroeira ====");
        AroeiraDAO aroeiraDAO = new AroeiraDAO();
        aroeiraDAO.ConsultarAroeira();
        
        System.out.print("Digite o id da Aroeira: ");
        Long idEscolha = scanner.nextLong();

        Aroeira aroeiraEncontrada = aroeiraDAO.getAroeiraById(idEscolha);
        
        aroeiraDAO.deletarAroeira(aroeiraEncontrada);

        System.out.println("Exclusão realizado com sucesso!");
    }


    private static void excluirBambu() {
        System.out.println("==== Excluir Bambu ====");
        BambuDAO bambuDAO = new BambuDAO();
        bambuDAO.ConsultarBambu();
        
        System.out.print("Digite o id da Bambu: ");
        Long idEscolha = scanner.nextLong();

        Bambu bambuEncontrada = bambuDAO.getBambuById(idEscolha);
        
        bambuDAO.deletarBambu(bambuEncontrada);

        System.out.println("Exclusão realizado com sucesso!");
    }
    private static void excluirJatobá() {
        System.out.println("==== Excluir Jatobá ====");
        JatobáDAO jatobáDAO = new JatobáDAO();
        jatobáDAO.ConsultarJatobá();
        
        System.out.print("Digite o id da Jatobá: ");
        Long idEscolha = scanner.nextLong();

        Jatobá jatobáEncontrada = jatobáDAO.getJatobáById(idEscolha);
        
        jatobáDAO.deletarJatobá(jatobáEncontrada);

        System.out.println("Exclusão realizado com sucesso!");
    }


    private static void excluirJuazeiro() {
        System.out.println("==== Excluir Juazeiro ====");
        JuazeiroDAO juazeiroDAO = new JuazeiroDAO();
        juazeiroDAO.ConsultarJuazeiro();
        
        System.out.print("Digite o id da Juazeiro: ");
        Long idEscolha = scanner.nextLong();

        Juazeiro juazeiroEncontrada = juazeiroDAO.getJuazeiroById(idEscolha);
        
        juazeiroDAO.deletarJuazeiro(juazeiroEncontrada);

        System.out.println("Exclusão realizado com sucesso!");
    }

}
