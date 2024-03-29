# Desafio_Biblioteca
Desafio proposto em sala de aula para desenvolver um gerenciador de livros na biblioteca.
O documento conta com a pasta "Livro.Java" onde esta declarada a classe livro e o que ela deve conter e os métodos para o gerenciamento da biblioteca.
A outra pasta "GerenciarBiblioteca.Java"  incializa uma lista de Livro e é onde está o main que o usuário vai interagir com o programa, foi desenvolvido um menu simples e de facil compreensão.
A função exeCadastrar, executa o cadastro do livro solicitando o titulo e autor, caso o usuário deixe em branco o sistema emite uma mensagem de erro, pois é necessário preencher os campos.
O método emprestarLivro, faz a busca do livro utilizando o titulo verifica a disponibilidade e altera.
O método devolverLivro, faz a busca do livro pelo titulo também, verifica e altera a disponibilidade.
O método listarLivros, lista todos os livros cadastrados no sistema, exibindo o titulo, autor e disponibilidade.
