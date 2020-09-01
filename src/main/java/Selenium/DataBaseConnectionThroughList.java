package Selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnectionThroughList {

	public static void main(String[] args) {

		Connection con;
		Statement stm;
		ResultSet rset;
		//int update; -------- To update an field in a table ---------

		String URL = "jdbc:mysql://localhost:3306/org";
		String query = "select * from bonus order by BONUS_AMOUNT";
		String changeNameQuery = "alter table bonus rename column BONUS_AMOUNT to BONUS_AMT";
		
		List<Object> list = new ArrayList<Object>();

		try {
			con = DriverManager.getConnection(URL, "root", "password");
			stm = con.createStatement();
			//update = stm.executeUpdate(changeNameQuery); -------- To update an field in a table---------
			rset = stm.executeQuery(query);

			while (rset.next()) {
				list.add(rset.getInt("BONUS_AMOUNT"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(list);

	}

}
