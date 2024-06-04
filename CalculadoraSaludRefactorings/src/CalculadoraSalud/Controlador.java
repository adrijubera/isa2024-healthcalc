package CalculadoraSalud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private Vista vista;
    private HealthCalculator healthCalculator;

    public Controlador(Vista vista) {
        this.vista = vista;
        GenderCalculator calculator = vista.getBotonHombrePesoIdeal().isSelected() ? new MaleCalculator() : new FemaleCalculator();
        this.healthCalculator = new HealthCalculator(calculator);

        this.vista.getCalcularPesoIdealButton().addActionListener(new CalcularPesoIdealListener());
        this.vista.getCalcularTMBButton().addActionListener(new CalcularTMBListener());
    }

    class CalcularPesoIdealListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double altura = Double.parseDouble(vista.getAlturaPesoIdeal().getText());
            char genero = vista.getBotonHombrePesoIdeal().isSelected() ? 'm' : 'w';
            HealthParameters parameters = new HealthParameters(altura, 0, genero, 0);

            try {
                double pesoIdeal = healthCalculator.calcularPesoIdeal(parameters);
                vista.getResultadoPesoIdeal().setText(String.valueOf(pesoIdeal));
            } catch (Exception ex) {
                vista.getResultadoPesoIdeal().setText("Error: " + ex.getMessage());
            }
        }
    }

    class CalcularTMBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double altura = Double.parseDouble(vista.getAlturaTMB().getText());
            double peso = Double.parseDouble(vista.getPesoTMB().getText());
            int edad = Integer.parseInt(vista.getEdadTMB().getText());
            char genero = vista.getBotonHombreTMB().isSelected() ? 'm' : 'w';
            HealthParameters parameters = new HealthParameters(altura, peso, genero, edad);

            try {
                double tmb = healthCalculator.calcularTMB(parameters);
                vista.getResultadoTMB().setText(String.valueOf(tmb));
            } catch (Exception ex) {
                vista.getResultadoTMB().setText("Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);
        vista.setVisible(true);
    }
}
