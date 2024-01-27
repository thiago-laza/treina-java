import java.util.Scanner;
public class ex08 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas dos usuarios:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas dos usuarios:
        System.out.print("Qual a renda do homem? ");
        double rendaHomem = scanner.nextDouble();
        System.out.print("Qual a renda da mulher: ");
        double rendaMulher = scanner.nextDouble();
        //Determinando a renda conjunta:
        double rendaConjunta = rendaHomem + rendaMulher;
        //Verificando as condicoes:
        if (rendaConjunta < 900){
            System.out.print("ISENTO");
        } else if (rendaConjunta >= 900 && rendaConjunta <= 1500) {
            double aliquota = 0.10;
            double impostoDeRenda = rendaConjunta * aliquota;
            double rendaLiquida = rendaConjunta - impostoDeRenda;
            System.out.printf("Renda conjunta: %.2f%n" , rendaConjunta);
            System.out.println("Aliquota utulizadas: "+ aliquota*100 + "%");
            System.out.printf("Imposto de renda: %.2f%n" , impostoDeRenda);
            System.out.printf("Renda liquida: %.2f" , rendaLiquida);

        }

        scanner.close();
    }
}
