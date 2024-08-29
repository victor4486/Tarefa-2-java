import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void getLivro() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciação dos livros
        Livro livroUm = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livroDois = new Livro("A revolução dos bichos", "George Orwell", 1949);
        Livro livroTres = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        boolean senhorDosAneisDisponivel = true;
        boolean aRevolucaoDosBichosDisponivel = true;
        boolean domCasMurroDisponivel = true;

        int k;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Exibir livros");
            System.out.println("2 - Alugar (remover) um livro");
            System.out.println("0 - Sair");
            k = scanner.nextInt();

            while (k < 0 || k > 2) {
                System.out.println("Opção inválida, tente novamente:");
                k = scanner.nextInt();
            }

            if (k == 1) {
                System.out.println("Livros disponíveis para alugar:");
                if (senhorDosAneisDisponivel) {
                    System.out.print("1 - ");
                    livroUm.getLivro();
                }
                if (aRevolucaoDosBichosDisponivel) {
                    System.out.print("2 - ");
                    livroDois.getLivro();
                }
                if (domCasMurroDisponivel) {
                    System.out.print("3 - ");
                    livroTres.getLivro();
                }
            } else if (k == 2) {
                System.out.println("Qual livro deseja alugar?");
                System.out.println("1 - O Senhor dos Anéis");
                System.out.println("2 - A Revolução dos bichos");
                System.out.println("3 - Dom Casmurro");
                int opcaoLivro = scanner.nextInt();

                while (opcaoLivro < 1 || opcaoLivro > 3) {
                    System.out.println("Opção inválida, digite novamente:");
                    opcaoLivro = scanner.nextInt();
                }

                if (opcaoLivro == 1 && senhorDosAneisDisponivel) {
                    senhorDosAneisDisponivel = false;
                    System.out.println("O Senhor dos Anéis foi alugado.");
                } else if (opcaoLivro == 2 && aRevolucaoDosBichosDisponivel) {
                    aRevolucaoDosBichosDisponivel = false;
                    System.out.println("A Revolução dos Bichos foi alugado.");
                } else if (opcaoLivro == 3 && domCasMurroDisponivel) {
                    domCasMurroDisponivel = false;
                    System.out.println("Dom Casmurro foi alugado.");
                } else {
                    System.out.println("Opção inválida ou livro já adotado.");
                }

                if (!senhorDosAneisDisponivel && !aRevolucaoDosBichosDisponivel && !domCasMurroDisponivel) {
                    System.out.println("Todos os livros foram adotados, obrigado.");
                }
            }

        } while (k != 0);
    }
}
