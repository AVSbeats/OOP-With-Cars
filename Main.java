public class Main {
    public static void main(String[] args) {

        double savedMoney = 8_000.51;

        Cars myCars = new Cars();
        System.out.println(); // Space

        myCars.information();
        System.out.println();

        myCars.retailPrice();
        System.out.println();

        double total = (myCars.price - savedMoney);

        System.out.println("The amount total after using your savings is " + total);
        System.out.println();

        myCars.futureCar();
        System.out.print("& A Bugatti My Guy!!!");
        System.out.println();
        System.out.println();

        Cars.yearsToGet(); // Because using static you have to use the class Cars
        System.out.println();
        System.out.println();

    }
}
