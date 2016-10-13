package br.com.heranca.empregado.util;

public class Cpf {
    private String cpf;

    public Cpf(String cpf) {
        this.cpf = validaCpf(cpf);
    }
    
    public Cpf(Long cpf) {
        this.cpf = validaCpf(cpf);
    }
    
    private String validaCpf(String cpf) {
        return (cpf.length()==14 ? cpf : "000.000.000-00");
    }

    private String validaCpf(long cpf) {
        String cpfString = String.valueOf(cpf);
        System.out.println("CPF1 "+ cpfString);
        cpfString = (cpfString.length() == 10 ? "0"+cpfString : cpfString);
        System.out.println("CPF: "+cpfString);
        if (cpfString.length()==11) {
            return cpfString.substring(0,3)+"."+cpfString.substring(3,6)+"."+cpfString.substring(6,9)+"-"+cpfString.substring(9,11);
        } else
            return "000.000.000-00";
    }
    
    @Override
    public String toString(){
        return cpf;
    }
}
