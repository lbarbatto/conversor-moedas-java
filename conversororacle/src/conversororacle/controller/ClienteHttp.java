package conversororacle.controller;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import conversororacle.view.EditaResposta;

public class ClienteHttp {
	EditaResposta objeto = new EditaResposta();

	public String getConversao(String to, String from, double amount, int index)
			throws IOException, InterruptedException {

		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
				"https://v6.exchangerate-api.com/v6/21148923d911b719191c2ccf/pair/" + from + "/" + to + "/" + amount))
				.GET().build();

		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

		return objeto.converteRespostaConversor(response.body(), index);
	}

	public Object getCambio() {

		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://v6.exchangerate-api.com/v6/21148923d911b719191c2ccf/latest/brl")).GET()
				.build();

		try {
			HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
			return objeto.converteRespostaCambio(response.body());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void openWebpage(String urlString) {
		try {
			Desktop.getDesktop().browse(new URL(urlString).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
