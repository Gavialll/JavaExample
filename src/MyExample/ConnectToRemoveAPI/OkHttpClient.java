package ConnectToRemoveAPI;


import com.google.gson.Gson;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class OkHttpClient {

    public static void main(String[] args) {
        try{
            String mystr = "https://api.privatbank.ua/p24api/exchange_rates?json&date=23.12.2021";
            URL obj = new URL(mystr);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
//            con.setRequestProperty("User-Agent", "Mozilla/5.0");
//            con.setRequestProperty("Accept-Charset", "UTF-8");
            InputStream response = con.getInputStream();

            Scanner s = new Scanner(response).useDelimiter("\\A");
            String result = s.hasNext() ? s.next() : "";
            System.out.println(result);

            Gson g = new Gson();
            Currencies currencies= g.fromJson(result, Currencies.class);

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
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
