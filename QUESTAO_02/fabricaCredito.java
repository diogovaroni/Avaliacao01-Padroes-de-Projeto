package QUESTAO_02;

// Fábrica concreta para pagamentos via Cartão de Crédito.
// Recebe o número do cartão e cria o objeto de pagamento correspondente.
public class fabricaCredito extends absFabricaPgto {
    private String numeroCartao;

    public fabricaCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public iMeioPagamento criar() {
        return new pgtoCredito(this.numeroCartao);        
    }
}
