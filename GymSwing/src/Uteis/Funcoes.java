/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uteis;

/**
 *
 * @author coron
 */
public class Funcoes {

    public Funcoes() {
    }

    public static void permitirSomenteNumeros(java.awt.event.KeyEvent evt) {
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }
    
    public String validaIncrementaCodigo(String i){
        i = i.replace("0", "");
        i = i.trim();
        int codInt = Integer.parseInt(i);
        codInt++;
        if(i.length() == 1){
            i = "000"+ Integer.toString(codInt);
        }
        if(i.length() == 2){
            i = "00"+ Integer.toString(codInt);
        }
        if(i.length() == 3){
            i = "0"+ Integer.toString(codInt);   
        } // vazio será o primeiro a aser inserido
        if (i.isEmpty()) {
         i = "0000";   
        }
        return i;
    }    

}
