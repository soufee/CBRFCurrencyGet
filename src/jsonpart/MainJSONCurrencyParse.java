package jsonpart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainJSONCurrencyParse {
    //https://www.cbr-xml-daily.ru/daily_json.js

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
        InputStream stream = url.openStream();


        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 314; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }


}
