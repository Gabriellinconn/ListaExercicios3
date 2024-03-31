public class Exercicio12 {
    public static void executar(){
        CarangoEx12 carros = new CarangoEx12();
        String resposta;
        int qtd = 0;
        int qtd2000 = 0;
        boolean continua = false;
        
            do{
                carros.nomeCarro = Prompt.lerLinha("Digite o nome do carro: ");
                carros.valorCarro = Prompt.lerDecimal("Digite o valor do veículo: ");
                carros.ano = Prompt.lerInteiro("De que ano é o seu carro?");
                qtd++;
                if(carros.ano<=2000){
                    Prompt.imprimir("O desconto do veículo foi de R$"+(carros.valorCarro*0.12)+" - Valor do veículo pós desconto: R$"+(carros.valorCarro-carros.valorCarro*0.12));
                    qtd2000++;
                }else{
                    Prompt.imprimir("O desconto do veículo foi de R$"+(carros.valorCarro*0.07)+" - Valor do veículo pós desconto: R$"+(carros.valorCarro-carros.valorCarro*0.07));

                }
                resposta = Prompt.lerLinha("Você deseja consultar mais valores? (S/N)");
                if(resposta.equals("N") ){
                    continua = true;
                }
            }while(continua == false);

            Prompt.imprimir("Volte sempre!");
            Prompt.imprimir("Veiculos abaixo dos anos 2000 consultados: "+qtd2000+" - Total de consultas: "+ qtd);
    }
    
}
