package QUESTAO_04;

public class relatorioEstatistico extends decoradorRelatorio {
    public relatorioEstatistico(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Relatório estatístico: Análise estatística dos pedidos incluída.");
    }
}
