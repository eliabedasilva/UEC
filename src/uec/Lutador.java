/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uec;

/**
 *
 * @author Eliabe
 */
public class Lutador {
    // Declarando os atributos do lutador
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    //Metodos especias
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        //Atribuindo valor aos atributos do lutador
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.setPeso(peso);
    }

    //Configurando os metódos para atribuir e receber os valores dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        //Atribuindo a categoria do lutador com base no peso
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public void apresentar(){
        //Apresentando as informações gerais do lutador
        System.out.println("-------------------------------------------------------------");
        System.out.println("Apresentado o lutador "+ this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " Anos e "+this.getAltura()+" metros");
        System.out.println("Pesando "+ this.getPeso()+"Kg");
        System.out.println("Com "+this.getVitorias()+ " vitória(s)");
        System.out.println(this.getDerrotas()+ " derrota(s)");
        System.out.println(this.getEmpates()+ " empate(s)");
        System.out.println("-------------------------------------------------------------");
    }
    public void status(){
        //Apresentando informações refente a carreira do lutador
        System.out.println("-------------------------------------------------------------");
        System.out.println(this.getNome()+" é um peso "+ this.getCategoria()+" que:");
        System.out.println("Teve "+ this.getVitorias()+ " vítorias");
        System.out.println("Teve "+ this.getDerrotas()+ " derrotas");
        System.out.println("Teve "+ this.getEmpates()+ " empates");
        System.out.println("-------------------------------------------------------------");

    }
    public void ganharLuta(){
        //Incrementando uma vitória ao lutador
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLutar(){
        //Incrementando uma derrota ao lutador
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        //Incrementando uma empate ao lutador
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
