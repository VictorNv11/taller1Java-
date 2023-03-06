package taller1;

import java.util.Scanner;
 
public class calculadora {

public static void main(String[] args) {

Scanner lectura=new Scanner (System.in);

System.out.println("ingrese el primer numero");
    int numOne, numTwo,total, op;
    double total1, total2;
    numOne= lectura.nextInt();

    System.out.println("ingrese el segundo numero");
    numTwo=lectura.nextInt();

    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicacion");
    System.out.println("4. Division");
    System.out.println("5. Potenciacion");
    System.out.println("6. Radicacion ");
op=lectura.nextInt();
switch(op){
    case 1:
    total= numOne+numTwo;
System.out.println("la suma entre " + numOne+ " y " + numTwo+ " es " +total  );

break;
case 2:
total=numOne-numTwo;
System.out.println("la resta entre " + numOne+ " y " + numTwo+ " es " +total  );

break;
case 3:
total= numOne*numTwo;
System.out.println("la multiplicacion entre " + numOne+ " y " + numTwo+ " es " +total  );

break;
case 4:
total= numOne/numTwo;
System.out.println("la division entre " + numOne+ " y " + numTwo+ " es " +total  );

case 5:
total1= Math.pow(numOne, numTwo);
System.out.println("la potenciacion entre " + numOne+ " y " + numTwo+ " es " +total1  );

break;
case 6:
total2= Math.sqrt(numOne+numTwo);
System.out.println("la radicacion entre " + numOne+ " y " + numTwo+ " es " +total2  );
break;

default:
System.out.println("la seleccion que escogio no existe");
break;

}
lectura.close();
}
}


