package homework;

import jdk.nashorn.api.scripting.URLReader;

        import java.io.*;
        import java.net.HttpURLConnection;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.net.URLConnection;

public class UrlTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://movie.douban.com/top250");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            int code = httpURLConnection.getResponseCode();
            Writer writer = new FileWriter("douban.html");
            if (code == HttpURLConnection.HTTP_OK){
                System.out.println("成功");
                InputStream in = httpURLConnection.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader bufr = new BufferedReader(isr);
                String str;
                while ((str = bufr.readLine()) != null) {
                    System.out.println(str);
                }
                writer.close();
                bufr.close();
            } else {
                System.err.println("失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
