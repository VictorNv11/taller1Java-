package taller1;

import java.util.Scanner;   

public class calculator {

    public static void main(String[] args) {

        Scanner leer =new Scanner (System.in);
        int producto,precio,cantidad, subtotal, contador, total; 
        
        contador=0;    
        total=0;
        for (int x=1; x<=5; x++){
            
            System.out.println("digite el precio del producto ");
            precio = leer.nextInt();

            System.out.println("ingrese la cantidad del producto ");
            cantidad=leer.nextInt();
            
            contador= contador+1;
            subtotal= precio+cantidad;
            total=total+subtotal;
        } 

        System.out.println("el valor a pagar es " +total);




        
        leer.close();



    }
    
}
