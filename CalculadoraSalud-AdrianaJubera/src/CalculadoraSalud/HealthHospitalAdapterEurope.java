package CalculadoraSalud;

public class HealthHospitalAdapterEurope implements HealthHospital {
    private Modelo modelo;

    public HealthHospitalAdapterEurope() {
        this.modelo = Modelo.obtenerInstancia();
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        double bmr = modelo.calcularTMB(peso, altura, genero, edad);
        mostrarMensajeBMR(genero, altura, peso, bmr);
        
        return bmr;
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        int pesoIdealGramos = (int) Math.round(modelo.calcularPesoIdeal(altura, genero) * 1000);
        return pesoIdealGramos;
    }

    private void mostrarMensajeBMR(char genero, float altura, int peso, double bmr) {
        String mensaje = String.format("La persona con altura %.2f metros y %d gramos tiene un BMR de %.2f.", altura, peso, bmr);
        System.out.println(mensaje);
    }
}
