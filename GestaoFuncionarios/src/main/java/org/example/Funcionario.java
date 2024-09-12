package org.example;

public class Funcionario extends FuncionariosGerais{

    private double salarioBase;

    public Funcionario(String Ana, String s, int i) {
        this.nome = Ana;
        this.cpf = s;
        this.salarioBase = i;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void setNome(String anaSilva) {
        this.nome = anaSilva;
    }

    public void setCpf(String s) {
        this.cpf = s;
    }

    public void setSalarioBase(int i) {
        this.salarioBase = i;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}