import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TicketBD implements TicketInterface{
	public TicketBD(){
		
	}
	public void grabar(String s){
        //https://jdbc.postgresql.org/download.html
        //https://www.postgresql.org/download/
		String url = "jdbc:postgresql://localhost:5432/";
        String user = "user12";
        String password = "user12";

        try (Connection con = DriverManager.getConnection(url,user,password);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT VERSION()")) {

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
        
            Logger lgr = Logger.getLogger(TicketBD.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
	}
}
	