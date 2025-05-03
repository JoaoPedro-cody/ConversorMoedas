import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public Moedas consulta() {
        JsonParser parser = new JsonParser();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/6778255774bd97c13a6b9d37/latest/USD"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        String resposta = response.body();

        JsonObject root = parser.parse(resposta).getAsJsonObject();
        JsonObject conversionRates = root.getAsJsonObject("conversion_rates");

        double brl = conversionRates.get("BRL").getAsDouble();
        double cop = conversionRates.get("COP").getAsDouble();
        double ars = conversionRates.get("ARS").getAsDouble();

        return new Moedas(brl, ars, cop);
    }
}
