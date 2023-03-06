package taller1;

import java.util.Scanner;

public class agachese {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
       

    System.out.println("Digite la cantidad de productos");
    int numberOne;
    numberOne=lectura.nextInt();

    System.out.println("el total de productos son " +numberOne);

     System.out.println("el valor de la compra es " +numberOne*10000);
     System.out.println("ingrese el valor con el que paga");

     int numberTwo;
     numberTwo=lectura.nextInt();
    


    lectura.close ();

}
}
