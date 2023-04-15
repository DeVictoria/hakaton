package sdk;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class Logger implements AutoCloseable {

    Socket socket;

    List<String[]> logs = new LinkedList<>();

    public Logger(String host, int port) throws IOException {
        socket = new Socket(host, port);
    }

    public void log(String IdDevice, String TimeMili, String Location, String ModelDevice) {
        String[] log = new String[4];
        log[0] = IdDevice;
        log[1] = TimeMili;
        log[2] = Location;
        log[3] = ModelDevice;
        logs.add(log);
        if(logs.size()>=100){
            sendToServer();
        }
    }

    public void sendToServer() {

    }

    @Override
    public void close() throws IOException {

    }


}
