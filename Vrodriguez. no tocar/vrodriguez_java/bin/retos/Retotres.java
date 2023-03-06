package retos;

import java.util.Random;
import java.util.Scanner;

public class Retotres {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random ramdom = new Random();

        int cs;
        System.out.println("Bienvenido a el juego carisellazo");
        System.out.println("Ingrese el numero 1 para cara, o el numero 2 para sello");
        cs = lectura.nextInt();

        int x = ramdom.nextInt(3-1)+1;

        switch(x){
            case 1:
                System.out.println("Callo  cara");
                if(cs==1){
                    System.out.println("Ha ganado");
                }else{
                    System.out.println("Perdio ");
                }
            break;
               case 2:
                System.out.println("Callo  sello");
                if(cs==2){
                    System.out.println("Ha ganado");
                }else{
                    System.out.println("Perdio");
                    
                }
                 break;
               default:
                 System.out.println("Su opcion es invalida");
            break;
        }

        lectura.close();
    }
}
