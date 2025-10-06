package QUESTAO_04;

// Decorador que exporta o relatório em PDF.
public class relatorioPDF extends decoradorRelatorio {
    public relatorioPDF(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Relatório PDF: Exportado em formato PDF.");
    }
}

