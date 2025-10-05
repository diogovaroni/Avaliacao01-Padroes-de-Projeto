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
        return new pgtoPix(this.chavePix);     
    }
}
