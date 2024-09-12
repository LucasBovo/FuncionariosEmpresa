package org.example;

public class FuncionarioMeioPeriodo extends FuncionariosGerais{

    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioMeioPeriodo(String maria, String s, int i, int i1) {
        this.nome = maria;
        this.cpf = s;
        this.horasTrabalhadas = i;
        this.valorHora = i1;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    public void exibirInformacoes() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println((horasTrabalhadas*valorHora));
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}