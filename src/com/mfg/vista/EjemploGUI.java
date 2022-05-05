package com.mfg.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EjemploGUI extends JFrame {

	public static JButton buttonUpload;

	private static final long serialVersionUID = 1L;

	public EjemploGUI() {
		super("Riesgo Cardiovascular");
		setSize(1080, 720);
		setLocation(400, 180);
		// setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Layout por default es FlowLayout
		// setLayout(null);
		Image icon = Toolkit.getDefaultToolkit().getImage(
				"G:\\Mi unidad\\Ibero\\4.- Cuarto Semestre\\Pogramacion Orientada a Objetos\\Proyecto 3\\health.png");
		setIconImage(icon);
		setResizable(false);

		buttonUpload = new JButton("Guardar");
		buttonUpload.setBounds(680, 610, 150, 40);
		buttonUpload.setFont(new Font("Abel_Regular", Font.BOLD, 20));
		buttonUpload.setBackground(new Color(240, 115, 130));

		this.add(buttonUpload);

		PanelUnoEx panl = new PanelUnoEx();
		this.add(panl);

	}

}