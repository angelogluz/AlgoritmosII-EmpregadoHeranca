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
public class EmpregadoProfessorHorista extends EmpregadoProfessor {

    private int numHoras;
    

    public EmpregadoProfessorHorista(String nome, Cpf cpf, String area, Titulacao titulo, int numHoras) {
        super(nome, cpf, area, titulo);
        this.numHoras = numHoras;
        salario = calculaSalario(numHoras);
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

   
    
    @Override
    public String toString(){
        return super.toString() + " NUMERO DE HORAS: "+numHoras + " VALOR HORA: "+ valorHora;
    }
}
