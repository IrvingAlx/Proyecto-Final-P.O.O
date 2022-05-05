package com.mfg.modelo;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ManipularBaseDatos {
	static ConectarBD conectarBaseD;

	public ManipularBaseDatos() {
		conectarBaseD = new ConectarBD();
	}

	
	/** 
	 * @param edad
	 * @param presionSistolica
	 * @param Hipertension
	 * @param HDL
	 * @param Fumador
	 * @param Diabetes
	 * @param Colesterol
	 * @param sexo
	 */
	public void Insertar(int edad, int presionSistolica, boolean Hipertension, int HDL, boolean Fumador,
			boolean Diabetes, int Colesterol, boolean sexo) {
		try {
			String query = "Insert into heartdb (Edad, presionSistolica, Hipertension, Fumador,sexo,colesterol, HDL, Diabetes) values (?,?,?,?,?,?,?,?)";
			Connection con = (Connection) conectarBaseD.getConnection();
			PreparedStatement prest = (PreparedStatement) con.prepareStatement(query);
			prest.setInt(1, edad);
			prest.setInt(2, presionSistolica);
			prest.setBoolean(3, Hipertension);
			prest.setBoolean(4, Fumador);
			prest.setBoolean(5, sexo);
			prest.setInt(6, Colesterol);
			prest.setInt(7, HDL);
			prest.setBoolean(8, Diabetes);
			prest.executeUpdate();
			System.out.println("Si se inserto el registro");
			JOptionPane.showMessageDialog(null,
					"Se agrego con �xito a la abse de datos" + JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			System.out.println("No se inserto el registro");
			System.out.println(e.getErrorCode());
		}
	}
}
