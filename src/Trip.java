import java.util.ArrayList;

public class Trip {

    private static ArrayList<Integer> kilometers = new ArrayList<>();
    private static ArrayList<Float> consumption = new ArrayList<>();


    public void AddKilometers(Odometer odometer) {
        kilometers.add(odometer.getKilometers());
        consumption.add(odometer.getConsumption());
        Calculate();
    }

    //Καθαρίζει τους πίνακες και αποδεσμεύει το παρον ταξίδι απο την μνήμη
    public void EmptyTrip() throws Throwable {

        kilometers.clear();
        consumption.clear();
        this.finalize();
    }



    private void Calculate() {
        int maxKilometers = 0;
        float maxConsumption = 0;
        for (int i = 0; i < kilometers.size(); i++)
            maxKilometers = maxKilometers + kilometers.get(i);
        for (int i = 0; i < consumption.size(); i++)
            maxConsumption = maxConsumption + consumption.get(i);
        System.out.println("Kilometers Drivern " + maxKilometers);
        System.out.println("Maximum Concumption " + maxConsumption);
    }

    public int getKilometers() {
        int maxKilometers = 0;
        if(kilometers.isEmpty())
            return 0;
        for (int i = 0; i < kilometers.size(); i++)
            maxKilometers = maxKilometers + kilometers.get(i);
        return maxKilometers;
    }


}
