package CalculadoraSalud;

public class MetabolicMetrics {
    public static double basalMetabolicRate(Person person) throws Exception {
        if (person.gender() == Gender.MALE) {
            return 10 * person.weight() + 6.25 * person.height() - 5 * person.age() + 5;
        } else if (person.gender() == Gender.FEMALE) {
            return 10 * person.weight() + 6.25 * person.height() - 5 * person.age() - 161;
        } else {
            throw new Exception("Invalid gender.");
        }
    }
}