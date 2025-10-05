package QUESTAO_02;

// Classe abstrata que implementa o método de Fabric.
// Cada meio de pagamento deve implementar esse método para criar seu próprio processador.
public abstract class absFabricaPgto {
    public abstract iMeioPagamento criar();
}


