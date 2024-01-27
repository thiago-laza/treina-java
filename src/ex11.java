import java.util.Scanner;
public class ex11 {
    public static void main(String[] args){
        //Criando objeto scanner para as entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Inicio: ");
        int inicio = scanner.nextInt();
        System.out.print("Fim: ");
        int fim = scanner.nextInt();
        //Determinando a duracao do jogo:
        if (inicio < fim){
            int duracao = fim - inicio;
            System.out.print("O jogo durou " + duracao + " hora (s).");
        }else {
            inicio = inicio - 12;
            fim = fim + 12;
            int duracao = fim - inicio;
            System.out.print("O jogo durou " + duracao + " hora (s).");
        }
        scanner.close();
    }
}
