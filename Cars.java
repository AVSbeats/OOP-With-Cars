public class Cars { // This is attached to the Main Class!!!

    String make = "Honda";
    String model = "HRV";
    int year = 2022;
    double price = 21_000.00;

    public void information() {
        System.out.println("My car is a " + make + " " + model + ", " + year);
    }

    public void retailPrice() {
        System.out.println("The price for the car is " + price);
    }

    public void futureCar() {
        String[] myNewCars = { "Audi", "Lexus", "BMW", "Acura" };

        System.out.print("My future cars are: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(myNewCars[i] + ", ");
        }
    }
}
