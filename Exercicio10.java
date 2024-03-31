public class Exercicio10 {
    public static void executar(){
        
        GrupoEx10 grupo1 = new GrupoEx10();

        for(int i=0; i<grupo1.pessoa.length;i++){
           grupo1.pessoa[i] = Prompt.lerInteiro("Pessoa ("+(i+1)+") tem quantos anos?");
        }
        for(int i=0; i<grupo1.pessoa.length;i++){
            if(grupo1.pessoa[i]>=18){
                Prompt.imprimir("Pessoa ("+(i+1)+") tem "+grupo1.pessoa[i]+" anos = Maior de idade");
            }else{
                Prompt.imprimir("Pessoa ("+(i+1)+") tem "+grupo1.pessoa[i]+" anos = Menor de idade");

            }
        }

    }
    
}
