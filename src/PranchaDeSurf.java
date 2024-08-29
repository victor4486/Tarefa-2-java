import java.util.Scanner;

public class PranchaDeSurf {
    String modelo;
    String cor;
    double comprimento;

    public PranchaDeSurf(String modelo, String cor, double comprimento) {
        this.modelo = modelo;
        this.cor = cor;
        this.comprimento = comprimento;
    }

    public void getPrancha() {
        System.out.println("Modelo: " + modelo + ", Cor: " + cor + ", Comprimento: " + comprimento + " metros");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação das pranchas de surf
        PranchaDeSurf pranchaUm = new PranchaDeSurf("Shortboard", "Azul", 1.80);
        PranchaDeSurf pranchaDois = new PranchaDeSurf("Longboard", "Amarela", 2.40);
        PranchaDeSurf pranchaTres = new PranchaDeSurf("Fish", "Verde", 1.90);

        boolean shortboardDisponivel = true;
        boolean longboardDisponivel = true;
        boolean fishDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir pranchas de surf");
            System.out.println("2 - Comprar (remover) uma prancha de surf");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Pranchas de surf disponíveis para adoção:");
                if (shortboardDisponivel) {
                    System.out.print("1 - ");
                    pranchaUm.getPrancha();
                }
                if (longboardDisponivel) {
                    System.out.print("2 - ");
                    pranchaDois.getPrancha();
                }
                if (fishDisponivel) {
                    System.out.print("3 - ");
                    pranchaTres.getPrancha();
                }
            } else if (k == 2) {
                System.out.println("Qual prancha de surf deseja adotar?");
                System.out.println("1 - Shortboard");
                System.out.println("2 - Longboard");
                System.out.println("3 - Fish");
                int opcaoPrancha = scanner.nextInt();

                while (opcaoPrancha < 1 || opcaoPrancha > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoPrancha = scanner.nextInt();
                }

                if (opcaoPrancha == 1 && shortboardDisponivel) {
                    shortboardDisponivel = false;
                    System.out.println("Shortboard foi Comprada.");
                } else if (opcaoPrancha == 2 && longboardDisponivel) {
                    longboardDisponivel = false;
                    System.out.println("Longboard foi Comprada.");
                } else if (opcaoPrancha == 3 && fishDisponivel) {
                    fishDisponivel = false;
                    System.out.println("Fish foi Comprada.");
                } else {
                    System.out.println("Opção inválida ou prancha já Comprada.");
                }

                if (!shortboardDisponivel && !longboardDisponivel && !fishDisponivel) {
                    System.out.println("Todas as pranchas de surf foram Comprada, obrigado.");
                }
            }

        } while (k != 0);
    }
}
