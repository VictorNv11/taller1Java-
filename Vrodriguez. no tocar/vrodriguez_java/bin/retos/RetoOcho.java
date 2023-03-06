
import java.util.ArrayList;
import java.util.Scanner;


public class RetoOcho {

    public static void main(String[] args) {
        try (Scanner lectura = new Scanner(System.in)) {
            int valor, x, contador, i, price, contadorP, descuento, priceD;
            Object resultado;

            System.out.println("Digite la cantidad de productos: ");
            contador = lectura.nextInt();

            valor = 0;

            for(i = 1; i <= contador; i++){
                System.out.println("Ingrese el precio del producto #" + i + ":");
                price = lectura.nextInt();

                System.out.println("Ingrese la cantidad del producto #" + i + ":");
                contadorP = lectura.nextInt();

                valor += price * contadorP;
            }

            System.out.println("El total a pagar es: " + valor);

            if(valor >= 50000){

                
                
                
                System.out.println("Usted ha sido beneficiado de un descuento por compras mayores a $50.000");

                

    
                x = (int) (Math.random() * 4);

                resultado = bolitas.get(x);

                System.out.println("Valor obtenido: " + resultado);

                if(resultado == "rojo"){

                    descuento = (int) ((int) valor * 0.1);
                    priceD = (valor - descuento);
                    System.err.println("Has obtenido el descuento del 10% sobre el valor de tu compra, el valor total con descuento es de: " + priceD);

                }else if(resultado == "amarillo"){

                    descuento = (int) ((int) valor * 0.5);
                    priceD = (valor - descuento);
                    System.err.println("Has obtenido el descuento del 50% sobre el valor de tu compra, el valor total con descuento es de: " + priceD);

                }else if(resultado == "azul"){




                    descuento = (int) ((int) valor * 0.3);
                    priceD = (valor - descuento);
                    System.err.println
                    
                    ("Has obtenido el descuento del 30% sobre el valor de tu compra, el valor total con descuento es de: " + priceD);

                }else if(resultado == "blanco"){

                    System.err.println("Has obtenido tu compra gratis");

                }else{
                    System.out.println
                    ("Ha ocurrido un error inesperado");
                }

            }else{
                System.out.println("El valor de la compra es inferior de $50.000, no aplicas para los descuentos");
            }

        lectura.close();
        }
    }
}
    
