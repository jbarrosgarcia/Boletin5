/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        Almacen almac=new Almacen();
        System.out.println("Introduzca en nombre del producto");
        almac.setProducto(teclado.nextLine());
        System.out.println("Introduzca las ventas anuales");
        almac.setVentasAnuales(teclado.nextInt());
        almac.tipoArt();
        
    }
    
}
