/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listas;

import java.util.ArrayList;

/**
 *
 * @author TECNOLOGICO
 */
public class Listas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<String> lista_marcas_laps=new ArrayList<String>();
    
    lista_marcas_laps.add("LENOVO");
    lista_marcas_laps.add("HP");
    lista_marcas_laps.add("HUAWEI");
    lista_marcas_laps.add("DELL");
    
    System.out.println("Marcas Laptops"+ lista_marcas_laps);
        System.out.println(lista_marcas_laps.get(2));
    
    System.out.println(lista_marcas_laps.size());
    
        lista_marcas_laps.remove(1);
    System.out.println(lista_marcas_laps);
    
    lista_marcas_laps.set(2,"TOSHIBA");
    System.out.println(lista_marcas_laps);  
    
    for(String i: lista_marcas_laps){
        System.out.println(i);
    }
    }
}
    
    

