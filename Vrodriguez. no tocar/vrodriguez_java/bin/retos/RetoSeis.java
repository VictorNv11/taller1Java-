package retos;

import java.util.random;

public class RetoSeis {
        public static void main(String[] args) {
    
            Random Leer2 = new Random();
            
            int intento1=1+Leer2.nextInt(6);
            System.out.println(intento1);
            int givenTwo=1+Leer2.nextInt(6);
            System.out.println(givenTwo);
    
    
            int case2=intento1+givenTwo;
    
            if (intento1==1 && givenTwo==1) {
                System.out.println("En el dado numero uno salio " +intento1+ " y en el otro  " +givenTwo+ " al sacar un par de unos gana");
            } 
            
            else if(case2==3) 

            
            {
                
                System.out.println("En el dado numero uno salio " +intento1+ " y en el otro " +givenTwo+ " al sacar una total de tres gana");
            }
            else if (case2==11)
            {


                System.out.println("En el dado numero uno salio " +intento1+ " y en el otro " +givenTwo+ " al sacar una total de once gana");
            }
            else if ((intento1==2 && givenTwo==2) || (intento1==12 && givenTwo==12)) 
            {


                System.out.println("En el dado numero uno salio " +intento1+ " y en el otro " +givenTwo+ " al sacar un par de dos o doce gana");
            }
            else if (case2==7) {
                System.out.println("En el dado numero uno salio " +intento1+ " y en el otro " +givenTwo+ " al sacar un total de 7 gana");
            }
            else{
                System.out.println("haz perdido");
            }
        }
    }

    

 