package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    
    static boolean correcte = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        
        do{
            try{
            System.out.println("Introdueix un nombre: ");
            numero1 = in.nextInt();
            correcte = true;
        }
        catch(InputMismatchException e){
            System.out.println("Ha de ser un nombre.");
        }
        in.nextLine();
        }while(!correcte);
        
        correcte = false;
        
        do{
            do{
            try{
            System.out.println("Introdueix un altre nombre: ");
            numero2 = in.nextInt();
            correcte = true;
        }
        catch(InputMismatchException e){
            System.out.println("Ha de ser un nombre.");
        }
        in.nextLine();
        }while(!correcte);
            
            if(numero2 == 0){
                System.out.println("Si el numero2 és 0 la divisio no es podra fer. ");
            }
        }while(numero2 == 0);
        
        System.out.println("Ara sumarem els dos nombres.");
        suma(numero1,numero2);
        
        System.out.println("Ara restarem els dos nombres.");
        resta(numero1,numero2);
        
        System.out.println("Ara multiplicarem els dos nombres.");
        multiplicacio(numero1,numero2);
        
        System.out.println("Ara dividirem els dos nombres.");
        divisio(numero1,numero2);
    }
    
    private static void suma(int x, int y){
           int suma = 0;
           
           suma = x+y;
           
           System.out.println("La suma dels dos nombres dona: "+x+" + "+y+" = "+suma+". ");
    }
    
    private static void resta(int x, int y){
           int resta = 0;
           
           resta = x-y;
           
           System.out.println("La resta dels dos nombres dona: "+x+" - "+y+" = "+resta+". ");
    }
    
    private static void multiplicacio(int x, int y){
           int multiplicacio = 0;
           
           multiplicacio = x*y;
           
           System.out.println("La multiplicacio dels dos nombres dona: "+x+" * "+y+" = "+multiplicacio+". ");
    }
    
    private static void divisio(int x, int y){
           int divisio = 0;
           
           divisio = x/y;
           
           System.out.println("La divisio dels dos nombres dona: "+x+" / "+y+" = "+divisio+". ");
    }
}
