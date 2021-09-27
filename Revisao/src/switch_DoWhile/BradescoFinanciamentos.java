package switch_DoWhile;

import  java.util.Scanner;

public class BradescoFinanciamentos {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        System.out.println("----------------Bem vindo ao Bradesco Financiemnto!--------------------");
        boolean novamente = true;
        do {
            System.out.println("Menu :\n1 - Crédito Pessoal\n2 - Crédito Imobiliário\n3 - Crédito Empresarial\n4 - Empréstimo Consignado\n");
            System.out.print("Digite:");
            int op = Integer.parseInt(sc.nextLine());
            System.out.println("\n");

            switch (op) {
                case 1:
                    System.out.println("Crédito Pessoal");
                    novamente = retição();
                    break;
                case 2:
                    System.out.println("Crédito Imobiliário");
                    novamente = retição();
                    break;
                case 3:
                    System.out.println("Crédito Empresarial");
                    novamente = retição();
                    break;
                case 4:
                    System.out.println("Empréstimo Consignado");
                    novamente = retição();
                    break;
                default:
                    System.out.println("Opção invalida,Tente novamente!");
                    novamente = true;
                    break;
            }
        } while (novamente);
    }

    static boolean retição( ){
        char escolha ;
        boolean validar = true;
        boolean op = true;
        do {
            System.out.println("Deseja voltar ao menu principal (‘V’) ou sair do sistema(‘S’)?");
            escolha = sc.nextLine().toUpperCase().charAt(0);
            if(escolha == 'V'){
                op = true;
                validar = false;
            }
            else if(escolha == 'S'){
                System.out.println("Obrigado pela sua visita!");
                op = false;
                validar = false;
            }
            else if(escolha != 'V' || escolha !='S'){
                System.out.println("Opcao invalida tente novamente!");
                validar = true;
            }

        }while (validar);
        return op;


    }
}
