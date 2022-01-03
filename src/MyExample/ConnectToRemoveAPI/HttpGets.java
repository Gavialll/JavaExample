package ConnectToRemoveAPI;


import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpGets {

    public static void main(String[] args) throws IOException {

        try(CloseableHttpClient httpClient = HttpClients.createDefault()) {

            // создаем объект клиента
            org.apache.http.client.methods.HttpGet request = new org.apache.http.client.methods.HttpGet("https://api.privatbank.ua/p24api/exchange_rates?json&date=22.12.2021");

            // добавляем заголовки запроса
//            request.addHeader("Author", "MyRusakov.Ru");
//            request.addHeader(HttpHeaders.USER_AGENT, "MyRusakov.HttpClient");

            try(CloseableHttpResponse response = httpClient.execute(request)) {

                // получаем статус ответа
                System.out.println(response.getProtocolVersion());              // HTTP/1.1
                System.out.println(response.getStatusLine().getStatusCode());   // 200
                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();

                // если есть тело ответа
                if(entity != null) {
                    // возвращаем строку
                    String result = EntityUtils.toString(entity);
                    System.out.println(result);
                }

            } catch(IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
