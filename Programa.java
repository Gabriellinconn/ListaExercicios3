import java.util.Scanner;

public class Programa{
    
public static void main (String[] args) {

    Scanner num = new Scanner(System.in);
    
    System.out.println("~Escolha o exercicio: 1-15~");
    int n = num.nextInt();


    switch (n) {
            case 1:
            Exercicio1.executar();
            
            break;

            case 2:
            Exercicio2.executar();
            
            break;

            case 3:
            Exercicio3.executar();
            
            break;

            case 4:
            Exercicio4.executar();
            
            break;
  

        default:
        Prompt.imprimir("Exercicio não encontrado");
            break;
    }

num.close();

}

}