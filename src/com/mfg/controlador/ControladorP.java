package com.mfg.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import com.mfg.modelo.ManipularBaseDatos;
import com.mfg.vista.EjemploGUI;
import com.mfg.vista.PanelUnoEx;

public class ControladorP implements ActionListener {

	// Instancia del frame principal
	EjemploGUI vista;
	ManipularBaseDatos manipulaBase; // Instancia de clase 

	public ControladorP(EjemploGUI vista, ManipularBaseDatos manupulaB) {

		this.vista = vista;
		this.manipulaBase = manupulaB;

		// Al boton que genera acci�n se debe asignar un addActionListener
		EjemploGUI.buttonUpload.addActionListener(this);

	}

	
	/** 
	 * @param e
	 */
	// Metodo que implementa ActionListener
	public void actionPerformed(ActionEvent e) {

		String sexoTxt = "";
		String hiperTxt = "";
		String fumTxt = "";
		String diabTxt = "";
		int edad = 0, pss = 0, hdl = 0, chol = 0, errorT = 0;
		boolean hiper, fum, diab, sexo;

		if (e.getSource() == EjemploGUI.buttonUpload) {

			if (PanelUnoEx.radioButtonSexoM.isSelected()) {
				sexoTxt = "True";
			} else if (PanelUnoEx.radioButtonSexoF.isSelected()) {
				sexoTxt = "False";
			}
			if (sexoTxt.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Error, eija una opicion para sexo" + JOptionPane.ERROR_MESSAGE);
				errorT++;
			}
			if (PanelUnoEx.radioButtonHiper1.isSelected()) {
				hiperTxt = "True";
			} else if (PanelUnoEx.radioButtonHiper2.isSelected()) {
				hiperTxt = "False";
			}
			if (hiperTxt.isEmpty()) {
				JOptionPane.showMessageDialog(null,
						"Error, eija una opicion para hipertensi�n" + JOptionPane.ERROR_MESSAGE);
				errorT++;
			}
			if (PanelUnoEx.radioButtonFum1.isSelected()) {
				fumTxt = "True";
			} else if (PanelUnoEx.radioButtonFum2.isSelected()) {
				fumTxt = "False";
			}
			if (fumTxt.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Error, eija una opicion para fumador" + JOptionPane.ERROR_MESSAGE);
				errorT++;
			}
			if (PanelUnoEx.radioButtonDiab1.isSelected()) {
				diabTxt = "True";
			} else if (PanelUnoEx.radioButtonDiab2.isSelected()) {
				diabTxt = "False";
			}
			if (diabTxt.isEmpty()) {
				JOptionPane.showMessageDialog(null,
						"Error, eija una opicion para daibetes" + JOptionPane.ERROR_MESSAGE);
				errorT++;
			}

			hiper = Boolean.parseBoolean(hiperTxt);
			fum = Boolean.parseBoolean(fumTxt);
			diab = Boolean.parseBoolean(diabTxt);
			sexo = Boolean.parseBoolean(sexoTxt);

			try {

				edad = Integer.parseInt(PanelUnoEx.areaTextoEdad.getText());

			} catch (Exception xe) {
				JOptionPane.showMessageDialog(null, "Error en valor Edad : "
						+ PanelUnoEx.areaTextoEdad.getText().toString() + JOptionPane.ERROR_MESSAGE);
			}

			try {

				pss = Integer.parseInt(PanelUnoEx.areaTextoPSS.getText());

			} catch (Exception xe) {
				JOptionPane.showMessageDialog(null, "Error en valor Presion: "
						+ PanelUnoEx.areaTextoPSS.getText().toString() + JOptionPane.ERROR_MESSAGE);
			}

			try {

				hdl = Integer.parseInt(PanelUnoEx.areaTextoHDL.getText());

			} catch (Exception xe) {
				JOptionPane.showMessageDialog(null, "Error en valor HDL: "
						+ PanelUnoEx.areaTextoHDL.getText().toString() + JOptionPane.ERROR_MESSAGE);
			}
			try {

				chol = Integer.parseInt(PanelUnoEx.areaTextoChol.getText());

			} catch (Exception xe) {
				JOptionPane.showMessageDialog(null, "Error en valor Colesterol: "
						+ PanelUnoEx.areaTextoChol.getText().toString() + JOptionPane.ERROR_MESSAGE);
			}

			if (errorT == 0) {
				manipulaBase.Insertar(edad, pss, hiper, hdl, fum, diab, chol, sexo);
			} else {
				JOptionPane.showMessageDialog(null, "No se cargo la informacion: " + JOptionPane.ERROR_MESSAGE);
			}

		}

	}

}