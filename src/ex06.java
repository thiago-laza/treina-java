import java.util.Scanner;
public class ex06 {
    public static void main(String[] args){
        //Criando objeto para as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Distancia percorrida (km): ");
        int distanciaPercorrida = scanner.nextInt();
        System.out.print("Total de combustivel (litros): ");
        double totalCombustivel = scanner.nextDouble();
        //Calculando o cunsumo:
        double consumo = distanciaPercorrida / totalCombustivel;
        //Exibindo o resultado:
        System.out.printf("%.3f",consumo);
        System.out.print(" km/l");

        scanner.close();
    }
}