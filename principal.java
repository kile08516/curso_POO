/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author TECNOLOGICO
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herez
        bebidas crear_bebidas = new bebidas( "COCA", "LATA", "COCA COLA", "B01", 15, "COCA-COLA", "BEBIDA");{
        
        System.out.println("Nombre Producto:" +crear_bebidas.getNombre());
        System.out.println("Marca Producto:" +crear_bebidas.getMarca());
        System.out.println("Sabor Producto:" +crear_bebidas.getSabor());
    }
   }
}
        
                

