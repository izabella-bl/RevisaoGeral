package Bytes;

import java.util.Scanner;

public class IdadeBytes {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Informe sua idade:");
        byte idade = Byte.parseByte(sc.nextLine());

        if (idade <= 0){
            System.out.println("Idade invalida");
        }
        else if(idade >= 18){
            System.out.println("Maior de idade");
        }
        else if (idade < 18 ){
            System.out.println("Menor de idade");

        }

    }
}
