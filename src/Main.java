import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner keyboard = new Scanner(System.in);
        Trip trip = null;
        System.out.println("1)Start a Trip\n2)Stop a trip\n3)Total Trip Kilometers\n4)Add Trip Kilometers ");
        int choise;
        do {
            System.out.print("Choose an option: ");
            choise = keyboard.nextInt();

            switch (choise) {
                case (1):
                    trip = new Trip();
                    System.out.println("New Trip Stared!");
                    break;
                case (2):

                    trip.EmptyTrip();
                    System.out.println("Trip Deleted");
                    break;
                case (3):
                    try {
                        System.out.println("Total kilometetes: " + trip.getKilometers());
                    } catch (NullPointerException e) {
                        System.out.println("No trip has been initialized so far");
                    }
                    break;


            }

        } while (choise != 0);


    }
}
