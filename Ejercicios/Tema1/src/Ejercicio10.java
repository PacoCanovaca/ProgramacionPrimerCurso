public class Ejercicio10 {

    public static void main(String[] args) {
        int temperatureCelsius = 25;

        System.out.println("Temperatura en Celsius: " + temperatureCelsius + "°C");
        System.out.println("Temperatura en Fahrenheit: " + transformCelsiusToFahrenheit(temperatureCelsius) + "°F");
    }

    public static int transformCelsiusToFahrenheit(int celsius){
        return celsius * 9/5 + 32;
    }

}
