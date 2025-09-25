package weather.adapter;

import weather.api.CelsiusWeatherService;
import weather.api.FahrenheitWeatherApi;
import java.util.Objects;

public final class FahrenheitToCelsiusAdapter implements CelsiusWeatherService {
    private final FahrenheitWeatherApi fahrenheitApi;

    public FahrenheitToCelsiusAdapter(FahrenheitWeatherApi fahrenheitApi) {
        this.fahrenheitApi = Objects.requireNonNull(fahrenheitApi, "fahrenheitApi is null");
    }
    @Override
    public double getTempC(String city) {
        double f = fahrenheitApi.getTemperatureF(city);
        return toCelsius(f);
    }
    private static double toCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }
}
