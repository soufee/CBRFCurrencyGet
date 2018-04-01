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

    public static void main(String[] args) {
        URL url;
        InputStream stream = null;
        BufferedReader reader = null;
        List<String> list = new ArrayList<>();
        try {
            url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
            stream = url.openStream();


            reader = new BufferedReader(new InputStreamReader(stream));


            String s;

            while ((s = reader.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException e) {

        } finally {
            try {
                stream.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }


}
