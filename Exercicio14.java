public class Exercicio14 {
    public static void executar(){
        PrecoProdutoEx14 produto = new PrecoProdutoEx14();

        double valorCusto =0;
        double valorVenda =0;

        for(int i=0;i<produto.nomeProduto.length;i++){
            produto.nomeProduto[i] = Prompt.lerLinha("Digite o nome do produto ("+(i+1)+")");
            produto.precoCusto[i] = Prompt.lerDecimal("Digite o valor de custo de: "+produto.nomeProduto[i]);
            produto.precoVenda[i] = Prompt.lerDecimal("Digite o valor de venda de: "+produto.nomeProduto[i]);

            valorCusto+=produto.precoCusto[i];
            valorVenda+=produto.precoVenda[i];
        }
        for(int i=0;i<produto.nomeProduto.length;i++){

            if(produto.precoCusto[i]<produto.precoVenda[i]){
                Prompt.imprimir("O Produto "+produto.nomeProduto[i]+" está retornando lucro");
            }else if(produto.precoCusto[i]>produto.precoVenda[i]){
                Prompt.imprimir("O Produto "+produto.nomeProduto[i]+" está retornando prejuízo");
            }else{
                Prompt.imprimir("O Produto "+produto.nomeProduto[i]+" está retornando empate no valor");
        }
    }
        Double mediaCusto = valorCusto/produto.precoCusto.length;
        Double mediaVenda = valorVenda/produto.precoVenda.length;

        Prompt.linhaEmBranco();
        Prompt.linhaEmBranco();

        Prompt.imprimir("Média de valor de produtos de custo: R$"+ mediaCusto);
        Prompt.imprimir("Média de valor de produtos de venda: R$"+ mediaVenda);

        Prompt.linhaEmBranco();

        Prompt.imprimir("Média lucro das vendas é de: R$"+ (mediaVenda-mediaCusto));




    


    
    }
}
