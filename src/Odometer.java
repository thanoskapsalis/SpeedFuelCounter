public class Odometer {

    private int kilometers;
    private float consumption;


    //Όταν ξεκινάς το ταξίδι απλά θα μιδενίζει τα χιλιόμετρα και θα βάζει την κατανάλωση στο 0
    public Odometer()
    {
        kilometers=0;
        consumption=0;
    }

    public Odometer(int kilometers, float consumption) {
        this.kilometers = kilometers;
        this.consumption = consumption;
    }

    public int getKilometers(){return kilometers;}
    public float getConsumption(){return consumption;}



}