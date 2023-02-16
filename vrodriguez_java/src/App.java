import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        String name;
        System.out.println("Hello, World!");

        System.out.println("ingrese un numero");
        int numberOne;
        numberOne=lectura.nextInt();

        System.out.println("ingrese el segundo numero");
       int numberTwo;
       numberTwo=lectura.nextInt();

       System.out.println("los numeros ingresados son "+numberOne+numberTwo);
      
       System.out.println(numberOne+numberTwo);

       lectura.nextLine(); //Limpiezabuffer

        System.out.println("ingrese su nombre");
        name=lectura.nextLine();
        System.out.println("su nombre es "+name);

    



        lectura.close();
    }
}
