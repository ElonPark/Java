package myChatSvr;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Choise {

	

	

	Moviemenu search(int num) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		conn = DBConnection.makeConnection();

		Moviemenu Moviemenu = null;
		String sql = "SELECT MOVIE, QUEST, HINT1, HINT2, HINT3, CHR\n";
		sql += "FROM MOVIE\n";
		sql += "WHERE NUM = " + num;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Moviemenu = new Moviemenu();
				Moviemenu.setMovie(rs.getString("MOVIE"));
				Moviemenu.setQuest(rs.getString("QUEST"));
				Moviemenu.setHint1(rs.getString("HINT1"));
				Moviemenu.setHint2(rs.getString("HINT2"));
				Moviemenu.setHint3(rs.getString("HINT3"));
				Moviemenu.setChr(rs.getString("CHR"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBClose dbc = new DBClose();
			dbc.close(rs, stmt, conn);
		}

		return Moviemenu;
	}

	

	

}
