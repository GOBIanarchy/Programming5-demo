package Plus;

import Vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayDeque;


public class Collector {
    private ArrayDeque<Vehicle> vehicleCollector = new ArrayDeque<>();
    private File file;
    private LocalDateTime lastSaveTime;



    public void clearCollection(){
        vehicleCollector.clear();
    }

    public void saveCollection(){
        file.writeCollection(vehicleCollector);
        lastSaveTime = LocalDateTime.now();

    }


}
