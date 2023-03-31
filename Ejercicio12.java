/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

 import java.util.Scanner;
/**
 *
 * @author chuPac
 */
public class Ejercicio12 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 1er numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese 2do numero");
        int num2 = leer.nextInt();
        
        
        if (num1%num2 == 0){
            System.out.println("El primer numero es multiplo del segundo");
        }
        else {
            System.out.println("El primer numero no es multiplo");
        }
        
    }
    
}
