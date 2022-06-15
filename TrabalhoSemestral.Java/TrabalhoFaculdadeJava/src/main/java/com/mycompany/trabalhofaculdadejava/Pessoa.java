package com.mycompany.trabalhofaculdadejava;

public class Pessoa {
    private String Nome;
    private int AnoNascimento;
    private int Idade;
    private double Altura;
    private double Peso;
    private double SalarioBase;

    
    public String getNome() {
        return Nome;
    }

   
    public void setNome(String Tecnico) {
        this.Nome = Tecnico;
    }

    
    public int getAnoNascimento() {
        return AnoNascimento;
    }

    
    public void setAnoNascimento(double AnoNascimento) {
        this.AnoNascimento = 2000;
    }

    
    public int getIdade() {
        return Idade;
    }

    
    public void setIdade(double Idade) {
        this.Idade = 22;
    }

    
    public double getAltura() {
        return Altura;
    }

    
    public void setAltura(double Altura) {
        this.Altura = 1.80f;
    }

   
    public double getPeso() {
        return Peso;
    }

    
    public void setPeso(double Peso) {
        this.Peso = 80;
    }

    
    public double getSalarioBase() {
        return SalarioBase;
    }

    
    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = 2500;
    }
    
    public void status (){
    System.out.println("Sobre o Tecnico");
    System.out.println("Nome:" + this.Nome);
    System.out.println("Salario:" + this.SalarioBase + "reais");
    System.out.println("Idade:" + this.Idade + "anos");
    System.out.println("Altura:" + this.Altura + "cm");
    System.out.println("Peso:" + this.Peso + "kg");
    System.out.println("AnoDeNascimento:" + this.AnoNascimento);
    
    }


}
