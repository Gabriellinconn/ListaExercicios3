public class Exercicio13 {
    public static void executar(){

        ExercitoEx13 pessoas = new ExercitoEx13();

        int aptos=0;
        int aptosN=0;

        for(int i=0; i< pessoas.nome.length;i++){
            pessoas.nome[i] = Prompt.lerLinha("Digite seu nome: ");
            pessoas.idade[i] = Prompt.lerInteiro("Digite sua idade: ");
            pessoas.sexo[i] = Prompt.lerLinha("Digite seu gênero (M/F): ");
            pessoas.saude[i] = Prompt.lerLinha("Digite a situação da sua saude (boa/ruim): ");
            if (pessoas.sexo[i].equals("M")&&pessoas.idade[i]>=18&&pessoas.saude[i].equals("boa")) {
                aptos++;
                Prompt.imprimir(pessoas.nome[i]+": Você está apto para servir ao exercito");
            }else{
                Prompt.imprimir(pessoas.nome[i]+": Você não está apto para servir ao exercito");
                aptosN++;
            }

        }

        Prompt.linhaEmBranco();
        Prompt.linhaEmBranco();
                                                                  

        Prompt.imprimir(aptos+" Pessoas são aptas");

        Prompt.imprimir(aptosN+" Pessoas não são aptas");


    }
    
}
