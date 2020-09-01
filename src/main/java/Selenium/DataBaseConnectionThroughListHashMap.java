package Selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBaseConnectionThroughListHashMap {

	public static void main(String[] args) {

		List<HashMap<String, String>> lsm = new ArrayList<HashMap<String, String>>();

		Connection con = null;
		Statement stm = null;
		ResultSet rset = null;
		String URL = "jdbc:mysql://localhost:3306/org";

		try {
			con = DriverManager.getConnection(URL, "root", "password");
			stm = con.createStatement();
			rset = stm.executeQuery("select * from bonus");

			ResultSetMetaData rMeta = rset.getMetaData();
			int clmNum = rMeta.getColumnCount();

			while (rset.next()) {
				HashMap<String, String> hm = new HashMap<String, String>();

				for (int i = 1; i <= clmNum; i++) {
					String columnName = rMeta.getColumnName(i);
					hm.put(columnName, rset.getString(columnName));

				}
				lsm.add(hm);
			}

			con.close();
			stm.close();
			rset.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (stm != null)
					stm.close();
				if (rset != null)
					rset.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		System.out.println(lsm);

	}
}