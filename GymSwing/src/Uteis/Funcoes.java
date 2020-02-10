/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uteis;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author coron
 */
public class Funcoes {
    private static Object[] optionOk = {"Ok"};    
    private static Object[] optionSimNao = {"Sim", "Não"}; 

    public Funcoes() {
    }

    public static void permitirSomenteNumeros(java.awt.event.KeyEvent evt) {
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }

    public static String validaIncrementaCodigo(String i) {
        i = i.replace("0", "");
        i = i.trim();
        int codInt = Integer.parseInt(i);
        codInt++;
        if (i.length() == 1) {
            i = "000" + Integer.toString(codInt);
        }
        if (i.length() == 2) {
            i = "00" + Integer.toString(codInt);
        }
        if (i.length() == 3) {
            i = "0" + Integer.toString(codInt);
        } // vazio será o primeiro a aser inserido
        if (i.isEmpty()) {
            i = "0000";
        }
        return i;
    }

    public static void MsgWarningSimples(String msg, String titulo ) {
        // usar constantes para implementar msgs
        JOptionPane.showMessageDialog(null, msg, titulo, 1);
    }
    
    public static int MsgConfirmaçãoOk(String msg, String titulo ) {
        // usar constantes para implementar msgs
        return JOptionPane.showOptionDialog(null, msg, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, optionOk ,optionOk[0]);
    }    
    
    public static void setLookAndFellSistema() {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    } 

}
