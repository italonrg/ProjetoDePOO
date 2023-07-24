package util;
 class ConversaoDeTemperatura {
    public static double celsiusParaFahrenheit(double celsius) {
        return (9 * celsius / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double celsiusParaReaumur(double celsius) {
        return celsius * 4 / 5;
    }

    public static double reaumurParaCelsius(double reaumur) {
        return reaumur * 5 / 4;
    }

    public static double kelvinParaRankine(double kelvin) {
        return kelvin * 1.8;
    }

    public static double rankineParaKelvin(double rankine) {
        return rankine / 1.8;
    }

    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = ConversaoDeTemperatura.celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

        fahrenheit = 77;
        celsius = ConversaoDeTemperatura.fahrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F equivale a " + celsius + "°C");

        celsius = 30;
        double kelvin = ConversaoDeTemperatura.celsiusParaKelvin(celsius);
        System.out.println(celsius + "°C equivale a " + kelvin + "K");

        kelvin = 298.15;
        celsius = ConversaoDeTemperatura.kelvinParaCelsius(kelvin);
        System.out.println(kelvin + "K equivale a " + celsius + "°C");

        celsius = 20;
        double reaumur = ConversaoDeTemperatura.celsiusParaReaumur(celsius);
        System.out.println(celsius + "°C equivale a " + reaumur + "°Re");

        reaumur = 16;
        celsius = ConversaoDeTemperatura.reaumurParaCelsius(reaumur);
        System.out.println(reaumur + "°Re equivale a " + celsius + "°C");

        kelvin = 300;
        double rankine = ConversaoDeTemperatura.kelvinParaRankine(kelvin);
        System.out.println(kelvin + "K equivale a " + rankine + "°R");

        rankine = 540;
        kelvin = ConversaoDeTemperatura.rankineParaKelvin(rankine);
        System.out.println(rankine + "°R equivale a " + kelvin + "K");
    }
}
