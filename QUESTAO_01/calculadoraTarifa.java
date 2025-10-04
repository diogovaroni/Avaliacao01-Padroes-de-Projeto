package QUESTAO_01;

public class calculadoraTarifa {
    private iCalculoTarifa estrategia;

    public calculadoraTarifa(iCalculoTarifa estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double parametro) {
        return estrategia.calcularTarifa(parametro);
    }

    public void setEstrategia(iCalculoTarifa estrategia) {
        this.estrategia = estrategia;
    }
}
