package org.example;

public class FuncionarioTempoIntegral extends FuncionariosGerais{

    private double salarioBase;
    private double percentualSalario;

    public FuncionarioTempoIntegral(String joão, String s, int i, int i1) {
        this.nome = joão;
        this.cpf = s;
        this.salarioBase = i;
        this.percentualSalario = i1;
    }

    public double calcularSalario() {
        return (percentualSalario/100) * salarioBase + salarioBase;
    }

    public void exibirInformacoes() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println((percentualSalario/100)*salarioBase+salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}