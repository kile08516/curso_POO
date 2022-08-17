/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_practica;
import javax.swing.*;

/**
 *
 * @author TECNOLOGICO
 */
public class class_Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Anota tu nombre:");
        String apellido = JOptionPane.showInputDialog("Anota tu apellido:");
        
        JOptionPane.showMessageDialog(null,"tu nombre y apellido es: " +nombre + apellido); 
    }
    
}
