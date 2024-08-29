import java.util.Scanner;

public class Gato {
    String nome;
    String cor;
    int idade;

    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public void getGato() {
        System.out.println("Nome: " + nome + ", Cor: " + cor + ", Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação dos gatos
        Gato gatoUm = new Gato("Thiago", "Preto", 3);
        Gato gatoDois = new Gato("Bruna", "Cinza", 2);
        Gato gatoTres = new Gato("Maria", "Branco", 4);

        boolean thiagoDisponivel = true;
        boolean brunaDisponivel = true;
        boolean mariaDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir gatos");
            System.out.println("2 - Adotar (remover) um gato");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Gatos disponíveis para adoção:");
                if (thiagoDisponivel) {
                    System.out.print("1 - ");
                    gatoUm.getGato();
                }
                if (brunaDisponivel) {
                    System.out.print("2 - ");
                    gatoDois.getGato();
                }
                if (mariaDisponivel) {
                    System.out.print("3 - ");
                    gatoTres.getGato();
                }
            } else if (k == 2) {
                System.out.println("Qual gato deseja adotar?");
                System.out.println("1 - Thiago");
                System.out.println("2 - Bruna");
                System.out.println("3 - Maria");
                int opcaoGato = scanner.nextInt();

                while (opcaoGato < 1 || opcaoGato > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoGato = scanner.nextInt();
                }

                if (opcaoGato == 1 && thiagoDisponivel) {
                    thiagoDisponivel = false;
                    System.out.println("Thiago foi adotado.");
                } else if (opcaoGato == 2 && brunaDisponivel) {
                    brunaDisponivel = false;
                    System.out.println("Bruna foi adotada.");
                } else if (opcaoGato == 3 && mariaDisponivel) {
                    mariaDisponivel = false;
                    System.out.println("Maria foi adotada.");
                } else {
                    System.out.println("Opção inválida ou gato já adotado.");
                }

                if (!thiagoDisponivel && !brunaDisponivel && !mariaDisponivel) {
                    System.out.println("Todos os gatos foram adotados, obrigado.");
                }
            }

        } while (k != 0);
    }
}
