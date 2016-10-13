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
public class EmpregadoProfessor extends Empregado {

    private String area;
    protected Titulacao titulo;
    protected final double valorHora = 30.50;

    public EmpregadoProfessor(String nome, Cpf cpf, String area, Titulacao titulo) {
        super(nome, cpf);
        this.area = area;
        this.titulo = titulo;

    }

    protected double calculaSalario(int numHoras) {
        return numHoras * (titulo == Titulacao.GRADUADO ? (valorHora) : (titulo == Titulacao.POSGRADUADO ? (valorHora + (valorHora * 0.1)) : (titulo == Titulacao.MESTRE ? (valorHora + (valorHora * 0.3)) : (valorHora + (valorHora * 0.4)))));
    }

    public void setTitulo(Titulacao titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public Titulacao getTitulo() {
        return titulo;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public String toString() {
        return super.toString() + " EmpregadoProfessor{" + "area=" + area + ", titulo=" + titulo + '}';
    }
}
