import java.util.Scanner;
public class ex05 {
    public static void main(String[] args){
        //Criando objeto scanner para as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int segundoValor = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int terceiroValor = scanner.nextInt();
        //Verificando as condicoes:
        if (primeiroValor < segundoValor && primeiroValor < terceiroValor){
            if (segundoValor < terceiroValor){
                System.out.print("Valores em ordem: ");
                System.out.printf("%d, %d, %d", primeiroValor,segundoValor,terceiroValor);
            }else {
                System.out.print("Valores em ordem: ");
                System.out.printf("%d, %d, %d", primeiroValor,terceiroValor,segundoValor);
            }
        } else if (segundoValor < primeiroValor && segundoValor < terceiroValor) {
            if (primeiroValor < terceiroValor){
                System.out.print("Valores em ordem: ");
                System.out.printf("%d, %d, %d", segundoValor,primeiroValor,terceiroValor);
            }else {
                System.out.print("Valores em ordem: ");
                System.out.printf("%d, %d, %d", segundoValor,terceiroValor,primeiroValor);
            }
        } else if (terceiroValor < primeiroValor && terceiroValor < segundoValor) {
            if (primeiroValor < segundoValor){
                System.out.print("Valores em ordem: ");
                System.out.printf("%d, %d, %d", terceiroValor,primeiroValor,segundoValor);
            }else {
                System.out.print("Valores em ordem: ");
                System.out.printf("%d, %d, %d", terceiroValor,segundoValor,primeiroValor);
            }
        }
        scanner.close();
    }
}