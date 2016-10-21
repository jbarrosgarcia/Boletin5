/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_5;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        ComparaNum comp1=new ComparaNum();
        System.out.println("Introduzca el primer numero");
        comp1.setNum1(teclado.nextInt());
        System.out.println("Introduzca el segundo numero");
        comp1.setNum2(teclado.nextInt());
        System.out.println("Introduzca el tercer numero");
        comp1.setNum3(teclado.nextInt());
        comp1.comparar();
    }
    
}
