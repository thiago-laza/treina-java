import java.util.Scanner;
public class ex02 {
    public static void main(String[] args){
        //Criando um objeto scanner:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas dos usuarios:
        System.out.print("Numero: ");
        int numeroFuncionario = scanner.nextInt();
        System.out.print("Numero de horas: ");
        int numeroDeHoras = scanner.nextInt();
        System.out.print("Valor por hora: ");
        double valorPorHora = scanner.nextDouble();
        //Calculando o salario:
        double salario =  numeroDeHoras * valorPorHora;
        //Exibindo o resultado:
        System.out.println("Numero = " + numeroFuncionario);
        System.out.print("Salario = R$ ");
        System.out.printf("%.2f",salario);

        scanner.close();
    }
}
