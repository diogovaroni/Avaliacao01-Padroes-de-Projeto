package QUESTAO_01;

public class transporteAereo implements iCalculoTarifa {
    @Override
    public double calcularTarifa(double pesoKg) {
        // Tarifa aérea de R$10,00 por peso em kg
        return pesoKg * 10.00;
    }

}
