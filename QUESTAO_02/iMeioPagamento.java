package QUESTAO_02;

// Interface comum para todos os meios de pagamento.
// Permite que o sistema trate diferentes formas de pagamento de maneira genérica.
public interface iMeioPagamento {
    void pagar(double valor);
}
