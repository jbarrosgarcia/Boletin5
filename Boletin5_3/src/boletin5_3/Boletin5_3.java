/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        ComparaNum compara1=new ComparaNum();
        System.out.println("Introduzca el numero a comparar");
        compara1.setNum(teclado.nextInt());
        compara1.comparaNum();
        // TODO code application logic here
    }
    
}
