package QUESTAO_04;

public class relatorioBasico implements iRelatorio {
    @Override
    public void gerar() {
        System.out.println("Relatório básico: Lista de pedidos gerada.");
    }
}
