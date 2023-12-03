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

public class ClimaTempoDao {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public ClimaTempoDao() {
    }

    public boolean conectar() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
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

    public ClasseClimaTempo consultar(String localizacao) {
        try {
            ClasseClimaTempo clima = new ClasseClimaTempo();
            st = conn.prepareStatement("SELECT * FROM climatempo WHERE localizacao = ? ");
            st.setString(1, localizacao);
            rs = st.executeQuery();

            if (rs.next()) {
                clima.setLocalizacao(rs.getString("localizacao"));
                clima.setNuvens(rs.getString("nuvens"));
                clima.setTemperatura(rs.getString("temperatura"));
                clima.setSensacao(rs.getString("sensacao"));
                clima.setUmidadeAr(rs.getString("umidadeAr"));
                clima.setPressao(rs.getString("pressao"));
                clima.setVento(rs.getString("vento"));

                return clima;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

}
