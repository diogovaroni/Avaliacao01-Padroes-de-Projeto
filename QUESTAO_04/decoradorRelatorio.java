package QUESTAO_04;

public abstract class decoradorRelatorio implements iRelatorio {
    protected iRelatorio relatorio;

    public decoradorRelatorio(iRelatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public void gerar() {
        relatorio.gerar();
    }
}
