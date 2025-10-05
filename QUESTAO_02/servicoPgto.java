package QUESTAO_02;

// Serviço que executa o pagamento.
// Recebe uma fábrica abstrata e um valor, e delega a criação e execução do pagamento.
public class servicoPgto {
    public void pagar(absFabricaPgto fabricaPgto, double valor) {
        fabricaPgto.criar().pagar(valor);
    }
}

