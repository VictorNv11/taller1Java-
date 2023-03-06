package retos;
import java.util.Random;
import java.util.Scanner;

public class RetoSiete {
    
        public static void main(String[] args) {
            Scanner Lectura = new Scanner(System.in);
            Random lectura2 = new Random();
            
            System.out.println("En el supermercado Noé estamos de aniversario y te obsequiamos un descuento en el valor de tu compra, si ésta es mayor a 50.000 y dependiendo de tu suerte");
            System.out.println("Digite el valor  de su compra: ");
            int compras=Lectura.nextInt();
            int suerte=1+ lectura2.nextInt(3);
            int pago;
            if (compras>50000) {
                switch (suerte) {
                    case 1:
                        System.out.println("Felicidades, saco la bola roja por lo que obtiene un 10% de descuento en el valor de su compra");
                        pago=(compras*10)/100;
                        System.out.println("El total a pagar de su compra es: "+pago);
                        break;
            
                    case 2:
                        System.out.println("Felicidades, saco la bola azul por lo que obtiene un 30% de descuento en el valor de su compra");
                        pago=(compras*30)/100;
                        System.out.println("El total a pagar de tu compra es: "+pago);
                    break;
        
                    case 3:
                    System.out.println("Felicidades, saco la bola amarilla por lo que obtiene un 50% de descuento en el valor de su compra");
                        pago=(compras*50)/100;
                        System.out.println("El total a pagar de su compra es: "+pago);
                    
                    break;
                    default:
                    System.out.println("Felicitaciones, saco la bola blanca por lo que su compra es gratis");
                        break;
                }
            } else 
            {
                System.out.println(" El valor de su compra no cumple con el requisito de ser mayor de 50.000 asi que no puede participar");
                
            }
            
            Lectura.close();
    
        }
        
    }

    



    

    

    





        
    



    


    


        
    

    

