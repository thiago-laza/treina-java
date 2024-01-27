import java.util.Scanner;
public class ex19 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas dos usuarios:
        Scanner scanner = new Scanner(System.in);
        //Obtendo a entrada do usuario:
        System.out.print("Salario atual: ");
        double salarioAtual = scanner.nextDouble();
        //Analisando as condicoes:
        if (salarioAtual > 500){
            double novoSalario = salarioAtual * 1.1;
            System.out.printf("%.2f", novoSalario);
        } else if (salarioAtual > 300) {
            double novoSalario = salarioAtual * 1.07;
            System.out.printf("%.2f", novoSalario);
        }else {
            double novoSalrio = salarioAtual * 1.05;
            System.out.printf("%.2f", novoSalrio);
        }
    }
}
