package QUESTAO_02;

public class fabricaBoleto extends absFabricaPgto {
    private String cpf;

    public fabricaBoleto(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public iMeioPagamento criar() {
        return new pgtoBoleto(this.cpf);
    }

}
