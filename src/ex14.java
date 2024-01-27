import java.util.Scanner;
public class ex14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor: ");
        int valor = scanner.nextInt();
        if (valor % 2 == 0){
            for (int i = 1; i <= 12; i = i + 2){
                System.out.println(valor + i);
            }
        }else if (valor % 2 != 0){
            for (int i = 1; i <= 12; i = i + 2){
                System.out.println(valor + i - 1);
            }
        }
        scanner.close();
    }
}
