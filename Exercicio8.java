public class Exercicio8 {
    public static void executar(){

        NotaAlunoEx8 aluno1 = new NotaAlunoEx8();

        double media = 0;

        aluno1.nome = Prompt.lerLinha("Digite seu nome: ");
        for(int i =0; i<aluno1.nota.length; i++){
            aluno1.nota[i]=Prompt.lerDecimal("Insira a Nota "+(i+1)+":");

            media+= aluno1.nota[i];
        }

        media = media/3;

        if(media<=5){
            Prompt.imprimir(aluno1.nome+" Foi reprovado com média: "+media);
        }else if (media>5 && media<7){
            Prompt.imprimir(aluno1.nome+" Deverá realizar a recuperação, pois média: "+media);
        }else{
            Prompt.imprimir(aluno1.nome+" Foi Aprovado com média: "+media);
        }
        


    }
}
