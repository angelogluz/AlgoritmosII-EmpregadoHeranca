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
public class EmpregadoProfessorTP extends EmpregadoProfessor {

    private final int numHoras = 140;
    private int numHorasSalaDeAula;
    private int numHorasAdministrativas;

    public EmpregadoProfessorTP(String nome, Cpf cpf, String area, Titulacao titulo, int numHorasSalaDeAula) {
        super(nome, cpf, area, titulo);
        this.numHorasSalaDeAula = numHorasSalaDeAula;
        this.numHorasAdministrativas = calculaHorasAdministrativas();
        salario = calculaSalario(numHoras);
    }

    private int calculaHorasAdministrativas() {
        return numHoras - numHorasSalaDeAula;
    }

    public void setNumHorasSalaDeAula(int numHorasSalaDeAula) {
        this.numHorasSalaDeAula = numHorasSalaDeAula;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public int getNumHorasSalaDeAula() {
        return numHorasSalaDeAula;
    }

    public int getNumHorasAdministrativas() {
        return numHorasAdministrativas;
    }

    @Override
    public String toString() {
        return super.toString() + " EmpregadoProfessorTP{" + "numHorasSalaDeAula=" + numHorasSalaDeAula + ", numHorasAdministrativas=" + numHorasAdministrativas + '}';
    }
}
