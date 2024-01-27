import java.util.Scanner;
public class ex20 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas do usuario:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Bairro: Santa Ana(s)/Industriarios(i)/Tabatinga(t): ");
        String bairro = scanner.next();
        System.out.print("Renda: ");
        double renda = scanner.nextDouble();
        System.out.print("Consumo: ");
        double consumo = scanner.nextDouble();
        //Fazendo as verificacoes:
        double valorPago = consumo;
        if (renda < 0 || consumo < 0){
            System.out.print("Renda e consumo nao podem ser negativos");
        }else {
            if (bairro.equals("s")){
                if (renda >= 50 && renda <= 500){
                    valorPago = consumo - 50;
                    System.out.printf("%.2f", valorPago);
                } else if (renda > 500 && renda <= 1000) {
                    valorPago = consumo - 25;
                    System.out.printf("%.2f", valorPago);
                }else {
                    System.out.printf("%.2f", valorPago);
                }
            } else if (bairro.equals("i")) {
                if (renda >= 240 && renda <= 1000){
                    valorPago = consumo - 240;
                    System.out.printf("%.2f", valorPago);
                } else if (renda > 1000 && renda <= 5000) {
                    valorPago = consumo - 120;
                    System.out.printf("%.2f", valorPago);
                }else {
                    System.out.printf("%.2f", valorPago);
                }
            } else if (bairro.equals("t")) {
                if (renda > 5000 && renda <= 10000){
                    valorPago = consumo - 720;
                    System.out.printf("%.2f", valorPago);
                } else if (renda > 10000 && renda <= 20000) {
                    valorPago = consumo - 360;
                    System.out.printf("%.2f", valorPago);
                }else {
                    System.out.printf("%.2f", valorPago);
                }
            }else {
                System.out.print("Bairro invalido.");
            }
        }

    }
}
