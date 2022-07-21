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
public class Trabajos_cursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int array[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
            System.out.println("introduce un numero:");
            array[i]=sc.nextInt();
        }
        System.out.println("los numeros en orden inverso son:");
        int j=4;
        while(j>=0)
        {
            System.out.println("["+array[j]+"]n");
            j--;
        }
    }
    
}
