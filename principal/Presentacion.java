package principal;

import java.util.Scanner;
import modelo.Calculadora;


public class Presentacion {

    
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        
                
        System.out.print("Introduce el número 1: ");
        a = sc.nextInt();
        System.out.print("Introduce el número 2: ");
        b = sc.nextInt();
        
        
        Calculadora cal = new Calculadora(a, b);
        
               
        cal.fijarNum1(a);
        cal.fijarNum2(b);
        
   
        System.out.println("Suma: " + cal.sumar());
        System.out.println("Resta: " + cal.restar());
        
    }
}
