package CalculadoraSalud;

import java.util.List;

public interface HealthStats {
	float alturaMedia();
    float pesoMedio();
    float edadMedia();
    float bmrMedio();
    int numSexoH();
    int numSexoM();
    int numTotalPacientes();
    void actualizarEstadisticas(List<Paciente> pacientes);
}
