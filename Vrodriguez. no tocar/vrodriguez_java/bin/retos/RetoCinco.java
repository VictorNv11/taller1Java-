package retos;

import java.util.Scanner;





public class RetoCinco {
     public static void main(String[] args) {
         
        Scanner lectura = new Scanner(System.in);
        System.out.println(" Ingrese su nombre: ");
        String pan = lectura.nextLine();
        System.out.println(" Ingrese su apellido: ");
        String pc = lectura.nextLine();
        
        int name = pan.length(); 
        System.out.println("la longitud de su nombre es:" +name);
        
        System.out.println("Su nombre en mayusculas:" );
        int lastName = pc.length();
        System.out.println("la longitud del apellido es: " + lastName);

    System.out.println("Su nombre en mayusculas:" + pan.toUpperCase());
    System.out.println("su apellido en minuscula:" +pc.toLowerCase());

    System.out.println("su nombre y apellido son: " +pan+ " "  +pc);

    String bread  = pan.substring(0, 2 );

    String breadtwo = bread + pc;
    
    System.out.println( "su nombre y su apellido juntos son: " + breadtwo);





        

    lectura.close();
    }

        

     

}
