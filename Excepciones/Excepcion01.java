/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

/**
 *
 * @author dolor
 */
public class Excepcion01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         {
        int a = 0;
        int b = 0;
        try {
            System.out.println(a / b); // throw Exception
        }
        catch (Exception e) {
            // Exception handler
            System.out.println("Error" + e.getMessage());
        }
    }
}
    }
    

