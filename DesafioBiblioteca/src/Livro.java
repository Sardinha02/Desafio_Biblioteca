public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    public Livro(){

    }
    //construtor padrão

//método construtor para inicializar livro
public Livro(String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = true;
}
public void emprestar(){
    if (disponivel){
        disponivel = false;
        System.out.println("O Livro " +titulo+ " foi emprestado.");
    }
    else {
        System.out.println("O livro " +titulo+ " nao esta disponivel para emprestimo!");
    }

}
public void listar(){
    System.out.println("Titulo: " +titulo);
    System.out.println("Autor: " +autor);
    String texto = disponivel ? " Disponivel" : " Indisponivel";
    System.out.println("Disponibilidade: " +texto);
    }
public void devolver() {
    if (!disponivel) {
        disponivel = true;
        System.out.println("O Livro " + titulo + " foi devolvido.");
    } else {
        System.out.println("O livro " + titulo + " ja foi devolvido e esta disponivel para emprestimo!");
    }
}
    // Método para obter o título do livro
    public String getTitulo() {
        return titulo;
    }

    // Método para verificar se o livro está disponível
    public boolean isDisponivel() {
        return disponivel;
    }
}