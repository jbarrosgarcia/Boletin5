/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

/**
 *
 * @author Jose Barros
 */
public class ComparadorPeso {
    private Persona per1,per2;

    public ComparadorPeso(Persona per1, Persona per2) {
        this.per1 = per1;
        this.per2 = per2;
    }

    public ComparadorPeso() {
    }
    
    public void compararPes(){
        if(per1.getPeso()>per2.getPeso()){
            System.out.println(per1.getNome()+" pesa "+per1.getPeso()+" y la diferencia de peso es "+(per1.getPeso()-per2.getPeso()));
        }else{
            if(per2.getPeso()>per1.getPeso()){
                System.out.println(per2.getNome()+" pesa "+per2.getPeso()+" y la diferencia de peso es "+(per2.getPeso()-per1.getPeso()));
            }
            else{
                System.out.println("Pesan lo mismo");
            }
        }
    }
}
