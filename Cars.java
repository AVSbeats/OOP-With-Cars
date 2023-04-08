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
        String[] myNewCars = { "Audi", "Lexus", "BMW", "Acura", "Hyundai" };

        System.out.print("My future cars are: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(myNewCars[i] + ", ");
        }
    }

    public static int[] yearsToGet() { // Can Not Use with ***Cars myCars = new Cars();***
        int[] years = { 2024, 2025, 2026, 2027 };

        System.out.print("The years I will buy them are: ");
        for (int j = 0; j < years.length; j++) {
            System.out.print(years[j] + " ");
        }
        return years;
    }
}
