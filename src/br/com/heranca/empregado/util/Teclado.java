package br.com.heranca.empregado.util;

import javax.swing.JOptionPane;

public class Teclado {
    
    public static String leString(String desc) {
        String entrada = JOptionPane.showInputDialog(desc);
        return entrada;        
    }
    
    public static int leInt(String desc) {
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(desc));
        return entrada;
    }

    public static double leDouble(String desc) {
        double entrada = Double.parseDouble(JOptionPane.showInputDialog(desc));
        return entrada;
    }
    
    public static long leLong(String desc) {
        
        long entrada = Long.parseLong(JOptionPane.showInputDialog(desc));
        return entrada;
    }
}
