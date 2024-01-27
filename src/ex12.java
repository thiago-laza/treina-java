import java.util.Scanner;
public class ex12 {
    public static void main(String[] args){
        //Criando um objeto scanner para as entradas dos usuarios:
        Scanner scanner = new Scanner(System.in);
        //Obtendo as entradas do usuario:
        System.out.print("Escolha uma das opcoes: vertebrado ou invertebrado-> ");
        String opc1 = scanner.next();
        //Verificando as condicoes:
        if (opc1.equals("vertebrado")){
            System.out.print("Escolha uma das opcoes: ave ou mamifero-> ");
            String opc2A = scanner.next();
            if (opc2A.equals("ave")){
                System.out.print("Escolha uma das opcoes: carnivoro ou onivoro-> ");
                String opc3A = scanner.next();
                if (opc3A.equals("carnivoro")){
                    System.out.print("aguia.");
                }else if (opc3A.equals("onivoro")){
                    System.out.print("pomba.");
                }else{
                    System.out.print("opcao invalida.");
                }
            } else if (opc2A.equals("mamifero")) {
                System.out.print("Escolha uma das opcoes: onivoro ou herbivoro-> ");
                String opc4A = scanner.next();
                if (opc4A.equals("onivoro")){
                    System.out.print("homem.");
                }else if (opc4A.equals("herbivoro")){
                    System.out.print("vaca.");
                }else{
                    System.out.print("opcao invalida.");
                }
            }else {
                System.out.print("opcao invalida.");
            }

        } else if (opc1.equals("invertebrado")) {
            System.out.print("Escolha uma das opcoes: inseto ou anelideo-> ");
            String opc2B = scanner.next();
            if (opc2B.equals("inseto")){
                System.out.print("Escolha uma das opcoes: hematofogo ou herbivoro-> ");
                String opc3B = scanner.next();
                if (opc3B.equals("hematofogo")){
                    System.out.print("pulga.");
                } else if (opc3B.equals("herbivoro")) {
                    System.out.print("lagarta.");
                }else {
                    System.out.print("opcao invalida.");
                }
            } else if (opc2B.equals("anelideo")) {
                System.out.print("Escolha uma das opcoes: hematofago ou onivoro-> ");
                String opc4B = scanner.next();
                if (opc4B.equals("hematofago")){
                    System.out.print("sanguessuga.");
                } else if (opc4B.equals("onivoro")) {
                    System.out.print("minhoca.");
                }
            }else {
                System.out.print("opcao invalida.");
            }

        }else {
            System.out.print("opcao invalida.");
        }
        scanner.close();
    }
}
