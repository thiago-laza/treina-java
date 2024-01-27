import java.util.Scanner;
public class ex18 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo a entrada do usuario:
        System.out.print("Digite um numero de 4 algarismos: ");
        int numero = scanner.nextInt();
        //Verificando as condicoes:
        int unidade = numero % 10;
        int dezena = (numero % 100) / 10;
        int centena = (numero % 1000) / 100;
        int unidadeMilhar = numero / 1000;
        //Exibindo o resultado:
        System.out.print("O numero " + numero + " invertido e: ");
        System.out.print(unidade);
        System.out.print(dezena);
        System.out.print(centena);
        System.out.print(unidadeMilhar);

    }
}
