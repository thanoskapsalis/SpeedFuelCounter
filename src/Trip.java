import java.util.ArrayList;

public class Trip {

    private int kilometers;
    private float consumption;


    public void AddKilometers(int kilometers) {
        this.kilometers = this.kilometers + kilometers;
        System.out.println("Kilometers Drivern " + kilometers);

    }

    public Trip(float consumption) {
        kilometers = 0;
        this.consumption = consumption;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    //Καθαρίζει τους πίνακες και αποδεσμεύει το παρον ταξίδι απο την μνήμη
    public void EmptyTrip() throws Throwable {

        kilometers = 0;
        consumption = 0;
        this.finalize();
    }


    public int getKilometers() {
        return kilometers;
    }


    public float Calculate() {
        return kilometers * consumption;
    }
}
