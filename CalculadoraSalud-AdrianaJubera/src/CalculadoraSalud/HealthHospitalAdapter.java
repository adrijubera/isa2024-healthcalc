package CalculadoraSalud;

import java.util.ArrayList;
import java.util.List;

public class HealthHospitalAdapter implements HealthHospital {
    private List<HealthStats> observadores;
    private List<Paciente> pacientes;

    public HealthHospitalAdapter() {
        this.observadores = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) {
        Modelo modelo = Modelo.obtenerInstancia();

        try {
            double pesoKg = peso / 1000.0;
            double alturaCm = altura * 100.0;
            double bmr = modelo.calcularTMB(pesoKg, alturaCm, genero, edad);
            double pesoIdeal = modelo.calcularPesoIdeal(alturaCm, genero);
            
            Paciente paciente = new Paciente(genero, edad, altura, peso, bmr, pesoIdeal);
            pacientes.add(paciente);
            
            notificarObservadores();
            
            return bmr;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int pesoIdeal(char genero, float altura) {
        Modelo modelo = Modelo.obtenerInstancia();

        try {
            double alturaCm = altura * 100.0;
            double pesoIdealKg = modelo.calcularPesoIdeal(alturaCm, genero);
            
            Paciente paciente = new Paciente(genero, 0, altura, pesoIdealKg, 0, (int) Math.round(pesoIdealKg * 1000));
            pacientes.add(paciente);
            
            notificarObservadores();
            
            return (int) Math.round(pesoIdealKg * 1000);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public void registrarObservador(HealthStats observador) {
        observadores.add(observador);
    }

    private void notificarObservadores() {
        for (HealthStats observador : observadores) {
            observador.actualizarEstadisticas(pacientes);
        }
    }
}