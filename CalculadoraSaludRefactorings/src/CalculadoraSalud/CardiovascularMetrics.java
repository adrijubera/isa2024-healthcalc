package CalculadoraSalud;

public class CardiovascularMetrics {
    public static double getIdealBodyWeight(Person person) throws Exception {
        if (person.getGender() == Gender.MALE) {
            return person.getHeight() - 100 - (person.getHeight() - 150) / 4.0;
        } else if (person.getGender() == Gender.FEMALE) {
            return person.getHeight() - 100 - (person.getHeight() - 150) / 2.5;
        } else {
            throw new Exception("Invalid gender.");
        }
    }
}