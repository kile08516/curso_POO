/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author TECNOLOGICO
 */
public class Lactios extends Producto1{

        private String Fecha_caducidad;
        private double Descuento;

    public Lactios(String Fecha_caducidad, double Descuento, String Nombre, String Codigo, double Precio, String Marca, String Tipo) {
        super(Nombre, Codigo, Precio, Marca, Tipo);
        this.Fecha_caducidad = Fecha_caducidad;
        this.Descuento = Descuento;
    }
    public String getFecha_caducidad() {
        return Fecha_caducidad;
    }

    public void setFecha_caducidad(String Fecha_caducidad) {
        this.Fecha_caducidad = Fecha_caducidad;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }
    
    public double calcular_precio(double precio, double descuento){
        precio=getPrecio();
        descuento=getDescuento();
        return precio-descuento;  
        
    ArrayList<String> lista_Lactios_bebidas=new ArrayList<>();
    lista_Lactios_bebidas.add("LALA");
    lista_Lactios_bebidas.add("YOGURT");
    lista_Lactios_bebidas.add("DANONINO");
    
    System.out.println("Marcas Laptops"+ lista_Lactios_bebidas);
    
    System.out.println(lista_Lactios_bebidas.get(2));
    
    System.out.println(lista_Lactios_bebidas.size());
    
        lista_Lactios_bebidas.remove(1);
    System.out.println(lista_Lactios_bebidas);
    
    lista_Lactios_bebidas.set(2,"Lactios");
    System.out.println(lista_Lactios_bebidas);  
    
    for(String i: lista_Lactios_bebidas){
        System.out.println(i);
    }

    

