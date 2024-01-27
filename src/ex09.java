import java.util.Scanner;
public class ex09 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Recebendo as entradas dos usuarios:
        System.out.print("Informe o tempo em segundos: ");
        int tempo = scanner.nextInt();
        //Convertendo o tempo para o formato HH:MM:SS
        int hora = tempo / 3600;
        int minuto = (tempo - (hora * 3600)) / 60;
        int segundo = tempo - (hora * 3600 + minuto * 60);
        //Exibindo o resultado:
        System.out.printf("HH:MM:SS = %02d:%02d:%02d",hora,minuto,segundo);

        scanner.close();

    }
}
