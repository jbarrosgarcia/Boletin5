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
public class Persona {
    private String nome;
    private float peso;
    
    public Persona(){
        this.nome="";
        this.peso=0f;
    }
    
    public Persona(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
