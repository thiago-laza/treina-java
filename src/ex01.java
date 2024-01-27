import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        //Cria um objeto scanner para a entrada do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        //Calculando a media:
        float media = (float) ((nota1 * 3.5) + (nota2 * 7.5)) / 11;
        //Exibindo o resultado:
        System.out.print(media);

        scanner.close();
    }
}


