package com.mfg.proyectoFinal;

import com.mfg.controlador.*;
import com.mfg.modelo.*;
import com.mfg.vista.*;

public class Principal {

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {

		ManipularBaseDatos prueba = new ManipularBaseDatos();
		EjemploGUI vistaP = new EjemploGUI();
		@SuppressWarnings("unused")
		ControladorP controlador = new ControladorP(vistaP, prueba);
		vistaP.setVisible(true);

	}
}