package QUESTAO_02;

// Implementação do pagamento via Boleto Bancário.
// Valida o CPF e realiza o pagamento.
public class pgtoBoleto implements iMeioPagamento {
    private String cpf;
    public pgtoBoleto(String cpf) throws Exception {
        if (!cpf.equals("12345678900")) {
            throw new Exception("CPF inválido.");
        }
        this.cpf = cpf;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Boleto gerado para CPF " + cpf + ". Valor: R$ " + valor);
    }

}
