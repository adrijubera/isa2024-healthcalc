package CalculadoraSalud;

public class Mensajes {
    public static String getMensaje(String key, String language) {
        if (language.equals("ES")) { 
            switch (key) {
                case "bmrMessage":
                    return "La persona con altura %1$.2f %2$s y %3$.0f %4$s tiene un BMR de %5$.2f.";
                default:
                    return "Mensaje no encontrado";
            }
        } else { 
            switch (key) {
                case "bmrMessage":
                    return "The person with a height of %1$.2f %2$s and %3$.0f %4$s has a BMR of %5$.2f.";
                default:
                    return "Message not found";
            }
        }
    }
}
