/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

/**
 *
 * @author Jose Barros
 */
public class Comparador {
    private short num1,num2;

    public Comparador() {
    }

    public Comparador(short num1, short num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public short getNum1() {
        return num1;
    }

    public void setNum1(short num1) {
        this.num1 = num1;
    }

    public short getNum2() {
        return num2;
    }

    public void setNum2(short num2) {
        this.num2 = num2;
    }
    
    public void comparar(){
        if(num1>=num2){
            System.out.println("La resta es = "+(num1-num2));
        }
        System.out.println("La suma es = "+(num1+num2));
    }
}
