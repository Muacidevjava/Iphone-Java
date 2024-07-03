import java.util.Scanner;
import musica.IPhoneReprodutorMusical;
import telefone.IPhoneTelefone;
import web.IPhoneNavegadorWeb;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IPhoneReprodutorMusical reprodutorMusical = new IPhoneReprodutorMusical();
        IPhoneTelefone telefone = new IPhoneTelefone();
        IPhoneNavegadorWeb navegadorWeb = new IPhoneNavegadorWeb();

        while (true) {
            System.out.println("\nEscolha uma funcionalidade para testar:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (escolha) {
                case 1:
                    testarReprodutorMusical(reprodutorMusical, scanner);
                    break;
                case 2:
                    testarTelefone(telefone, scanner);
                    break;
                case 3:
                    testarNavegadorWeb(navegadorWeb, scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }
    }

    public static void testarReprodutorMusical(IPhoneReprodutorMusical reprodutor, Scanner scanner) {
        System.out.println("Testando Reprodutor Musical:");
        reprodutor.tocar();
        pausarParaProximaAcao(scanner);
        reprodutor.pausar();
        pausarParaProximaAcao(scanner);
        reprodutor.parar();
        pausarParaProximaAcao(scanner);
        reprodutor.proximaFaixa();
        pausarParaProximaAcao(scanner);
        reprodutor.faixaAnterior();
        pausarParaProximaAcao(scanner);
    }

    public static void testarTelefone(IPhoneTelefone telefone, Scanner scanner) {
        System.out.println("Testando Aparelho Telefônico:");
        System.out.print("Digite o número para fazer uma chamada: ");
        String numero = scanner.nextLine();
        telefone.fazerChamada(numero);
        pausarParaProximaAcao(scanner);
        telefone.atenderChamada();
        pausarParaProximaAcao(scanner);
        telefone.encerrarChamada();
        pausarParaProximaAcao(scanner);
        telefone.rejeitarChamada();
        pausarParaProximaAcao(scanner);
    }

    public static void testarNavegadorWeb(IPhoneNavegadorWeb navegador, Scanner scanner) {
        System.out.println("Testando Navegador na Internet:");
        System.out.print("Digite a URL para abrir: ");
        String url = scanner.nextLine();
        navegador.abrirPagina(url);
        pausarParaProximaAcao(scanner);
        navegador.atualizarPagina();
        pausarParaProximaAcao(scanner);
        navegador.adicionarFavorito(url);
        pausarParaProximaAcao(scanner);
        navegador.voltar();
        pausarParaProximaAcao(scanner);
        navegador.avancar();
        pausarParaProximaAcao(scanner);
    }

    public static void pausarParaProximaAcao(Scanner scanner) {
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }
}
