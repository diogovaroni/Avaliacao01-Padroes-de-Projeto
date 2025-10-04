package QUESTAO_01;

public class transporteMaritmo implements iCalculoTarifa {
    @Override
    public double calcularTarifa(double volumeM3) {
        // Tarifa marítima de R$100,00 por volume em m³
        return volumeM3 * 100.00;
    }
    
}
