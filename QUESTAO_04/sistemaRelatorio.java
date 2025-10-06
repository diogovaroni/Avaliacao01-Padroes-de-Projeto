package QUESTAO_04;

// Classe principal que simula a geração de relatórios com extensões opcionais.
public class sistemaRelatorio {
    public static void main(String[] args) {
        // Relatório básico
        iRelatorio relatorio1 = new relatorioBasico();
        relatorio1.gerar();
        
        System.out.println("\n---");

        // Relatório com estatísticas
        iRelatorio relatorio2 = new relatorioEstatistico(new relatorioBasico());
        relatorio2.gerar();
        
        System.out.println("\n---");

        // Relatório com análise estatística + gráficos + PDF
        iRelatorio relatorio3 = new relatorioPDF(
                                    new relatorioGrafico(
                                        new relatorioEstatistico(
                                            new relatorioBasico()
                                        )
                                    )
                                );
        relatorio3.gerar();

    }
}
