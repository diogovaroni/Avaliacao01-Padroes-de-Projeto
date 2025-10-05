package QUESTAO_03;

import java.util.ArrayList;
import java.util.List;

// Classe concreta que representa um tópico de notícias.
// Mantém uma lista de leitores inscritos e notifica todos quando há uma nova notícia.
public class topico implements iTopico {
    private String nome;
    private List<iLeitor> leitores;

    public topico(String nome) {
        this.nome = nome;
        this.leitores = new ArrayList<>();
    }

    @Override
    public void adicionarLeitor(iLeitor leitor) {
        leitores.add(leitor);
    }

    @Override
    public void removerLeitor(iLeitor leitor) {
        leitores.remove(leitor);
    }

    @Override
    public void publicarNoticia(String noticia) {
        System.out.println("Nova notícia em " + nome + ": " + noticia);
        for (iLeitor leitor : leitores) {
            leitor.atualizar("[" + nome + "] " + noticia);
        }
    }
}
