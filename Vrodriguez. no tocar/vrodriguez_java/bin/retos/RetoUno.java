package retos;

import java.util.Scanner;

public class RetoUno {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        float f, c;
                                                    
        System.out.println("FUNCIONA!!!");

        System.out.println("Ingrese los grados F° que quiera conventir a C°");
        f = lectura.nextFloat();
        c = (f-32) * 5/9 ;
        System.out.println("En grados C serian:" +c );

        lectura.close();
    }
}