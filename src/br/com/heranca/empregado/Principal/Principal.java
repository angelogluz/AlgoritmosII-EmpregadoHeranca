/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.heranca.empregado.Principal;

import br.com.heranca.empregado.Entity.Empregado;
import br.com.heranca.empregado.Entity.EmpregadoFuncionario;
import br.com.heranca.empregado.Entity.EmpregadoProfessorHorista;
import br.com.heranca.empregado.Entity.EmpregadoProfessorTP;
import br.com.heranca.empregado.Entity.Titulacao;
import br.com.heranca.empregado.util.Cpf;
import br.com.heranca.empregado.util.Teclado;

/**
 *
 * @author Angelo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "angelo";
        
        long cp = Teclado.leLong("Digite o CPF (Apenas Numeros)");
        Cpf cpf = new Cpf(cp);
        String area = "Programação";
        Titulacao titulo = Titulacao.MESTRE;
        int numHoras = 144;

        Empregado emp1 = new EmpregadoProfessorHorista(nome, cpf, area, titulo, numHoras);

        String nome2 = "Manoel";
        String cp2 = Teclado.leString("Digite o CPF (Com os 14 caracteres)");
        Cpf cpf2 = new Cpf(cp2);
        String area2 = "Engenharia de Software";
        Titulacao titulo2 = Titulacao.MESTRE;
        int numHoras2 = 100;

        Empregado emp2 = new EmpregadoProfessorTP(nome2, cpf2, area2, titulo2, numHoras2);

        System.out.println("EMPREGADO: " + emp1);
        System.out.println("EMPREGADO2: " + emp2);

        Empregado emp3 = new EmpregadoFuncionario("Nano", new Cpf(Teclado.leLong("Digite o cpf")), "Recepcionista", 950.00);
        System.out.println("EMPREGADO 3"+ emp3);

    }
}
