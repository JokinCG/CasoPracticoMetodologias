
package principal;

import java.util.Scanner;
import modelo.Calculadora;


public class Presentacion {

    
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        String operacion;
        
        do{
            System.out.print("Introduce el número 1: ");
            a = sc.nextInt();
            System.out.print("Introduce el número 2: ");
            b = sc.nextInt();


            Calculadora cal = new Calculadora(a, b);


            cal.fijarNum1(a);
            cal.fijarNum2(b);
            System.out.println("¿Qué operación desea realizar? sumar / restar/ multiplicar");
            operacion = sc.nextLine();        

            switch (operacion){
             case "sumar":
                 System.out.println("Suma: " + cal.sumar());
                 break;
             case "restar":
                 System.out.println("Resta: " + cal.restar());
                 break;
             case "multiplicar":
                 System.out.println("Producto: " + cal.multiplicar());
                 break;
             default:
                 System.out.println("Opción No disponible");
                 break;
            }
        
        }while (operacion != "salir");
    
    }
}
        
    
    
