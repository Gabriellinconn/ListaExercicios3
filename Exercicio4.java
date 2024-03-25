public class Exercicio4 {

    public static void executar(){

        DolarEx4 conversao1 = new DolarEx4();

        conversao1.dolar = Prompt.lerDecimal("Digite o valor em dolares que você possui: ");
        conversao1.cotDolar = Prompt.lerDecimal("Digite a cotação do dolar no dia de hoje: ");

        Prompt.imprimir("Você possui "+(conversao1.dolar*conversao1.cotDolar)+" em Reais");

    }
    
}
