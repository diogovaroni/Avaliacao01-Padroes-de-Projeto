package QUESTAO_02;

// Implementação do pagamento via PIX.
// Valida a chave e realiza o pagamento.
public class pgtoPix implements iMeioPagamento {
    private String chavePix;

    public pgtoPix(String chavePix) {
        try {
            if (chavePix.equals("pix@empresa.com")) {
                this.chavePix = chavePix;
            } else {
                throw new Exception("Chave Pix inválida.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void pagar(double valor) {
        System.out.println("PIX " + chavePix + ", pagamento efetuado. valor: R$ " + valor);
    }

}
