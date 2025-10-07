package QUESTAO_02;

// Fábrica concreta para pagamentos via PIX.
// Recebe a chave PIX e cria o objeto de pagamento correspondente.
public class fabricaPix extends absFabricaPgto {
    
    private String chavePix;

    public fabricaPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public iMeioPagamento criar() {
        try {
            return new pgtoPix(this.chavePix);
        } catch (Exception e) {
            System.out.println("Erro ao criar pagamento por PIX: " + e.getMessage());
            return null;
        }
    }
}
