public class Exercicio1 {

    public static void executar(){
        AlunoEx1 aluno1 = new AlunoEx1();

        aluno1.nome= Prompt.lerLinha("Digite o seu nome: ");
        double soma=0;
        for(int i=0;i<3;i++){
            aluno1.nota[i]= Prompt.lerDecimal("Digite nota ("+(i+1)+")");
            soma+=aluno1.nota[i];
        }  
        Prompt.imprimir(aluno1.nome+": Média aritmética: "+(soma/3));

    }   
    
}
