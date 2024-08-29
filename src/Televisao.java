import java.util.Scanner;

public class Televisao {
    String modelo;
    String tamanho;
    double valor;

    public Televisao(String modelo, String tamanho, double valor) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    public void getTelevisao() {
        System.out.println("Modelo: " + modelo + ", Tamanho: " + tamanho + ", Valor: R$" + valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação das televisões
        Televisao televisaoUm = new Televisao("Samsung", "55 polegadas", 3000);
        Televisao televisaoDois = new Televisao("LG", "43 polegadas", 2000);
        Televisao televisaoTres = new Televisao("Sony", "65 polegadas", 3500);

        boolean samsungDisponivel = true;
        boolean lgDisponivel = true;
        boolean sonyDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir televisões");
            System.out.println("2 - Comprar uma televisão");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Televisões disponíveis para compra:");
                if (samsungDisponivel) {
                    System.out.print("1 - ");
                    televisaoUm.getTelevisao();
                }
                if (lgDisponivel) {
                    System.out.print("2 - ");
                    televisaoDois.getTelevisao();
                }
                if (sonyDisponivel) {
                    System.out.print("3 - ");
                    televisaoTres.getTelevisao();
                }
            } else if (k == 2) {
                System.out.println("Qual televisão deseja comprar?");
                System.out.println("1 - Samsung");
                System.out.println("2 - LG");
                System.out.println("3 - Sony");
                int opcaoTelevisao = scanner.nextInt();

                while (opcaoTelevisao < 1 || opcaoTelevisao > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoTelevisao = scanner.nextInt();
                }

                if (opcaoTelevisao == 1 && samsungDisponivel) {
                    samsungDisponivel = false;
                    System.out.println("Samsung foi comprado.");
                } else if (opcaoTelevisao == 2 && lgDisponivel) {
                    lgDisponivel = false;
                    System.out.println("LG foi comprado.");
                } else if (opcaoTelevisao == 3 && sonyDisponivel) {
                    sonyDisponivel = false;
                    System.out.println("Sony foi comprado.");
                } else {
                    System.out.println("Opção inválida ou televisão já comprada.");
                }

                if (!samsungDisponivel && !lgDisponivel && !sonyDisponivel) {
                    System.out.println("Todas as televisões foram compradas, obrigado.");
                }
            }

        } while (k != 0);
    }
}
