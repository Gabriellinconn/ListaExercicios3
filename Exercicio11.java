public class Exercicio11 {

    public static void executar(){
        NomeESexoEx11 grupo1 = new NomeESexoEx11();
       
        int totalHomens = 0;
        int totalMulheres = 0;

        for(int i=0; i<grupo1.sexo.length;i++){
            Prompt.imprimir("Nome: "+grupo1.nome[i]+" - Sexo: "+grupo1.sexo[i]);
            if(grupo1.sexo[i]=='M'){
                totalHomens++;
            }else{
                totalMulheres++;
            }
        }
        Prompt.imprimir("Total de Homens: "+totalHomens);
        Prompt.imprimir("Total de Mulher: "+totalMulheres);

    }
    
}
