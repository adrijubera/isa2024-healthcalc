package CalculadoraSalud;

public class CardiovascularMetrics {
    public static double getIdealBodyWeight(Person person) throws Exception {
        if (person.gender() == Gender.MALE) {
            return person.height() - 100 - (person.height() - 150) / 4.0;
        } else if (person.gender() == Gender.FEMALE) {
            return person.height() - 100 - (person.height() - 150) / 2.5;
        } else {
            throw new Exception("Invalid gender.");
        }
    }
}