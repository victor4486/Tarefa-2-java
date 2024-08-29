import java.util.Scanner;

public class Cerveja {
    String marca;
    String tipo;
    double valor;

    public Cerveja(String marca, String tipo, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void getCerveja() {
        System.out.println("Marca: " + marca + ", Tipo: " + tipo + ", Valor: R$" + valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação das cervejas
        Cerveja cervejaUm = new Cerveja("Heineken", "Lager", 7.50);
        Cerveja cervejaDois = new Cerveja("Budweiser", "Pale Lager", 6.00);
        Cerveja cervejaTres = new Cerveja("Corona", "Pale Lager", 8.00);

        boolean heinekenDisponivel = true;
        boolean budweiserDisponivel = true;
        boolean coronaDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir cervejas");
            System.out.println("2 - Comprar uma cerveja");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Cervejas disponíveis para compra:");
                if (heinekenDisponivel) {
                    System.out.print("1 - ");
                    cervejaUm.getCerveja();
                }
                if (budweiserDisponivel) {
                    System.out.print("2 - ");
                    cervejaDois.getCerveja();
                }
                if (coronaDisponivel) {
                    System.out.print("3 - ");
                    cervejaTres.getCerveja();
                }
            } else if (k == 2) {
                System.out.println("Qual cerveja deseja comprar?");
                System.out.println("1 - Heineken");
                System.out.println("2 - Budweiser");
                System.out.println("3 - Corona");
                int opcaoCerveja = scanner.nextInt();

                while (opcaoCerveja < 1 || opcaoCerveja > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoCerveja = scanner.nextInt();
                }

                if (opcaoCerveja == 1 && heinekenDisponivel) {
                    heinekenDisponivel = false;
                    System.out.println("Heineken foi comprada.");
                } else if (opcaoCerveja == 2 && budweiserDisponivel) {
                    budweiserDisponivel = false;
                    System.out.println("Budweiser foi comprada.");
                } else if (opcaoCerveja == 3 && coronaDisponivel) {
                    coronaDisponivel = false;
                    System.out.println("Corona foi comprada.");
                } else {
                    System.out.println("Opção inválida ou cerveja já comprada.");
                }

                if (!heinekenDisponivel && !budweiserDisponivel && !coronaDisponivel) {
                    System.out.println("Todas as cervejas foram compradas, obrigado.");
                }
            }

        } while (k != 0);
    }
}
