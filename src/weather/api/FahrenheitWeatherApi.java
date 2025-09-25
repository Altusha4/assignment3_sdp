package weather.api;
import java.util.Map;

public class FahrenheitWeatherApi {

    private static final Map<String, Double> FAKE_DB = Map.of(
            "Astana", 68.0,     // ℉
            "Almaty", 75.2,
            "London", 59.0
    );

    public double getTemperatureF(String location) {
        return FAKE_DB.getOrDefault(location, 70.0);
    }
}
