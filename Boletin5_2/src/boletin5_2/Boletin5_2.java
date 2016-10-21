/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Comparador compara1=new Comparador();
        System.out.println("Introduzca el primer numero a comparar");
        compara1.setNum1(teclado.nextShort());
        System.out.println("Introduzca el segundo numero a comparar");
        compara1.setNum2(teclado.nextShort());
        compara1.comparar();
    }
    
}
