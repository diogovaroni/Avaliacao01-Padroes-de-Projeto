package QUESTAO_02;

// Implementação concreta para pagamento via Boleto Bancário.
// Segue o contrato definido pela interface MeioPagamento.
public class pgtoBoleto implements iMeioPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " no Boleto.");
    }

}
