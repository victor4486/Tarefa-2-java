import java.util.Scanner;

public class Fruta {
    String nome;
    String cor;
    double preco;

    public Fruta(String nome, String cor, double preco) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
    }

    public void getFruta() {
        System.out.println("Nome: " + nome + ", Cor: " + cor + ", Preço: R$" + preco);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação das frutas
        Fruta frutaUm = new Fruta("Maçã", "Vermelha", 3.0);
        Fruta frutaDois = new Fruta("Banana", "Amarela", 2.0);
        Fruta frutaTres = new Fruta("Laranja", "Laranja", 2.5);

        boolean macaDisponivel = true;
        boolean bananaDisponivel = true;
        boolean laranjaDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir frutas");
            System.out.println("2 - Comprar uma fruta");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Frutas disponíveis para compra:");
                if (macaDisponivel) {
                    System.out.print("1 - ");
                    frutaUm.getFruta();
                }
                if (bananaDisponivel) {
                    System.out.print("2 - ");
                    frutaDois.getFruta();
                }
                if (laranjaDisponivel) {
                    System.out.print("3 - ");
                    frutaTres.getFruta();
                }
            } else if (k == 2) {
                System.out.println("Qual fruta deseja comprar?");
                System.out.println("1 - Maçã");
                System.out.println("2 - Banana");
                System.out.println("3 - Laranja");
                int opcaoFruta = scanner.nextInt();

                while (opcaoFruta < 1 || opcaoFruta > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoFruta = scanner.nextInt();
                }

                if (opcaoFruta == 1 && macaDisponivel) {
                    macaDisponivel = false;
                    System.out.println("Maçã foi comprada.");
                } else if (opcaoFruta == 2 && bananaDisponivel) {
                    bananaDisponivel = false;
                    System.out.println("Banana foi comprada.");
                } else if (opcaoFruta == 3 && laranjaDisponivel) {
                    laranjaDisponivel = false;
                    System.out.println("Laranja foi comprada.");
                } else {
                    System.out.println("Opção inválida ou fruta já comprada.");
                }

                if (!macaDisponivel && !bananaDisponivel && !laranjaDisponivel) {
                    System.out.println("Todas as frutas foram compradas, obrigado.");
                }
            }

        } while (k != 0);
    }
}
