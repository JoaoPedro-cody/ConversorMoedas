import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public Moedas consulta() throws IOException, InterruptedException {
        JsonParser parser = new JsonParser();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/6778255774bd97c13a6b9d37/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String resposta = response.body();

        JsonObject root = parser.parse(resposta).getAsJsonObject();
        JsonObject conversionRates = root.getAsJsonObject("conversion_rates");

        double brl = conversionRates.get("BRL").getAsDouble();
        double bob = conversionRates.get("COP").getAsDouble();
        double ars = conversionRates.get("ARS").getAsDouble();
        double usd = 1.0;

        System.out.println(brl + ";" + bob + ";" + ars + ";" + usd);

        Moedas moedas = new Moedas(usd, brl, ars, bob);
        return moedas;
    }
}
