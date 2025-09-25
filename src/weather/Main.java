package weather;

import weather.adapter.FahrenheitToCelsiusAdapter;
import weather.api.CelsiusWeatherService;
import weather.api.FahrenheitWeatherApi;

public class Main {
    public static void main(String[] args) {
        FahrenheitWeatherApi legacyApi = new FahrenheitWeatherApi();
        CelsiusWeatherService weather = new FahrenheitToCelsiusAdapter(legacyApi);

        print(weather, "Astana");
        print(weather, "Almaty");
        print(weather, "London");
        print(weather, "UnknownCity");
    }

    private static void print(CelsiusWeatherService svc, String city) {
        double c = svc.getTempC(city);
        System.out.printf("%s: %.1f °C%n", city, c);
    }
}
