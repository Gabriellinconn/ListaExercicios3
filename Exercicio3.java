public class Exercicio3 {

    public static void executar(){

    VendedorEx3 vendedor1 = new VendedorEx3();

    vendedor1.nome = Prompt.lerLinha("Digite nome do Vendedor: ");
    vendedor1.salario = Prompt.lerDecimal("Digite seu salario fixo: ");
    vendedor1.totalVendas = Prompt.lerDecimal("Digite quanto o vendedor fez de venda em R$: ");

    Prompt.imprimir(vendedor1.nome+": tem o salário fixo de: "+vendedor1.salario+"R$ e o salário com a comissão resulta em: "+(vendedor1.salario+(vendedor1.totalVendas*0.15))+"R$");
    }
}
