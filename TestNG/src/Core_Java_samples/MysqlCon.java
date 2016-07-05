package Core_Java_samples;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://qa-che-vman-02.swdev.local:3306/mysql", "root", "admin");

			// here sonoo is database name, root is username and password

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
			//rs.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}