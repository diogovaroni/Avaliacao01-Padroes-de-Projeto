package QUESTAO_02;

// Implementação do pagamento via Cartão de Crédito.
// Valida o número do cartão e realiza o pagamento.
public class pgtoCredito implements iMeioPagamento {
    private String numeroCartao;

    public pgtoCredito(String numeroCartao) {
        try {
            if (numeroCartao.equals("123456")) {
                this.numeroCartao = numeroCartao;
            } else {
                throw new Exception("Número de cartão inválido.");
            }
        }   catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Cartão " + numeroCartao + ", pagamento efetuado. Valor: R$ " + valor);
    }
}
