package taller1;

import java.util.Scanner;

public class ejercicio2 { 
    
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        int numero;
        System.out.println("ingrese el numero");
        numero= lectura.nextInt();
        if(numero>0){
            System.out.println("numero es positivo");
        }
        else if(numero<0){
            System.out.println("numero es negativo");
        }
        else {
            System.out.println("numero es neutro");
        }
    lectura.close();
    }
  
}