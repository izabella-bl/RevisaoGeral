package Double;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario = 0;

        do {
            System.out.println("Informe o seu salario: ");
            salario = Double.parseDouble(sc.nextLine());

            if(salario <= 0){
                System.out.println("Valor invalido! Tente novamente!");
            }
        }while (salario <= 0);

        if (salario >= 5399.99){
            System.out.println("O seu salario é maior que R$5399,99");
        }
        else if (salario >= 1997.58  ){
            System.out.println("Seu salario é maior que R$ 1997,58");
        }
        else{
            System.out.println("Nao possui dados para esse salario !");
        }
    }
}
