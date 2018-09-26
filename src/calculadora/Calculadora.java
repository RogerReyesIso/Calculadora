package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Introdueix un nombre: ");
        num1 = in.nextInt();
        
        System.out.println("Introdueix un altre nombre: ");
        num2 = in.nextInt();
        
        System.out.println("Ara sumarem els dos nombres.");
        suma(num1,num2);
    }
    
    private static void suma(int x, int y){
           int suma = 0;
           
           suma = x+y;
           
           System.out.println("La suma dels dos nombres dona: "+x+" + "+y+" = "+suma+". ");
    }    
}
