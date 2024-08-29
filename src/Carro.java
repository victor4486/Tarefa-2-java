import java.util.Scanner;

public class Carro{
    String modelo;
    String cor;
    int ano;
    double valor;

    public Carro(String modelo, String cor, int ano, double valor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }

    public void getCarro() {
        System.out.println("Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano + ", Valor: R$" + valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação dos carros
        Carro carroUm = new Carro("Kwid", "Branco", 2020, 45000 );
        Carro carroDois = new Carro("Corsa", "Prata", 2008, 15000);
        Carro carroTres = new Carro("Celer", "Preto", 2015, 28000);

        boolean kwidDisponivel = true;
        boolean corsaDisponivel = true;
        boolean celerDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir carros");
            System.out.println("2 - Comprar um carro");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Carros disponíveis para compra:");
                if (kwidDisponivel) {
                    System.out.print("1 - ");
                    carroUm.getCarro();
                }
                if (corsaDisponivel) {
                    System.out.print("2 - ");
                    carroDois.getCarro();
                }
                if (celerDisponivel) {
                    System.out.print("3 - ");
                    carroTres.getCarro();
                }
            } else if (k == 2) {
                System.out.println("Qual carro deseja comprar?");
                System.out.println("1 - Kwid");
                System.out.println("2 - Corsa");
                System.out.println("3 - Celer");
                int opcaoCarro = scanner.nextInt();

                while (opcaoCarro < 1 || opcaoCarro > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoCarro = scanner.nextInt();
                }

                if (opcaoCarro == 1 && kwidDisponivel) {
                    kwidDisponivel = false;
                    System.out.println("kwid foi comprado.");
                } else if (opcaoCarro == 2 && corsaDisponivel) {
                    corsaDisponivel = false;
                    System.out.println("Corsa foi comprado.");
                } else if (opcaoCarro == 3 && celerDisponivel) {
                    celerDisponivel = false;
                    System.out.println("Celer foi comprado.");
                } else {
                    System.out.println("Opção inválida ou carro já comprado.");
                }

                if (!kwidDisponivel && !corsaDisponivel && !celerDisponivel) {
                    System.out.println("Todos os carros foram comprados, obrigado.");
                }
            }

        } while (k != 0);
    }
}
