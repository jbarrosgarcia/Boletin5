/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

/**
 *
 * @author Jose Barros
 */
public class Almacen {
    private String producto;
    private int ventasAnuales;
    public Almacen(){
    
    }
    
    public Almacen(String producto, int ventasAnuales) {
        this.producto = producto;
        this.ventasAnuales = ventasAnuales;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getVentasAnuales() {
        return ventasAnuales;
    }

    public void setVentasAnuales(int ventasAnuales) {
        this.ventasAnuales = ventasAnuales;
    }
    public void tipoArt(){
        if(this.ventasAnuales<=100){
            System.out.println(this.producto+" es un producto de baixo consumo");
        }else{
            if(this.ventasAnuales>100&&this.ventasAnuales<=500){
                System.out.println(this.producto+" es un producto de consumo medio");
            }else{
                if(this.ventasAnuales>500&&this.ventasAnuales<=1000){
                    System.out.println(this.producto+" es un producto de consumo alto");
            }   else{
                    if(this.ventasAnuales>1000){
                        System.out.println(this.producto+" es un producto de primera necesidad");
                        }
                    }
                 }
        }
    }
}
