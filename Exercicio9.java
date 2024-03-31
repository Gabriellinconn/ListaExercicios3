import java.util.Random;

public class Exercicio9 {

    public static void executar() {
        NumEntreEx9 n1 = new NumEntreEx9();
        Random gerador = new Random();
       
        for (int i = 0; i < 80; i++) {
            n1.numero[i] = gerador.nextInt(800);
        }

        Prompt.linhaEmBranco();
        Prompt.linhaEmBranco();
        Prompt.imprimir("Números Sorteados: ");


        for (int i = 0; i < 80; i++) {
            System.out.print(n1.numero[i] + ",  ");
        }

        Prompt.linhaEmBranco();
        Prompt.linhaEmBranco();

        Prompt.imprimir("Números entre 10 e 150: ");

        for (int i = 0; i < 80; i++) {
            if(n1.numero[i]>=10 && n1.numero[i]<=150){
            System.out.print(n1.numero[i] + ",  ");
            }
        }
    }
}