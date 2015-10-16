package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionInformix {
	private PreparedStatement pstm;
	private ResultSet rs;
	private Connection con = null;
	public ResultSet getSet(String sql){
		String driver = "com.informix.jdbc.IfxDriver";
		String URL = "jdbc:informix-sqli://192.168.0.252:9088/bd_prisma:INFORMIXSERVER=ol_netuno";
		
		String USER = "informix";
		String PASS = "informix";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(URL,USER,PASS);
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	public void fecharConexao(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
