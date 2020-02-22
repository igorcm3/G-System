
import DAO.AlunoDAO;
import DAO.GenericDao;
import Models.Aluno;
import Models.Receber;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Igor Corona
 */
public class TesteReceber {

    
    public TesteReceber() {
    }

    public static void main(String args[]) {
        Receber receber = new Receber();
        AlunoDAO adao = new AlunoDAO();
        Aluno aluno = adao.getAlunoPorId(1);
        
        receber.setIdAluno(aluno);
        receber.setDataPagamento(new Date());
        receber.setPago(true);
        
        
        
        
        GenericDao gDao = new GenericDao();
        gDao.<Receber>persist(receber);    
    }
}
