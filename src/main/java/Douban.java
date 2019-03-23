import jdk.nashorn.api.scripting.URLReader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Douban {
//    豆瓣爬虫

    private static String DOUBAN_URL = "https://movie.douban.com/top250?start=";
    private static int count = 0;

//    主程序
    public static void main(String[] args) throws IOException {
        int start;
        for (int i = 0; i < 300; i++) {
            start = i * 25;
            System.out.println("当前下载，第" + ( i + 1 ) +"页");
            Substring(DOUBAN_URL + start + "&filter=");
        }
}




    //    下载
    private static void Download(String DOUBAN_URL) throws IOException {
        URL url = new URL(DOUBAN_URL);
        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("picture/" + (++count) + ".jpg"))
        ) {
            int i ;
            while ((i = bufferedInputStream.read()) != -1){
                bufferedOutputStream.write(i);
            }
        }
            System.out.println(count + "下载完成");
    }


    //    截取图片链接
    private static void Substring(String DOUBAN_URL) throws IOException {
          URL url = new URL(DOUBAN_URL);
//          字节流转换字符流
          InputStream inputStream = url.openStream();
          Reader reader = new InputStreamReader(inputStream);
          try (
                  BufferedReader bufferedReader = new BufferedReader(reader)
                  ){
              String line ;
              while ((line = bufferedReader.readLine()) != null){
//                  <img width="100" alt="乱世佳人"
//                  src="https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1963126880.webp" class="">
                  if (line.contains("view/photo")){
                      String src = line.substring(line.indexOf("http"),line.indexOf("\" class"));
                      System.out.println(src);
                      Download(src);
                  }
              }

          }



    }


}
