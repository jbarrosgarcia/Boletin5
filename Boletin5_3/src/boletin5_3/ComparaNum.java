/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

/**
 *
 * @author Jose Barros
 */
public class ComparaNum {
    private int num;

    public ComparaNum() {
    }

    public ComparaNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void comparaNum(){
        if(this.num>0){
            System.out.println("+");
        }else{
            if(this.num<0){
                System.out.println("-");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
