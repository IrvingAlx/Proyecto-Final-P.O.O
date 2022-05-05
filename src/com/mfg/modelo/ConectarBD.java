package com.mfg.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarBD {
	static Connection conn;

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost:3306/BasePruebaO2022";

	public ConectarBD() {

		try {

			Class.forName(driver);
			// Gestiona la conexi�n a la BD
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				// JOptionPane.showMessageDialog(null, "Se conecto Primavera
				// 2022","Mens",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("C�digo de Error: " + ((SQLException) e).getErrorCode() + "\n" +
					"SLQState: " + ((SQLException) e).getSQLState() + "\n" +
					"Mensaje: " + e.getMessage() + "\n");
			System.out.println("NO Se conect�");
		}
	}

	
	/** 
	 * @return Connection
	 */
	// Desde otra clase probamos la conexion
	public Connection getConnection() {
		return conn;
	}

	public void DesConnection() {
		if (conn == null) {
			System.out.println("Termin� la conexi�n");

		}
	}
}
