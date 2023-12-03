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

public class ClasseComandanteDao {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public ClasseComandanteDao() {

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
    // METODO QUE IRA BUSCAR DADOS 

    public ClasseComandante consultar(String nome) {
        try {
            ClasseComandante comandante = new ClasseComandante();
            st = conn.prepareStatement("SELECT * FROM comandante WHERE nome = ? ");
            st.setString(1, nome);
            rs = st.executeQuery();

            if (rs.next()) {
                comandante.setNome(rs.getString("nome"));
                comandante.setCo_piloto(rs.getString("co_piloto"));
                comandante.setControladorAeronave(rs.getString("controladorAeronave"));
                comandante.setCod_dac(rs.getString("cod_dac"));
                comandante.setIdentificacaolicenca(rs.getString("identificacaoLicenca"));
                comandante.setHoras_voo(rs.getString("horas_voo"));

                return comandante;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

}
