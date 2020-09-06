import java.net.*;

public class URLDemo{

  public static void main(String[] args) {
    try {
      URL url = new URL("https://www.javatpoint.com/URL-class");

      System.out.println("Protocol: "+ url.getProtocol());
      System.out.println("Host Name: "+ url.getHost());
      System.out.println("Port: "+ url.getPort());
      System.out.println("File: "+ url.getFile());
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}
