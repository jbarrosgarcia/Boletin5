/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        Persona per1=new Persona();
        Persona per2=new Persona();
        System.out.println("Introduca el nombre de la primera persona");
        per1.setNome(teclado.nextLine());
        System.out.println("Introduzca el peso de la primera persona");
        per1.setPeso(teclado.nextFloat());
        System.out.println("Introduca el nombre de la segunda persona");
        per2.setNome(teclado.nextLine());
        System.out.println("Introduzca el peso de la segunda persona");
        per2.setPeso(teclado.nextFloat());
        ComparadorPeso comparador=new ComparadorPeso(per1,per2);
        comparador.compararPes();
    }
    
}
