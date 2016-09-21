
package modelo;

public class Calculadora {
    
    //Creamos las variables tipo entero
    
    int num1, num2;
 
    //Constructor que sirve para inicializar los atributos num1 y num2
    public Calculadora(int a, int b){
        num1 = a;
        num2 = b;
    }
        
    public void fijarNum1(int n){
        num1=n;
    }
    public void fijarNum2(int n){
        num2=n;
    }
    
    public int sumar(){
        int sum = num1 + num2;  
        return sum;
    }
    
    public int restar(){
        return num1 - num2;
    }
}
