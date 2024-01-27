import java.util.Scanner;
public class ex17 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Insira o numero de casos a serem analisados: ");
        int numeros = scanner.nextInt();
        //Verificando as condicoes:
        for (int i = 1; i <= numeros; i++){
            System.out.print("Insira um numero: ");
            int valor = scanner.nextInt();
            int cont = 0;
            for (int n = 1; n <= valor; n++){
                if (valor % n == 0){
                    cont++;
                }
            }if (cont == 2){
                System.out.println(valor + " e primo.");
            }else {
                System.out.println(valor + " nao e primo.");
            }
        }
    }
}
