/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

/**
 *
 * @author Jose Barros
 */
public class Numeros {
    private int numero;

    public Numeros() {
    }

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void comparar(){
        if (this.numero>0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("Es negativo");
        }
    }
    
}
