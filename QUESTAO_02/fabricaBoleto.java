package QUESTAO_02;

public class fabricaBoleto extends absFabricaPgto {
    private String cpf;

    public fabricaBoleto(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public iMeioPagamento criar() {
        try {
            return new pgtoBoleto(this.cpf);
        } catch (Exception e) {
            System.out.println("Erro ao criar pagamento por Boleto: " + e.getMessage());
            return null;
        }
    }

}
