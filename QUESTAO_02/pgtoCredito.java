package QUESTAO_02;

// Implementação do pagamento via Cartão de Crédito.
// Valida o número do cartão e realiza o pagamento.
public class pgtoCredito implements iMeioPagamento {
    private String numeroCartao;

    public pgtoCredito(String numeroCartao) throws Exception {        
        if (!numeroCartao.equals("123456")) {
            throw new Exception("Número de cartão inválido.");
        }        
        this.numeroCartao = numeroCartao;    
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Cartão " + numeroCartao + ", pagamento efetuado. Valor: R$ " + valor);
    }
}
