import java.util.Scanner;

public class Celular {
    String modelo;
    String cor;
    int ano;
    double valor;

    public Celular(String modelo, String cor, int ano, double valor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }

    public void getCelular() {
        System.out.println("Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano + ", Valor: R$" + valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação dos celulares
        Celular celularUm = new Celular("Galaxy S21", "Preto", 2021, 2500);
        Celular celularDois = new Celular("iPhone 12", "Branco", 2020, 4000);
        Celular celularTres = new Celular("Moto G8", "Azul", 2019, 1500);

        boolean galaxyDisponivel = true;
        boolean iphoneDisponivel = true;
        boolean motoDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir celulares");
            System.out.println("2 - Comprar um celular");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Celulares disponíveis para compra:");
                if (galaxyDisponivel) {
                    System.out.print("1 - ");
                    celularUm.getCelular();
                }
                if (iphoneDisponivel) {
                    System.out.print("2 - ");
                    celularDois.getCelular();
                }
                if (motoDisponivel) {
                    System.out.print("3 - ");
                    celularTres.getCelular();
                }
            } else if (k == 2) {
                System.out.println("Qual celular deseja comprar?");
                System.out.println("1 - Galaxy S21");
                System.out.println("2 - iPhone 12");
                System.out.println("3 - Moto G8");
                int opcaoCelular = scanner.nextInt();

                while (opcaoCelular < 1 || opcaoCelular > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoCelular = scanner.nextInt();
                }

                if (opcaoCelular == 1 && galaxyDisponivel) {
                    galaxyDisponivel = false;
                    System.out.println("Galaxy S21 foi comprado.");
                } else if (opcaoCelular == 2 && iphoneDisponivel) {
                    iphoneDisponivel = false;
                    System.out.println("iPhone 12 foi comprado.");
                } else if (opcaoCelular == 3 && motoDisponivel) {
                    motoDisponivel = false;
                    System.out.println("Moto G8 foi comprado.");
                } else {
                    System.out.println("Opção inválida ou celular já comprado.");
                }

                if (!galaxyDisponivel && !iphoneDisponivel && !motoDisponivel) {
                    System.out.println("Todos os celulares foram comprados, obrigado.");
                }
            }

        } while (k != 0);
    }
}
