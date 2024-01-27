import java.util.Scanner;
public class ex03 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Salario fixo: ");
        double salarioFixo = scanner.nextDouble();
        System.out.print("Total de vendas: ");
        double totalDeVendas = scanner.nextDouble();
        //Calculando o salario final:
        double salarioFinal = salarioFixo + (0.15 * totalDeVendas);
        //Exibindo o resultado:
        System.out.print(nome);
        System.out.print(" recebera um salario de R$ ");
        System.out.printf("%.2f",salarioFinal);
        scanner.close();
    }
}
