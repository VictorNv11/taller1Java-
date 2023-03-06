
package taller1;

        import java.util.Scanner;

public class discoteca {
public static void main(String[] args) {
   
int age;
Scanner lectura=new Scanner (System.in);
 System.out.println("ingrese la edad");
 age=lectura.nextInt();
 if(age<18){
    System.out.println("no puede ingresar");

 }
else{
    System.out.println("bienvenido");

}
lectura.close();

}
}   
