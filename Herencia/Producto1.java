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
public class Producto1 {
    //astraccion.Atributos
       private String Nombre;
       private String Codigo;
       private double Precio;
       private String Marca;
       private String Tipo;

    public Producto1(String Nombre, String Codigo, double Precio, String Marca, String Tipo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Marca = Marca;
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
       
    
}
