import java.io.*;
import java.net.*;

public class HttpURLConnectionEx{

  public static void main(String[] args) {
    try {
      URL url = new URL("https://www.javatpoint.com/URLConnection-class");
      HttpURLConnection huc = (HttpURLConnection)url.openConnection();

      for(int i=1 ; i<=8; i++){
        System.out.println(huc.getHeaderFieldKey(i)+ " = "+ huc.getHeaderField(i));
      }
      huc.disconnect();
    } catch(Exception e) {
      System.out.println(e);
    }



  }
}
