/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_5;

/**
 *
 * @author Jose Barros
 */
public class ComparaNum {
    private int num1,num2,num3;
    
    public ComparaNum(){
    
    }

    public ComparaNum(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public void comparar(){
        if(this.num1>this.num2&&this.num1>this.num3){
            System.out.println("El mayor es "+this.num1);
        }else{
            if(this.num2>this.num1&&this.num2>this.num3){
                System.out.println("El mayor es "+this.num2);
                }
            else{
                if(this.num3>this.num2&&this.num3>this.num1){
                    System.out.println("El mayor es "+this.num3);
                }
            }
            }
    }
}
