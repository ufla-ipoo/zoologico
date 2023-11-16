import java.util.Scanner;

/**
 * Classe que trata a interface com o usu�rio (menu de op��es)
 * 
 * @author Julio C�sar Alves
 * @version 2023.11.16
 */
public class InterfaceUsuario {

    // Scanner para obter dados do usu�rio via terminal
    private Scanner entrada;

    /**
     * Construtor da classe
     */
    public InterfaceUsuario() {
        entrada = new Scanner(System.in);
    }

    /**
     * M�todo que trata o loop de exibi��o e tratamento do menu
     */
    public void executar() {
        int opcao;
        do {
            exibirMenu();
            
            System.out.println("\nDigite sua op��o: ");
            opcao = Integer.parseInt(entrada.nextLine());

            tratarMenu(opcao);

        } while (opcao != 5);

        // fecha o objeto Scanner para liberar os seus recursos
        entrada.close();
    }

    /**
     * M�todo que exibe as op��es de menu
     */
    public void exibirMenu() {
        System.out.println("1 - Cadastrar animal");
        System.out.println("2 - Descrever animal");
        System.out.println("3 - Listar animais");        
        System.out.println("4 - Listar animais completo");
        System.out.println("5 - Sair");
    }

    /**
     * M�todo que trata uma op��o de menu escolhida pelo usu�rio
     */
    private void tratarMenu(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarAnimal();
                break;
            case 2:
                descreverAnimal();
                break;
            case 3:
                listarAnimais();
                break;
            case 4:
                listarAnimaisCompleto();
                break;
            case 5:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Op��o inv�lida!");
                break;
        }

        // se o usu�rio n�o estiver saindo do programa, pede para 
        // ele digitar ENTER antes de exibir o menu novamente
        if (opcao != 5) {
            System.out.println("\nDigite ENTER para continuar!");
            entrada.nextLine();
        }
    }

    /**
     * M�todo auxiliar que obt�m uma String do usu�rio
     */
    private String pedirString(String instrucao) {
        System.out.print(instrucao + ": ");
        String informacao = entrada.nextLine();
        return informacao;
    }

    /**
     * Trata a op��o de menu: Cadastrar Animal
     */
    private void cadastrarAnimal() {
        // implemente seu c�digo aqui.
        String nome = pedirString("Digite o nome do animal");
    }

    /**
     * Trata a op��o de menu: Descrever Animal
     */
    private void descreverAnimal() {
        // implemente seu c�digo aqui.
    }

    /**
     * Trata a op��o de menu: Listar Animais
     */
    private void listarAnimais() {
        // implemente seu c�digo aqui.
    }

    /**
     * Trata a op��o de menu: Listar Animais
     */
    private void listarAnimaisCompleto() {
        // implemente seu c�digo aqui.
    }
}