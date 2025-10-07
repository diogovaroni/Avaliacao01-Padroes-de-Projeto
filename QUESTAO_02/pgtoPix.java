package QUESTAO_02;

// Implementação do pagamento via PIX.
// Valida a chave e realiza o pagamento.
public class pgtoPix implements iMeioPagamento {
    private String chavePix;

    public pgtoPix(String chavePix) throws Exception {
        if (!chavePix.equals("11122")) {
            throw new Exception("Chave Pix inválida.");
        }
        this.chavePix = chavePix;              
    }
    
    
    @Override
    public void pagar(double valor) {
        System.out.println("PIX " + chavePix + ", pagamento efetuado. valor: R$ " + valor);
    }

}
