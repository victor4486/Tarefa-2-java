import java.util.Scanner;

public class Cachorro {
    String nome;
    String cor;
    int idade;

    public Cachorro(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public void getCachorro() {
        System.out.println("Nome: " + nome + ", cor: " + cor + ", idade: " + idade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cachorro cachorroUm = new Cachorro("Jorgin", "Caramelo", 2);
        Cachorro cachorroDois = new Cachorro("Bentinho", "Preto", 3);
        Cachorro cachorroTres = new Cachorro("Pedrinho", "Branco", 1);

        boolean jorginDisponivel = true;
        boolean bentinhoDisponivel = true;
        boolean pedrinhoDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir cachorros");
            System.out.println("2 - Adotar (remover) um cachorro");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Cachorros disponíveis para adoção:");
                if (jorginDisponivel) {
                    System.out.print("1 - ");
                    cachorroUm.getCachorro();
                }
                if (bentinhoDisponivel) {
                    System.out.print("2 - ");
                    cachorroDois.getCachorro();
                }
                if (pedrinhoDisponivel) {
                    System.out.print("3 - ");
                    cachorroTres.getCachorro();
                }
            } else if (k == 2) {
                System.out.println("Qual cachorro deseja adotar?");
                System.out.println("1 - Jorgin");
                System.out.println("2 - Bentinho");
                System.out.println("3 - Pedrinho");
                int opcaoCachorro = scanner.nextInt();

                while (opcaoCachorro < 1 || opcaoCachorro > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoCachorro = scanner.nextInt();
                }

                if (opcaoCachorro == 1 && jorginDisponivel) {
                    jorginDisponivel = false;
                    System.out.println("Jorgin foi adotado.");
                } else if (opcaoCachorro == 2 && bentinhoDisponivel) {
                    bentinhoDisponivel = false;
                    System.out.println("Bentinho foi adotado.");
                } else if (opcaoCachorro == 3 && pedrinhoDisponivel) {
                    pedrinhoDisponivel = false;
                    System.out.println("Pedrinho foi adotado.");
                } else {
                    System.out.println("Opção inválida ou cachorro já adotado.");
                }

                if (!jorginDisponivel && !bentinhoDisponivel && !pedrinhoDisponivel) {
                    System.out.println("Todos os cachorros foram adotados, obrigado.");
                }
            }

        } while (k != 0);
    }
}
