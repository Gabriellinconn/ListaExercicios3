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

            case 5:
            Exercicio5.executar();
            
            break;

            case 6:
            Exercicio6.executar();
            
            break;

            case 7:
            Exercicio7.executar();
            
            break;

            case 8:
            Exercicio8.executar();
            
            break;

            case 9:
            Exercicio9.executar();
            
            break;

            case 10:
            Exercicio10.executar();
            
            break;

            case 11:
            Exercicio11.executar();
            
            break;

            case 12:
            Exercicio12.executar();
            
            break;

            case 13:
            Exercicio13.executar();
            
            break;

            case 14:
            Exercicio14.executar();
            
            break;
  

        default:
        Prompt.imprimir("Exercicio não encontrado");
            break;
    }

num.close();

}

}