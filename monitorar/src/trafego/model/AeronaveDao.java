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

public class AeronaveDao {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public AeronaveDao() {

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

    public ClasseAeronave consultar(String identificacao_aeronave) {
        try {
            ClasseAeronave aeronave = new ClasseAeronave();
            st = conn.prepareStatement("SELECT * FROM aeronave WHERE identificacao_aeronave = ? ");
            st.setString(1, identificacao_aeronave);
            rs = st.executeQuery();

            if (rs.next()) {
                aeronave.setIdentificacao_aeronave(rs.getString("identificacao_aeronave"));
                aeronave.setCategoria_aeronave(rs.getString("categoria_aeronave"));
                aeronave.setModelo(rs.getString("modelo"));
                aeronave.setVelocidade(rs.getDouble("velocidade"));
                aeronave.setAltitude(rs.getDouble("altitude"));
                aeronave.setNivel_combustivel(rs.getDouble("nivel_combustivel"));
                aeronave.setRota_saida(rs.getString("rota_Saida"));
                aeronave.setRota_chegada(rs.getString("rota_Chegada"));
                return aeronave;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
   

}
