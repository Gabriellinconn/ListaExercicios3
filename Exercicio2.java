public class Exercicio2 {

    public static void executar(){
        CarroEx2 carro1 = new CarroEx2();

        carro1.nomeCarro = Prompt.lerLinha("Digite o modelo do carro: ");
        carro1.distanciaPercorrida = Prompt.lerDecimal("Digite a distancia percorrida: ");
        carro1.combustivelGasto = Prompt.lerDecimal("Digite o quanto foi gasto com combustivel: ");



        Prompt.imprimir(carro1.nomeCarro+" Tem o consumo médio de : "+(carro1.distanciaPercorrida/carro1.combustivelGasto)+" Km/L");


    }
    
}
