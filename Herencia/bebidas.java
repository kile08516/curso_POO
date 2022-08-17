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
public class bebidas extends Producto1 {
   private String Sabor;
   private String Presentacion;

    public bebidas(String Sabor, String Presentacion, String Nombre, String Codigo, double Precio, String Marca, String Tipo) {
        super(Nombre, Codigo, Precio, Marca, Tipo);
        this.Sabor = Sabor;
        this.Presentacion = Presentacion;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    public String getPresentacion() {
        return Presentacion;
    }

    public void setPresentacion(String Presentacion) {
        this.Presentacion = Presentacion;
    }       
 }
    

