package CalculadoraSalud;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField alturaPesoIdeal;
    private JTextField alturaTMB;
    private JTextField pesoTMB;
    private JTextField edadTMB;
    private JButton calcularPesoIdealButton;
    private JButton calcularTMBButton;
    private JRadioButton botonHombrePesoIdeal;
    private JRadioButton botonMujerPesoIdeal;
    private JRadioButton botonHombreTMB;
    private JRadioButton botonMujerTMB;
    private JLabel resultadoPesoIdeal;
    private JLabel resultadoTMB;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public JTextField getAlturaPesoIdeal() {
        return alturaPesoIdeal;
    }

    public JRadioButton getBotonHombrePesoIdeal() {
        return botonHombrePesoIdeal;
    }

    public JRadioButton getBotonMujerPesoIdeal() {
        return botonMujerPesoIdeal;
    }

    public JTextField getAlturaTMB() {
        return alturaTMB;
    }

    public JTextField getPesoTMB() {
        return pesoTMB;
    }

    public JTextField getEdadTMB() {
        return edadTMB;
    }

    public JRadioButton getBotonHombreTMB() {
        return botonHombreTMB;
    }

    public JRadioButton getBotonMujerTMB() {
        return botonMujerTMB;
    }

    public JButton getCalcularPesoIdealButton() {
        return calcularPesoIdealButton;
    }

    public JButton getCalcularTMBButton() {
        return calcularTMBButton;
    }
    
    public JLabel getResultadoPesoIdeal() {
        return resultadoPesoIdeal;
    }

    public JLabel getResultadoTMB() {
        return resultadoTMB;
    }

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a la Calculadora de Salud!");
		lblNewLabel.setBounds(108, 10, 233, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduzca los datos del parametro que desea calcular y pulse el boton:");
		lblNewLabel_1.setBounds(33, 33, 381, 14);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Género:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(6, 73, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		botonHombrePesoIdeal = new JRadioButton("Hombre");
		botonHombrePesoIdeal.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		botonHombrePesoIdeal.setBounds(76, 69, 75, 23);
		contentPane.add(botonHombrePesoIdeal);
		
		botonMujerPesoIdeal = new JRadioButton("Mujer");
		botonMujerPesoIdeal.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		botonMujerPesoIdeal.setBounds(141, 69, 65, 23);
		contentPane.add(botonMujerPesoIdeal);
		
		JLabel lblNewLabel_3 = new JLabel("Altura (cm):");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(6, 101, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		alturaPesoIdeal = new JTextField();
		alturaPesoIdeal.setBounds(76, 95, 130, 26);
		contentPane.add(alturaPesoIdeal);
		alturaPesoIdeal.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Género:");
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(236, 73, 61, 16);
		contentPane.add(lblNewLabel_2_1);
		
		botonHombreTMB = new JRadioButton("Hombre");
		botonHombreTMB.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		botonHombreTMB.setBounds(296, 69, 75, 23);
		contentPane.add(botonHombreTMB);
		
		botonMujerTMB = new JRadioButton("Mujer");
		botonMujerTMB.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		botonMujerTMB.setBounds(369, 69, 141, 23);
		contentPane.add(botonMujerTMB);
		
		JLabel lblNewLabel_3_1 = new JLabel("Altura (cm):");
		lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_3_1.setBounds(236, 101, 61, 16);
		contentPane.add(lblNewLabel_3_1);
		
		alturaTMB = new JTextField();
		alturaTMB.setBounds(306, 95, 130, 26);
		contentPane.add(alturaTMB);
		alturaTMB.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Peso (kg):");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(236, 129, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		pesoTMB = new JTextField();
		pesoTMB.setBounds(306, 123, 130, 26);
		contentPane.add(pesoTMB);
		pesoTMB.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Edad:");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(236, 157, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		edadTMB = new JTextField();
		edadTMB.setBounds(306, 151, 130, 26);
		contentPane.add(edadTMB);
		edadTMB.setColumns(10);
		
		JButton calcularPesoIdeal = new JButton("Calcular peso ideal");
		calcularPesoIdeal.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		calcularPesoIdeal.setBounds(48, 144, 130, 44);
		contentPane.add(calcularPesoIdeal);
		calcularPesoIdealButton = calcularPesoIdeal;
		
		JButton calcularTMB = new JButton("Calcular TMB");
		calcularTMB.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		calcularTMB.setBounds(271, 189, 117, 44);
		contentPane.add(calcularTMB);
		calcularTMBButton = calcularTMB;
		
		JLabel lblNewLabel_6 = new JLabel("Resultado peso ideal:");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(32, 246, 132, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Resultado TMB:");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(281, 246, 91, 16);
		contentPane.add(lblNewLabel_7);
		
		resultadoPesoIdeal = new JLabel("");
		resultadoPesoIdeal.setBounds(145, 246, 61, 16);
		contentPane.add(resultadoPesoIdeal);
		
		resultadoTMB = new JLabel("");
		resultadoTMB.setBounds(369, 246, 61, 16);
		contentPane.add(resultadoTMB);
	}
}