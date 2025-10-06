package QUESTAO_04;

// Decorador que adiciona gráficos ao relatório.
public class relatorioGrafico extends decoradorRelatorio {
    public relatorioGrafico(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Relatório gráfico: Gráficos dos pedidos incluídos.");
    }
}
