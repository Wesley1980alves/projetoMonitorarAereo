package trafego.model;

/**
 *
 * @author wesley
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClasseLoginDao {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public ClasseLoginDao() {

    }

    public boolean conectar() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trafegoaereo", "root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }

    }
    
     public ClasseLogin consultar(String usuario ,String senha) {
        try {
            ClasseLogin logar = new ClasseLogin();
            st = conn.prepareStatement("SELECT * FROM controlador WHERE usuario = ?  and senha =?");
            st.setString(1, usuario);
            st.setString(2,senha);
              
            rs = st.executeQuery();

            if (rs.next()) {
             logar.setUsuario(rs.getString("usuario"));
               logar.setSenha(rs.getString("senha"));
                return logar;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
    
}
