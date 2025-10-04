package QUESTAO_01;

public class valorFrete {
    public static void main(String[] args) {
        
        //Distância suposta de 150 km
        calculadoraTarifa calc = new calculadoraTarifa(new transporteTerrestre());        
        double tarifaTerrestre = calc.calcular(150.0);
        System.out.println("Tarifa Terrestre: R$" + tarifaTerrestre);

        //Peso suposto de 20 kg
        calc.setEstrategia(new transporteAereo());
        double tarifaAerea = calc.calcular(20.0);
        System.out.println("Tarifa Aérea: R$" + tarifaAerea);

        //Volume suposto de 0.75 m³
        calc.setEstrategia(new transporteMaritmo());
        double tarifaMaritima = calc.calcular(0.84);
        System.out.println("Tarifa Marítima: R$" + tarifaMaritima);
    }
}
