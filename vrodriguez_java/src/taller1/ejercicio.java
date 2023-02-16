package taller1;

import java.util.Scanner;

public class ejercicio { 

    public static void main(String[] args) {
    Scanner lectura=new Scanner (System.in);
    System.out.println("ingrese el primer numero");
    int num1;
    num1= lectura.nextInt();

    System.out.println("ingrese el segundo numero");
    int num2;
    num2=lectura.nextInt();

    if(num1>num2){
        System.out.println("El" +num1 + "es mayor que el: " +num2);

        int total;
        total=num1+num2;

        System.out.println("el resulatado de la suma es: " + total);
    }else{
        System.out.println("El"+num2+ "es mayor que el :" +num1);
        int total;
        total=num2-num1;

        System.out.println("el resulatado de la resta es: " + total);
    }

lectura.close();
    }
}
