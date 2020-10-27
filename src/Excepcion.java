/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Semipresencial 1º
 */
public class Excepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dividendo = 4 ;
        int divisor = 0 ;
        
        try{        
            System.out.println("El resultado de la división es: " + (dividendo/divisor));
        }
        catch (ArithmeticException e){
            
            System.out.println("ERROR: " + e.getMessage());
        }
        finally{
            System.out.println("Este bloque siempre se ejecuta.");
        }
    }
    
}
