package CalculadoraSalud;

public class MetabolicMetrics {
    public static double basalMetabolicRate(Person person) throws Exception {
        if (person.getGender() == Gender.MALE) {
            return 10 * person.getWeight() + 6.25 * person.getHeight() - 5 * person.getAge() + 5;
        } else if (person.getGender() == Gender.FEMALE) {
            return 10 * person.getWeight() + 6.25 * person.getHeight() - 5 * person.getAge() - 161;
        } else {
            throw new Exception("Invalid gender.");
        }
    }
}