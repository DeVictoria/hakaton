package sdk;

import java.util.LinkedList;
import java.util.List;

public class Logger {

    List<String[]> logs = new LinkedList<>();

    public Logger() {
    }

    public void log(String IdDevice, String TimeMili, String Location, String ModelDevice) {
        String[] log = new String[4];
        log[0] = IdDevice;
        log[1] = TimeMili;
        log[2] = Location;
        log[3] = ModelDevice;
        logs.add(log);
        if(logs.size()>=100){
            SenderToServer();
        }
    }

}
