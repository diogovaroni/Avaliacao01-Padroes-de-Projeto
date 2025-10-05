package QUESTAO_03;

// Classe concreta que representa um leitor.
// Implementa o método de atualização para receber notícias.
public class leitor implements iLeitor {
    private String nome;

    public leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println("Leitor " + nome + " recebeu a notícia: " + noticia);
    }
}
