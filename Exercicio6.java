public class Exercicio6 {
    public static void executar(){

        PrecoProdutoEx6 produto1 = new PrecoProdutoEx6();
        
        produto1.preco = Prompt.lerDecimal("Informe o preço de custo deste produto: ");
        produto1.acrescimo = Prompt.lerDecimal("Informe a porcentagem de acrescimo no valor do produto: ");

        Prompt.imprimir("O preço final do produto para venda é de R$"+(produto1.preco+(produto1.preco*(produto1.acrescimo*0.01))));

    }
    
}
