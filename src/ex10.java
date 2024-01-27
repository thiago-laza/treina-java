import java.util.Scanner;
public class ex10 {
    public static void main(String[] args){
        //Criando um objeto scanner para obter a entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Informe a idade em dias: ");
        int idadeDias = scanner.nextInt();
        //Determinando a idade em anos, meses e dias:
        int anos = idadeDias / 365;
        int meses = (idadeDias - (anos * 365)) / 30;
        int dias = idadeDias - (anos * 365 + meses * 30);
        //Exibindo o resultado:
        System.out.println(anos + " ano (s).");
        System.out.println(meses + " mes (es).");
        System.out.println(dias + " dia (s).");

        scanner.close();
    }
}
