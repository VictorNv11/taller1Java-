package retos;
import java.util.Scanner;

public class RetoDos {
public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);
        float p ,d;
        

        System.out.println("Ingrese el peso del bebe");
        p = rr.nextFloat();
        d = (float) ((p - 0.4) *6/4) ;
        System.out.println("la dosis a aplicar segun el peso son: " +d);



        rr.close();
    }
    }
    
    

