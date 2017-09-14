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
public class EmpregadoProfessorTI extends EmpregadoProfessor {

    private final int numHoras = 200;
    private int numHorasSalaDeAula;
    private int numHorasAdministrativas;

    public EmpregadoProfessorTI(String nome, Cpf cpf, String area, Titulacao titulo, int numHorasSalaDeAula) {
        super(nome, cpf, area, titulo);
        this.numHorasSalaDeAula = numHorasSalaDeAula;
        this.numHorasAdministrativas = calculaHorasAdministrativas();
        salario = super.calculaSalario(numHoras);
    }
    
    private int calculaHorasAdministrativas(){
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
        return super.toString() + " EmpregadoProfessorTI{" + "numHorasSalaDeAula=" + numHorasSalaDeAula + ", numHorasAdministrativas=" + numHorasAdministrativas + '}';
    }
}
