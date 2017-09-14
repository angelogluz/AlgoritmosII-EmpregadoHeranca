package br.com.heranca.empregado.Entity;

import br.com.heranca.empregado.util.Cpf;

/**
 *
 * @author Angelo
 */
public class EmpregadoFuncionario extends Empregado{
    private final String funcao;
    
    public EmpregadoFuncionario(String nome, Cpf cpf, String funcao, double salario){
        super(nome, cpf);
        this.funcao = funcao;
        super.salario = salario;   
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return super.toString() + " EmpregadoFuncionario{" + "funcao=" + funcao + '}';
    }  
}
