import java.util.Scanner;
public class ex15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = scanner.nextInt();

        System.out.println("Os " + valor + " primeiros termos da sequencia de Fibonacci sao: ");
        int x1 = 0;
        System.out.println(x1);
        int x2 = 1;
        System.out.println(x2);
        for (int i = 2; i <= valor; i++){
            int x = x1 + x2;
            x1 = x2;
            x2 = x;
            System.out.println(x);

        }
        scanner.close();
    }
}
