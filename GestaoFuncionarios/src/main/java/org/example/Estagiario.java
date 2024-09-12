package org.example;

public class Estagiario extends FuncionariosGerais{

    private String instEnsino;
    private double bolsaAux;

    public Estagiario(String pedro, String s, String ifpr, int i) {
        this.nome = pedro;
        this.cpf = s;
        this.instEnsino = ifpr;
        this.bolsaAux = i;
    }

    public double calcularSalario() {
        return bolsaAux = 1500;
    }

    public void exibirInformacoes() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(instEnsino);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getInstituicaoEnsino() {
        return instEnsino;
    }
}