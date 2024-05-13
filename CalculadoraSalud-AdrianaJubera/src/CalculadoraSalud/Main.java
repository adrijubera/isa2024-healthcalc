package CalculadoraSalud;

public class Main {
    public static void main(String[] args) throws Exception {
        
        HealthHospitalAdapterEurope adapterEurope = new HealthHospitalAdapterEurope();
        char generoEuropeo = 'm';
        int edadEuropea = 30;
        float alturaEuropea = (float) 1.75;
        int pesoEuropeo = 70;
        double bmrEuropeo = adapterEurope.bmr(generoEuropeo, edadEuropea, alturaEuropea, pesoEuropeo);
        System.out.println("BMR (Europeo): " + bmrEuropeo);

        
        HealthHospitalAdapterAmerica adapterAmerica = new HealthHospitalAdapterAmerica();
        char generoAmericano = 'f';
        int edadAmericana = 25;
        float alturaAmericana = (float) 5.7;
        int pesoAmericano = 150;
        double bmrAmericano = adapterAmerica.bmr(generoAmericano, edadAmericana, alturaAmericana, pesoAmericano);
        System.out.println("BMR (Americano): " + bmrAmericano);
    }
}
