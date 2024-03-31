public class Exercicio5{
    public static void executar(){

        LojaMamaoEx5 compra1 = new LojaMamaoEx5();

        compra1.valor = Prompt.lerDecimal("Qual foi o valor da compra?");

        Prompt.imprimir("A compra pode ser parcelada em 5x de R$"+(compra1.valor/5));


    }
}