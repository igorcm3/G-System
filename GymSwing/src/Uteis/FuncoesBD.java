/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uteis;

import DAO.GenericDao;
import DAO.ReceberDAO;
import Models.Aluno;
import Models.Receber;
import java.util.Date;

/**
 *
 * @author Igor Corona
 */
public class FuncoesBD {

    public static void gerarReceberAluno(Aluno aluno, boolean pago, Date date) {
        //Receber receber = new Receber(aluno, pago, date);
        ReceberDAO receberDAO = new ReceberDAO();

    }

    public FuncoesBD() {
    }

    public static Receber gerarMensalidadeAluno(Aluno aluno, boolean pago, Date data) {
        try {
            Receber receber = new Receber();
            receber.setIdAluno(aluno);
            receber.setDataPagamento(data);
            receber.setPago(pago);
            GenericDao gDao = new GenericDao();
            gDao.<Receber>persist(receber);
            return receber;
        } catch (Exception e) {
            Funcoes.MsgWarningSimples(e.getMessage(), "Error");
            return null;
        }

    }

    public static boolean atualizarMensalidades() {
        return false;
    }
}
