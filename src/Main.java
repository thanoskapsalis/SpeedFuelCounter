import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner keyboard = new Scanner(System.in);
        Trip trip = null;
        System.out.println("1)Start a Trip\n2)Stop a trip\n3)Total Trip Kilometers\n4)Add Trip Kilometers\n5)Set Consumption ");
        int choice = 100;
        do {
            try {
                System.out.print("Choose an option: ");
                choice = keyboard.nextInt();

                switch (choice) {
                    case (1):
                        trip = new Trip();
                        System.out.println("New Trip Stared!");
                        break;
                    case (2):

                        trip.EmptyTrip();
                        trip = null;
                        System.out.println("Trip Deleted");
                        break;
                    case (3):

                        System.out.println("Total kilometetes: " + trip.getKilometers());

                        break;
                    case (4):
                        System.out.print("Kilometers driven: ");
                        System.out.println();
                        int kilometers = keyboard.nextInt();
                        trip.AddKilometers(kilometers);
                        break;
                    case (5):
                        System.out.print("Consumption: ");
                        System.out.println();
                        float consumption = keyboard.nextFloat();
                        trip.setConsumption(consumption);


                }


            } catch (NullPointerException e) {
                System.out.println("No trip has been initialized so far ");
            }

        } while (choice != 0);


    }
}
