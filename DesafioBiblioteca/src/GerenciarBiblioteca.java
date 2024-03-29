import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarBiblioteca {
    private List<Livro>listaLivros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarBiblioteca gerenciar = new GerenciarBiblioteca();

        int opcao = 0;

        do {
            System.out.println("Menu");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Emprestar livro");
            System.out.println("3. Devolver livro");
            System.out.println("4. Listar todos os livros");
            System.out.println("9. sair");
            System.out.println("Digite sua opcao: ");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.emprestarLivro();
                    break;
                case 3:
                    gerenciar.devolverLivro();
                    break;
                case 4:
                    gerenciar.listarLivros();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao invalida!!");
            }

        } while (opcao!=9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o titulo do livro: ");
        String titulo = sc.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor = sc.nextLine();
        Livro func = new Livro(titulo, autor);
        //não permitir que o usuario cadastre um livro sem titulo ou autor
        if (titulo.isEmpty() || autor.isEmpty()) {
            System.out.println("Erro: Não é possível cadastrar um livro sem título ou autor.");
            return;
        }
        listaLivros.add(func); //adicionando na lista de livros
        System.out.println("Livro cadastrado com sucesso!!");
    }
    public void emprestarLivro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o titulo do livro a ser emprestado: \n");
        String tituloProc = sc.nextLine();
        for (Livro l : listaLivros){
            if (l.getTitulo().equals(tituloProc)){
                if (l.isDisponivel()){
                    l.emprestar();
                    return;
                }
                else {
                    System.out.println("O livro ja foi emprestado\n");
                }

            }
            else {
                System.out.println("O livro nao foi encontrado\n");
            }

        }
    }

    public void devolverLivro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o titulo do livro a ser devolvido:\n");
        String tituloProc = sc.nextLine();
        for (Livro l : listaLivros){
            if (l.getTitulo().equals(tituloProc)){
                l.devolver();
                return;
            }
            else {
                System.out.println("Livro nao encontrado.");
            }
        }
    }

    public void listarLivros(){
        for (Livro l : listaLivros){
            l.listar();
        }
    }
}