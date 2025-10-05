package QUESTAO_03;

// Classe principal que simula o funcionamento do sistema de notícias.
// Cria tópicos, leitores e publica notícias com notificações automáticas.
public class sistemaNoticias {
    public static void main(String[] args) {
        // Criando tópicos de notícias
        iTopico politica = new topico("Política");
        iTopico esporte = new topico("Esporte");
        iTopico tecnologia = new topico("Tecnologia");

        // Criando leitores
        iLeitor leitor1 = new leitor("Diogo");
        iLeitor leitor2 = new leitor("Daniel");
        iLeitor leitor3 = new leitor("Leandro");

        // Inscrevendo leitores nos tópicos
        politica.adicionarLeitor(leitor1);
        esporte.adicionarLeitor(leitor1);
        esporte.adicionarLeitor(leitor2);
        tecnologia.adicionarLeitor(leitor2);
        tecnologia.adicionarLeitor(leitor3);

        // Publicando notícias
        politica.publicarNoticia("Nova reforma tributária aprovada.");
        esporte.publicarNoticia("Time A vence o campeonato!");
        tecnologia.publicarNoticia("Novo smartphone lançado no mercado!");

        // Removendo um leitor e publicando outra notícia
        esporte.removerLeitor(leitor2);
        esporte.publicarNoticia("Jogador X se transfere para o Time B.");
    }

}
