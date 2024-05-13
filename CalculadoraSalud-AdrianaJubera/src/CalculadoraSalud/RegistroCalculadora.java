package CalculadoraSalud;
import java.util.ArrayList;
import java.util.List;

public class RegistroCalculadora implements HealthStats {
    private List<Paciente> pacientes;
    
    public RegistroCalculadora() {
        this.pacientes = new ArrayList<>();
    }
    
    public void registrarPaciente(char genero, int edad, float altura, double peso, double bmr, int pesoIdeal) {
        Paciente paciente = new Paciente(genero, edad, altura, peso, bmr, pesoIdeal);
        pacientes.add(paciente);
    }

    @Override
    public void actualizarEstadisticas(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public float alturaMedia() {
        if (pacientes.isEmpty()) {
            return 0;
        }
        float sumaAltura = 0;
        for (Paciente paciente : pacientes) {
            sumaAltura += paciente.getAltura();
        }
        return sumaAltura / pacientes.size();
    }

    @Override
    public float pesoMedio() {
        if (pacientes.isEmpty()) {
            return 0;
        }
        float sumaPeso = 0;
        for (Paciente paciente : pacientes) {
            sumaPeso += paciente.getPeso();
        }
        return sumaPeso / pacientes.size();
    }

    @Override
    public float edadMedia() {
        if (pacientes.isEmpty()) {
            return 0;
        }
        float sumaEdad = 0;
        for (Paciente paciente : pacientes) {
            sumaEdad += paciente.getEdad();
        }
        return sumaEdad / pacientes.size();
    }

    @Override
    public float bmrMedio() {
        if (pacientes.isEmpty()) {
            return 0;
        }
        float sumaBmr = 0;
        for (Paciente paciente : pacientes) {
            sumaBmr += paciente.getBmr();
        }
        return sumaBmr / pacientes.size();
    }

    @Override
    public int numSexoH() {
        int countHombres = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getGenero() == 'm') {
                countHombres++;
            }
        }
        return countHombres;
    }

    @Override
    public int numSexoM() {
        int countMujeres = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getGenero() == 'w') {
                countMujeres++;
            }
        }
        return countMujeres;
    }

    @Override
    public int numTotalPacientes() {
        return pacientes.size();
    }
}
