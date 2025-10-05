package QUESTAO_03;

// Interface que define o contrato para qualquer tópico de notícias.
// Permite adicionar/remover leitores e publicar notícias.
public interface iTopico {
    void adicionarLeitor(iLeitor leitor);
    void removerLeitor(iLeitor leitor);
    void publicarNoticia(String noticia);

}
