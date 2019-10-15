import java.util.Scanner;

public class Main {
    public static Trip trip = null;

    public static void main(String[] args) throws Throwable {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1)Start a Trip\n2)Stop a trip\n3)Total Trip Kilometers\n4)Add Trip Kilometers\nOr Press 0 to stop");
        int choice = 100;
        do {
            try {
                System.out.print("Choose an option: ");
                choice = keyboard.nextInt();

                switch (choice) {
                    case (1):
                        if (!isIntialized()) {
                            //Πετάμε exception ώστε να πάει στο Catch και να μας πεί οτι υπάρχει ήδη ταξίδι στην μνήμη
                            throw new NullPointerException();
                        }
                        System.out.println("Set Concumption");
                        float consumption = keyboard.nextFloat();
                        trip = new Trip(consumption);
                        System.out.println("New Trip Stared!");
                        break;
                    case (2):

                        System.out.println("Trip Stoped");
                        System.out.println("You have used " + trip.Calculate() + " litres of Gas");
                        trip.EmptyTrip();
                        trip = null;
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

                }


            } catch (NullPointerException e) {
                System.out.println("No trip has been initialized so far ");
            }

        } while (choice != 0);


    }

    private static boolean isIntialized() {
        if (trip != null)
            return false;
        return true;
    }
}
