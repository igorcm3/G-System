/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesPersistencia;

import DAO.EmpresaDAO;
import Models.Empresa;
import java.sql.SQLException;

/**
 *
 * @author coron
 */
public class testeInserir { 
    
    
    public static void main(String[] args) throws SQLException {
        EmpresaDAO dao = new EmpresaDAO();
        Empresa emp = new Empresa();
        emp.setCpfcnpj("000.000/001-1");
        emp.setFantasia("Academia Body Master");
        emp.setRazaoSocial("Vagner Zanchett");
        dao.persist(emp);
    }
    
}
