package QUESTAO_02;

// Implementação concreta para pagamento via Cartão de Crédito.
// Segue o contrato definido pela interface MeioPagamento.
public class pgtoCredito implements iMeioPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " no Crédito.");
    }

}
