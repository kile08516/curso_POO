/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajos_cursos;

import java.util.Scanner;


/**
 *
 * @author dolor
 */
public class trabajo2{

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada=new Scanner(System.in);
    int contador;
    
    System.out.print("ingrsa un numero:");
    contador = entrada.nextInt();
    
    for (int i=1; i<=contador; i++){
        System.out.println(i);
    }
    
   }
}
