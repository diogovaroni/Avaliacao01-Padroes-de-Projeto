package QUESTAO_02;

// Implementação do pagamento via Boleto Bancário.
// Valida o CPF e realiza o pagamento.
public class pgtoBoleto implements iMeioPagamento {
    private String cpf;
    public pgtoBoleto(String cpf) {
        try {
            if (cpf.equals("12345678900")) {
                this.cpf = cpf;
            } else {
                throw new Exception("CPF inválido.");
            }
        }   catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Boleto gerado para CPF " + cpf + ". Valor: R$ " + valor);
    }

}
