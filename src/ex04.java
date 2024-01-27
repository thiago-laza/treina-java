import java.util.Scanner;
public class ex04 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoNumero = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int terceiroNumero = scanner.nextInt();
        //Verificando o maior e o menor:
        int menor = primeiroNumero;
        int maior = primeiroNumero;
        if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero){
            menor = segundoNumero;
            System.out.println("Menor = " + segundoNumero);
        } else if (terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) {
            menor = terceiroNumero;
            System.out.println("Menor = " + terceiroNumero);
        }else {
            System.out.println("Menor = " + primeiroNumero);
        }
        if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
            maior = segundoNumero;
            System.out.println("Maior = " + segundoNumero);
        } else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
            maior = terceiroNumero;
            System.out.println("Maior = " + terceiroNumero);
        }else {
            System.out.println("Maior = " + primeiroNumero);
        }
        scanner.close();
    }
}