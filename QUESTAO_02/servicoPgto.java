package QUESTAO_02;

// Serviço que executa o pagamento.
// Recebe uma fábrica abstrata e um valor, e delega a criação e execução do pagamento.
public class servicoPgto {
    public void pagar(absFabricaPgto fabricaPgto, double valor) {
        iMeioPagamento pagamento = fabricaPgto.criar();
        if (pagamento != null) {
            pagamento.pagar(valor);
        } else {
            System.out.println("Falha ao processar o pagamento.");
        }
    }
}

