public class Exercicio7 {

    public static void executar(){

        CustoCarroEx7 carro1 = new CustoCarroEx7();
        carro1.custoFabrica = Prompt.lerDecimal("Informe o Custo de fábrica do carro: ");

        carro1.custoFabrica = ((carro1.custoFabrica+=carro1.custoFabrica*(0.45))+carro1.custoFabrica*0.28);
//
        Prompt.imprimir("O custo ao consumidor deste veículo será de: R$"+carro1.custoFabrica);

    }
    
}
