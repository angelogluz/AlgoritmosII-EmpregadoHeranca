/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.heranca.empregado.Entity;

import br.com.heranca.empregado.util.Cpf;

/**
 *
 * @author Angelo
 */
public class Empregado {
    private String nome;
    private Cpf cpf;
    protected double salario;

    
    
    
    
    public Empregado(String nome, Cpf cpf){
        this.nome = nome;
        this.cpf = cpf;
       
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cpf getCpf() {
        return cpf;
    }


    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
}
