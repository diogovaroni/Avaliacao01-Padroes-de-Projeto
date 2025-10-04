package QUESTAO_01;

public class transporteTerrestre implements iCalculoTarifa {
    @Override
    public double calcularTarifa(double distanciaKm) {
        // Tarifa terrestre de R$0,50 por km
        return distanciaKm * 0.50;
    }

}
