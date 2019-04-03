package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseforMail {
	
	 private String result;

     private String createQuery(String query, int id) throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmail?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "QueenPainIsSOCloseToPleasure1986");
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            if (rs.next()) {
                result = rs.getString(id);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

     public String getURL() throws SQLException {
        return createQuery("SELECT URL FROM mailru", 1);
    }

     public String getLogin() throws SQLException {
        return createQuery("SELECT login FROM mailru",1);
    }

     public String getPassword() throws SQLException {
        return createQuery("SELECT password FROM mailru", 1);
    }

     public String getRecipient() throws SQLException {
        return createQuery("SELECT recipient FROM mailru", 1);
    }

     public String getMessSubject() throws SQLException {
        return createQuery("SELECT MessSubject FROM mailru", 1);
    }
}
