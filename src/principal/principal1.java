package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import conversorMonedas.functionMonedas;
import conversorTemperaturas.functionTemperatura;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Button;
import java.awt.Scrollbar;
import java.awt.Label;

public class principal1 extends JFrame {

	private JPanel contentPane;
	private JTextField IngreseTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal1 frame = new principal1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public principal1() {
		setTitle("Conversor de monedas y temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JInternalFrame VentanaInterna = new JInternalFrame("Conversor");
		VentanaInterna.setForeground(Color.BLACK);
		VentanaInterna.setBackground(Color.LIGHT_GRAY);
		VentanaInterna.setBounds(10, 11, 412, 239);
		contentPane.add(VentanaInterna);
		VentanaInterna.setVisible(false);

		Panel panel = new Panel();
		panel.setForeground(Color.BLACK);
		VentanaInterna.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel.setVisible(false);

		JLabel SeleccioneUnaOpción = new JLabel("Seleccione una opción de conversión");
		SeleccioneUnaOpción.setHorizontalAlignment(SwingConstants.CENTER);
		SeleccioneUnaOpción.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 10));
		SeleccioneUnaOpción.setBounds(10, 0, 380, 14);
		panel.add(SeleccioneUnaOpción);
		SeleccioneUnaOpción.setVisible(false);

		JButton ButtonOk = new JButton("Ok");
		ButtonOk.setBackground(Color.DARK_GRAY);
		ButtonOk.setForeground(Color.WHITE);
		ButtonOk.setFont(new Font("Tahoma", Font.PLAIN, 8));
		ButtonOk.setBounds(10, 46, 380, 23);
		panel.add(ButtonOk);
		ButtonOk.setVisible(false);

		JTextField IngreseTexto_1 = new JTextField();
		IngreseTexto_1.setBackground(Color.DARK_GRAY);
		IngreseTexto_1.setForeground(Color.WHITE);
		IngreseTexto_1.setBounds(10, 101, 380, 20);
		panel.add(IngreseTexto_1);
		IngreseTexto_1.setColumns(10);
		IngreseTexto_1.setVisible(false);

		JButton ButtonConvertir = new JButton("Convertir");
		ButtonConvertir.setForeground(Color.WHITE);
		ButtonConvertir.setBackground(Color.DARK_GRAY);
		ButtonConvertir.setFont(new Font("Tahoma", Font.PLAIN, 8));
		ButtonConvertir.setBounds(57, 171, 89, 23);
		panel.add(ButtonConvertir);

		JLabel lblNewLabel_1 = new JLabel("Ingresa los valores a convertir");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 10));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 81, 380, 16);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Si deseas realizar una conversión haz click en aceptar..");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(30, 87, 375, 16);
		contentPane.add(lblNewLabel_2);

		String[] titulo1 = new String[] {"Conversor de Moneda","Conversor de Temperatura"};

		@SuppressWarnings("uunchecked")
		JComboBox comboBoxOpciones1 = new JComboBox();
		comboBoxOpciones1.setModel(new DefaultComboBoxModel(titulo1));
		comboBoxOpciones1.setForeground(Color.DARK_GRAY);
		comboBoxOpciones1.setBackground(Color.WHITE);
		comboBoxOpciones1.setBounds(10, 12, 380, 22);
		panel.add(comboBoxOpciones1);
		
		Label label = new Label("Selecciona el tipo de intercambio");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		label.setBounds(10, 128, 380, 14);
		panel.add(label);
		label.setVisible(false);

		JButton ButtonAceptar = new JButton("Aceptar");
		ButtonAceptar.setForeground(Color.WHITE);
		ButtonAceptar.setBackground(Color.DARK_GRAY);
		ButtonAceptar.setBounds(169, 146, 98, 26);
		contentPane.add(ButtonAceptar);
		ButtonAceptar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				VentanaInterna.setVisible(true);
				panel.setVisible(true);
				ButtonOk.setVisible(true);
				SeleccioneUnaOpción.setVisible(true);

				ButtonOk.addActionListener(new ActionListener() {
					@SuppressWarnings({ "rawtypes", "unused" })
					public void actionPerformed(ActionEvent e) {

						comboBoxOpciones1.setVisible(true);
						IngreseTexto_1.setVisible(true);
						ButtonConvertir.setVisible(true);
						label.setVisible(true);


						String[] opcionesConversion = new String[] {};

						switch (titulo1[comboBoxOpciones1.getSelectedIndex()]) {
						case "Conversor de Moneda":
							opcionesConversion = new String[] { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Yen",
									"De Pesos a Pesos Chilenos", "De Pesos a Libras", "De Dólar a Pesos",
									"De Euro a Pesos", "De Yen a Pesos", "De Peso Chileno a Pesos",
									"De Libra a Pesos" };

							break;
						case "Conversor de Temperatura":
							opcionesConversion = new String[] { "Kelvin a Grados Celcius", "Kelvin a Grados Farenheit",
									"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin",
									"Grados Farenheit a Grados Celcius" };
							break;

						}

						JComboBox tipoDeConversionCombobox = new JComboBox();
						tipoDeConversionCombobox.setModel(new DefaultComboBoxModel(opcionesConversion));
						tipoDeConversionCombobox.setForeground(Color.DARK_GRAY);
						tipoDeConversionCombobox.setBackground(Color.WHITE);
						tipoDeConversionCombobox.setBounds(10, 140, 380, 22);
						tipoDeConversionCombobox.setVisible(isVisible());
						panel.add(tipoDeConversionCombobox);

						functionMonedas monedas = new functionMonedas();
						functionTemperatura temperatura = new functionTemperatura();

						int conversores = comboBoxOpciones1.getSelectedIndex();

						ButtonConvertir.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								Double numero = Double.parseDouble(IngreseTexto_1.getText());

								switch (titulo1[comboBoxOpciones1.getSelectedIndex()]) {
								case "Conversor de Moneda":
									monedas.ConvertirMonedas(numero,
											tipoDeConversionCombobox.getSelectedItem().toString());
									break;
								case "Conversor de Temperatura":
									temperatura.ConvertirTemperatura(numero,
											tipoDeConversionCombobox.getSelectedItem().toString());
									break;

								}

							}
						});
					}
				});

			}

		});

		JButton ButtonSalir = new JButton("Salir");
		ButtonSalir.setForeground(Color.WHITE);
		ButtonSalir.setBackground(Color.DARK_GRAY);
		ButtonSalir.setBounds(169, 184, 98, 26);
		contentPane.add(ButtonSalir);
		ButtonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});

		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(237, 171, 98, 22);
		panel.add(btnNewButton_1);
		


		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\carlos\\eclipse-workspace\\JavaPrimerosPasos\\src\\ConversorDeMonedas&Temperatura\\src\\principal\\kimetsu-no-yaiba-anime-boys-long-hair-2d-fan-art-hd-wallpaper-preview.jpg"));
		lblNewLabel.setBounds(10, 11, 414, 239);
		contentPane.add(lblNewLabel);

	}
}

