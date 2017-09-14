package br.com.heranca.empregado.Entity;

/**
 *
 * @author Angelo
 */
public enum Titulacao {
    GRADUADO("Grad"),
    POSGRADUADO("PG"),
    MESTRE("Me"),
    DOUTOR("Dr"); 

    private final String abrev;

    private Titulacao(String abrev) {
        this.abrev = abrev;   
    }

    public String getAbreviatura() {
        return abrev;
    }   
}
