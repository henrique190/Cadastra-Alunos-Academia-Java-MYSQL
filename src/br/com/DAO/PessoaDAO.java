
package br.com.DAO;

import br.com.ConexaoBanco.getConnection;
import br.com.principal.Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henrique
 */
public class PessoaDAO {
    Pessoa p = new Pessoa();
    getConnection c = new getConnection();
    
    public void consultarPessoa(){
        
        
        Statement stmt;
        try {
            stmt = c.conectarMysql().createStatement();
            String sql = "SELECT * FROM pessoa";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                 p.setNome(rs.getString("nome"));
                 p.setTelefone(rs.getString("telefone"));
                 
                 System.out.println(p.getNome());
                 System.out.println(p.getTelefone());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
}
