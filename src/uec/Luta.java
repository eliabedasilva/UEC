/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uec;

import java.util.Random;

/**
 *
 * @author Eliabe
 */
public class Luta {
    //atribuindo os atributos da classe
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;
    
    //Configurando os metódos para atribuir e receber os valores dos atributos
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public void marcaLuta(Lutador lutador1, Lutador lutador2){
        //verificando se os lutadores são da mesma categoria e se eles não são o mesmo para decidir se a luta pode ou não acontecer
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        }else{
            this.aprovada = false;
        }
            
        }
    public void lutar(){
        // se a luta poder ser realizada, o programa vai gerar um numero aleatorio para decidir o resultado da luta
        // depois ele atualiza os atributos dos lutadores
        if (this.isAprovada()) {
            //caso a luta seja aprovada
            System.out.println("=== Desafiante ===");
            this.desafiante.apresentar();
            System.out.println("=== Desafiado  ===");
            this.desafiado.apresentar();
            
            Random aleatorio = new Random();
            System.out.println("Lutando.........");
            int resultado = aleatorio.nextInt(3);
            switch(resultado){
                case 0: // empate
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                
                case 1: // vitória do desafiado
                    System.out.println(this.desafiado.getNome()+" Venceu!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLutar();
                    break;
                case 2: // vitória do desafiante
                    System.out.println(this.desafiado.getNome()+" Venceu!!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLutar();
           
            }
            
        } else{
            //caso a luta não seja aprovada
            System.out.println("A luta não pode acontecer!");
        }
      
    }

}
