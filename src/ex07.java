import java.util.Scanner;
public class ex07 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo a entrada do usuario:
        System.out.println("Informe o valor: ");
        int valor = scanner.nextInt();
        //Calculando o numero de cedulas:
        int cedulas100 = valor / 100;
        int resto1 = valor - (cedulas100 * 100);
        int cedulas50 = resto1 / 50;
        int resto2 = resto1 - (cedulas50 * 50);
        int cedulas20 = resto2 / 20;
        int resto3 = resto2 - (cedulas20 * 20);
        int cedulas10 = resto3 / 10;
        int resto4 = resto3 - (cedulas10 * 10);
        int cedulas5 = resto4 / 5;
        int resto5 = resto4 - (cedulas5 * 5);
        int cedulas2 = resto5 / 2;
        int cedulas1 = resto5 - (cedulas2 * 2);
        //Exibindo o resultado:
        System.out.println("R$ " + valor);
        System.out.println(cedulas100 + " Notas de R$ 100,00");
        System.out.println(cedulas50 + " Notas de R$ 50,00");
        System.out.println(cedulas20 + " Notas de R$ 20,00");
        System.out.println(cedulas10 + " Notas de R$ 10,00");
        System.out.println(cedulas5 + " Notas de R$ 5,00");
        System.out.println(cedulas2 + " Notas de R$ 2,00");
        System.out.println(cedulas1 + " Notas de R$ 1,00");

        scanner.close();
    }
}
