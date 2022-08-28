package sockets;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.Charset;

public class DayTimeClient {
    public static void main(String[] args) {
        String hostname = args.length > 0 ? args.toString() : "time.nist.gov";
        try (Socket socket = new Socket(hostname, 13);) {
            socket.setSoTimeout(15000);
            StringBuilder stringBuilder = new StringBuilder();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream, Charset.forName("ASCII"));
            for (int i = reader.read(); i != -1; i = reader.read()) {
                stringBuilder.append((char) i);
            }
            System.out.println(stringBuilder);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
