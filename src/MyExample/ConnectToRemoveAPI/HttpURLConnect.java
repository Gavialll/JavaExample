package ConnectToRemoveAPI;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnect {
    public static void main(String[] args) {
        //Connect to API ang get Json
        String url = "https://api.privatbank.ua/p24api/exchange_rates?json&date=22.12.2021";
        StringBuilder response = new StringBuilder();
        try{
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Parsing Json
        Gson g = new Gson();
        Currencies currencies= g.fromJson(response.toString(), Currencies.class);

        //Print at console
        System.out.println(currencies.getBank());
        System.out.println(currencies.getExchangeRate());

        //Print at console
        for(Currency currency: currencies.getExchangeRate()) {
            if(currency.getPurchaseRate() == null) continue;
            System.out.println("sale: " + currency.getSaleRate().substring(0,5)
                    + " - " + currency.getCurrency() + " - "
                    + "purchase: " + currency.getPurchaseRate().substring(0,5));
        }
    }
}
