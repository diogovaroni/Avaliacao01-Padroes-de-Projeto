package QUESTAO_02;

// Classe principal que simula o uso da plataforma de pagamento.
// Demonstra a criação dinâmica dos meios de pagamento via fábricas.
public class sistemaDePagamento {
    public static void main(String[] args) {
        
        servicoPgto service = new servicoPgto();

        // Pagamento via Cartão de Crédito
        service.pagar(new fabricaCredito("123456"), 1000.00);

        // Pagamento via Pix
        service.pagar(new fabricaPix("1112"), 500.00);        
        
        // Pagamento via Boleto
        service.pagar(new fabricaBoleto("1234567890"), 750.00);

    }
}
