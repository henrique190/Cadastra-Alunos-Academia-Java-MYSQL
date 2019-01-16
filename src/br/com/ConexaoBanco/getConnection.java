
package br.com.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class getConnection {
    public static Connection conectarMysql(){
        String url = "localhost";
        String nomeDb = "jiudb";
        String usuario = "root";
        String senha = "";
        
        Connection conexao;
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://"+url+"/"+nomeDb,usuario,senha);
            //System.out.println("Conectado!");
            return conexao;
            
        } catch (SQLException ex) {
            Logger.getLogger(getConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro de conexão");
        }
        
        return null;
    }
}
