import java.util.Scanner;

public class Flor {
    String nome;
    String cor;
    double valor;

    public Flor(String nome, String cor, double valor) {
        this.nome = nome;
        this.cor = cor;
        this.valor = valor;
    }

    public void getFlor() {
        System.out.println("Nome: " + nome + ", Cor: " + cor + ", Valor: R$" + valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação das flores
        Flor florUm = new Flor("Rosa", "Vermelha", 10.0);
        Flor florDois = new Flor("Tulipa", "Amarela", 15.0);
        Flor florTres = new Flor("Orquídea", "Roxa", 20.0);

        boolean rosaDisponivel = true;
        boolean tulipaDisponivel = true;
        boolean orquideaDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir flores");
            System.out.println("2 - Comprar uma flor");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Flores disponíveis para compra:");
                if (rosaDisponivel) {
                    System.out.print("1 - ");
                    florUm.getFlor();
                }
                if (tulipaDisponivel) {
                    System.out.print("2 - ");
                    florDois.getFlor();
                }
                if (orquideaDisponivel) {
                    System.out.print("3 - ");
                    florTres.getFlor();
                }
            } else if (k == 2) {
                System.out.println("Qual flor deseja comprar?");
                System.out.println("1 - Rosa");
                System.out.println("2 - Tulipa");
                System.out.println("3 - Orquídea");
                int opcaoFlor = scanner.nextInt();

                while (opcaoFlor < 1 || opcaoFlor > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoFlor = scanner.nextInt();
                }

                if (opcaoFlor == 1 && rosaDisponivel) {
                    rosaDisponivel = false;
                    System.out.println("Rosa foi comprada.");
                } else if (opcaoFlor == 2 && tulipaDisponivel) {
                    tulipaDisponivel = false;
                    System.out.println("Tulipa foi comprada.");
                } else if (opcaoFlor == 3 && orquideaDisponivel) {
                    orquideaDisponivel = false;
                    System.out.println("Orquídea foi comprada.");
                } else {
                    System.out.println("Opção inválida ou flor já comprada.");
                }

                if (!rosaDisponivel && !tulipaDisponivel && !orquideaDisponivel) {
                    System.out.println("Todas as flores foram compradas, obrigado.");
                }
            }

        } while (k != 0);
    }
}
