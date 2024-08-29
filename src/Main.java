import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Bem-vindo ao programa, selecione qual deseja utilizar:");

        do {
            System.out.println("1 - Cachorros\n2 - Carros\n3 - Celulares\n4 - Flores\n5 - Frutas\n6 - Gatos\n7 - Livros\n8 - Cerveja\n9 - Pranchas de Surf\n10 - Televisão\n0 - Sair do programa");
            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 10) {
                System.out.println("Opção inválida, digite novamente:");
                continue;
            }

            switch (opcao) {
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                case 1:
                    Cachorro.main(new String[]{});
                    break;
                case 2:
                    Carro.main(new String[]{});
                    break;
                case 3:
                    Celular.main(new String[]{});
                    break;
                case 4:
                    Flor.main(new String[]{});
                    break;
                case 5:
                    Fruta.main(new String[]{});
                    break;
                case 6:
                    Gato.main(new String[]{});
                    break;
                case 7:
                    Livro.main(new String[]{});
                    break;
                case 8:
                    Cerveja.main(new String[]{});
                    break;
                case 9:
                    PranchaDeSurf.main(new String[]{});
                    break;
                case 10:
                    Televisao.main(new String[]{});
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
