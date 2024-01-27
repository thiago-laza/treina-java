import java.util.Scanner;
public class ex16 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario.
        System.out.print("Populacao do pais A: ");
        double popA = scanner.nextDouble();
        System.out.print("Populacao do pais B: ");
        double popB = scanner.nextDouble();
        //Determinando o calculo das populacoes:
        int cont = 0;
        while (popA <= popB) {
            popA *= 1.03;
            popB *= 1.015;
            cont ++;
        }
        System.out.print(cont + " anos.");

    }
}
