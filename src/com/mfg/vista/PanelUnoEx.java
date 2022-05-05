package com.mfg.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class PanelUnoEx extends JPanel {

	private static final long serialVersionUID = 1L;

	public static ButtonGroup buttonGroupSexo;
	public static JRadioButton radioButtonSexoM;
	public static JRadioButton radioButtonSexoF;
	public static JTextField areaTextoEdad;
	public static JTextField areaTextoPSS;
	public static ButtonGroup buttonGroupHiper;
	public static JRadioButton radioButtonHiper1;
	public static JRadioButton radioButtonHiper2;
	public static ButtonGroup buttonGroupFum;
	public static JRadioButton radioButtonFum1;
	public static JRadioButton radioButtonFum2;
	public static ButtonGroup buttonGroupDiab;
	public static JRadioButton radioButtonDiab1;
	public static JRadioButton radioButtonDiab2;
	public static JTextField areaTextoHDL;
	public static JTextField areaTextoChol;

	public PanelUnoEx() {

		this.setLayout(null);

		JLabel imagen = new JLabel(new ImageIcon(
				"G:\\Mi unidad\\Ibero\\4.- Cuarto Semestre\\Pogramacion Orientada a Objetos\\Proyecto 3\\bg2.png"));

		imagen.setPreferredSize(new Dimension(449, 720));
		imagen.setBounds(-15, -10, 449, 720);

		this.add(imagen);

		JLabel etiquetaTitulo = new JLabel("Riesgo Cardiovascular", SwingConstants.LEFT);

		etiquetaTitulo.setBounds(480, 15, 512, 58);
		etiquetaTitulo.setFont(new Font("Abel_Regular", Font.BOLD, 40));

		this.add(etiquetaTitulo);

		JLabel etiquetaDiv = new JLabel("Div", SwingConstants.LEFT);

		etiquetaDiv.setOpaque(true);
		etiquetaDiv.setBounds(480, 80, 560, 12);
		etiquetaDiv.setForeground(Color.RED);
		etiquetaDiv.setBackground(Color.RED);

		this.add(etiquetaDiv);

		JLabel etiquetaSexo = new JLabel("Sexo", SwingConstants.LEFT);

		etiquetaSexo.setBounds(480, 115, 300, 30); // (480,165,300,30);
		etiquetaSexo.setFont(new Font("Abel_Regular", Font.BOLD, 20));

		this.add(etiquetaSexo);

		radioButtonSexoM = new JRadioButton("Hombre");

		radioButtonSexoM.setBounds(800, 115, 100, 30);
		radioButtonSexoM.setFont(new Font("Abel_Regular", Font.BOLD, 20));
		radioButtonSexoM.setActionCommand("true");

		radioButtonSexoF = new JRadioButton("Mujer");

		radioButtonSexoF.setBounds(900, 115, 100, 30);
		radioButtonSexoF.setFont(new Font("Abel_Regular", Font.BOLD, 20));
		radioButtonSexoF.setActionCommand("false");

		buttonGroupSexo = new ButtonGroup();

		buttonGroupSexo.add(radioButtonSexoM);
		buttonGroupSexo.add(radioButtonSexoF);
		this.add(radioButtonSexoM);
		this.add(radioButtonSexoF);
		this.setSize(300, 300);
		this.setLayout(null);
		this.setVisible(true);

		JLabel etiquetaEdad = new JLabel("Edad", SwingConstants.LEFT);

		etiquetaEdad.setBounds(480, 170, 300, 30); // (480,230,300,30);
		etiquetaEdad.setFont(new Font("Abel_Regular", Font.BOLD, 20));

		this.add(etiquetaEdad);

		areaTextoEdad = new JTextField(1);

		areaTextoEdad.setDocument(new LimitJTextField(2));

		areaTextoEdad.setBounds(800, 170, 200, 30);
		areaTextoEdad.setForeground(Color.BLACK);
		areaTextoEdad.setFont(new Font("Abel_Regular", Font.ITALIC, 20));

		Border border = BorderFactory.createLineBorder(Color.RED);
		areaTextoEdad.setBorder(BorderFactory.createCompoundBorder(border,
				BorderFactory.createEmptyBorder(2, 2, 2, 2)));

		this.add(areaTextoEdad);

		JLabel etiquetaPSS = new JLabel("Presion Sanguinea sistolica", SwingConstants.LEFT);

		etiquetaPSS.setBounds(480, 235, 400, 30);
		etiquetaPSS.setFont(new Font("Abel_Regular", Font.BOLD, 20));

		this.add(etiquetaPSS);

		areaTextoPSS = new JTextField(1);

		areaTextoPSS.setDocument(new LimitJTextField(3));

		areaTextoPSS.setBounds(800, 235, 200, 30);
		areaTextoPSS.setForeground(Color.BLACK);
		areaTextoPSS.setFont(new Font("Abel_Regular", Font.ITALIC, 20));

		Border border2 = BorderFactory.createLineBorder(Color.RED);
		areaTextoPSS.setBorder(BorderFactory.createCompoundBorder(border2,
				BorderFactory.createEmptyBorder(2, 2, 2, 2)));

		this.add(areaTextoPSS);

		JLabel etiquetaHiper = new JLabel("Hipertension", SwingConstants.LEFT);

		etiquetaHiper.setBounds(480, 300, 400, 30);
		etiquetaHiper.setFont(new Font("Abel_Regular", Font.BOLD, 20));

		this.add(etiquetaHiper);

		radioButtonHiper1 = new JRadioButton("Si");

		radioButtonHiper1.setBounds(800, 300, 100, 30);
		radioButtonHiper1.setFont(new Font("Abel_Regular", Font.BOLD, 20));
		radioButtonHiper1.setActionCommand("true");

		radioButtonHiper2 = new JRadioButton("No");

		radioButtonHiper2.setBounds(900, 300, 100, 30);
		radioButtonHiper2.setFont(new Font("Abel_Regular", Font.BOLD, 20));
		radioButtonHiper2.setActionCommand("false");

		buttonGroupHiper = new ButtonGroup();

		buttonGroupHiper.add(radioButtonHiper1);
		buttonGroupHiper.add(radioButtonHiper2);
		this.add(radioButtonHiper1);
		this.add(radioButtonHiper2);
		this.setSize(300, 300);
		this.setLayout(null);
		this.setVisible(true);

		JLabel etiquetaFum = new JLabel("Fumador", SwingConstants.LEFT);

		etiquetaFum.setBounds(480, 365, 300, 30);
		etiquetaFum.setFont(new Font("Abel_Regular", Font.BOLD, 20));

		this.add(etiquetaFum);

		JLabel etiquetaFbs = new JLabel("*Fasting blood sugar > 120 mg/dl", SwingConstants.LEFT);

		etiquetaFbs.setBounds(480, 395, 400, 30);
		etiquetaFbs.setFont(new Font("Abel_Regular", Font.ITALIC, 15));

		this.add(etiquetaFbs);

		radioButtonFum1 = new JRadioButton("Si");

		radioButtonFum1.setBounds(800, 365, 100, 30);
		radioButtonFum1.setFont(new Font("Abel_Regular", Font.BOLD, 20));
		radioButtonFum1.setActionCommand("true");

		radioButtonFum2 = new JRadioButton("No");

		radioButtonFum2.setBounds(900, 365, 100, 30);
		radioButtonFum2.setFont(new Font("Abel_Regular", Font.BOLD, 20));
		radioButtonFum2.setActionCommand("false");

		buttonGroupFum = new ButtonGroup();

		buttonGroupFum.add(radioButtonFum1);
		buttonGroupFum.add(radioButtonFum2);
		this.add(radioButtonFum1);
		this.add(radioButtonFum2);
		this.setSize(300, 300);
		this.setLayout(null);
		this.setVisible(true);

		JLabel etiquetaDiab = new JLabel("Diabetes", SwingConstants.LEFT);

		etiquetaDiab.setBounds(480, 430, 300, 30);
		etiquetaDiab.setFont(new Font("Abel_Regular", Font.BOLD, 20));

		this.add(etiquetaDiab);

		radioButtonDiab1 = new JRadioButton("Si");

		radioButtonDiab1.setBounds(800, 430, 100, 30);
		radioButtonDiab1.setFont(new Font("Abel_Regular", Font.BOLD, 20));
		radioButtonDiab1.setActionCommand("true");

		radioButtonDiab2 = new JRadioButton("No");

		radioButtonDiab2.setBounds(900, 430, 100, 30);
		radioButtonDiab2.setFont(new Font("Abel_Regular", Font.BOLD, 20));
		radioButtonDiab2.setActionCommand("false");

		buttonGroupDiab = new ButtonGroup();

		buttonGroupDiab.add(radioButtonDiab1);
		buttonGroupDiab.add(radioButtonDiab2);
		this.add(radioButtonDiab1);
		this.add(radioButtonDiab2);
		this.setSize(300, 300);
		this.setLayout(null);
		this.setVisible(true);

		JLabel etiquetaHDL = new JLabel("HDL", SwingConstants.LEFT);

		etiquetaHDL.setBounds(480, 495, 400, 30);
		etiquetaHDL.setFont(new Font("Abel_Regular", Font.BOLD, 20));

		this.add(etiquetaHDL);

		areaTextoHDL = new JTextField(1);

		areaTextoHDL.setDocument(new LimitJTextField(3));

		areaTextoHDL.setBounds(800, 495, 200, 30);
		areaTextoHDL.setForeground(Color.BLACK);
		areaTextoHDL.setFont(new Font("Abel_Regular", Font.ITALIC, 20));

		Border border3 = BorderFactory.createLineBorder(Color.RED);
		areaTextoHDL.setBorder(BorderFactory.createCompoundBorder(border3,
				BorderFactory.createEmptyBorder(2, 2, 2, 2)));

		this.add(areaTextoHDL);

		JLabel etiquetaChol = new JLabel("Coresterol", SwingConstants.LEFT);

		etiquetaChol.setBounds(480, 560, 400, 30);
		etiquetaChol.setFont(new Font("Abel_Regular", Font.BOLD, 20));

		this.add(etiquetaChol);

		areaTextoChol = new JTextField(1);

		areaTextoChol.setDocument(new LimitJTextField(3));

		areaTextoChol.setBounds(800, 560, 200, 30);
		areaTextoChol.setForeground(Color.BLACK);
		areaTextoChol.setFont(new Font("Abel_Regular", Font.ITALIC, 20));

		Border border4 = BorderFactory.createLineBorder(Color.RED);
		areaTextoChol.setBorder(BorderFactory.createCompoundBorder(border4,
				BorderFactory.createEmptyBorder(2, 2, 2, 2)));

		this.add(areaTextoChol);

	}

	class LimitJTextField extends PlainDocument {

		private static final long serialVersionUID = 1L;
		private int max;

		LimitJTextField(int max) {
			super();
			this.max = max;
		}

		public void insertString(int offset, String text, AttributeSet attr) throws BadLocationException {
			if (text == null)
				return;
			if ((getLength() + text.length()) <= max) {
				super.insertString(offset, text, attr);
			}
		}
	}
}
