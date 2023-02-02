public class Main {
    public static void main(String[] args) {

        manufactureCar(4, 3);
        manufactureCar(8, 3);
        manufactureCar(9, 3);
        manufactureCar(10, 3);

    }

    public static void manufactureCar(int speed, int hours){
        int totalCars = 221 * speed * hours;
        int passedInspection;
        int failedInspection = 0;

        if(speed > 0 && speed < 11){
            if (speed < 5){
                passedInspection = totalCars;
            } else if (speed < 9){
                passedInspection = (totalCars * 90) / 100;
                failedInspection = totalCars - passedInspection;
            } else if (speed == 9){
                passedInspection = (totalCars * 80) / 100;
                failedInspection = totalCars - passedInspection;
            } else {
                passedInspection = (totalCars * 60) / 100;
                failedInspection = totalCars - passedInspection;
            }
            printManufactureDetails(speed, totalCars, passedInspection, failedInspection);
        } else {
            System.out.println("Speed " + speed + " is not valid!");
        }
    }

    public static void printManufactureDetails(int speed, int totalCars, int successfullyManufactured, int failedCars){
        System.out.println("Car manufacture details with speed: " + speed);
        System.out.println("Total cars: " + totalCars);
        System.out.println("Passed inspection: " + successfullyManufactured);
        System.out.println("Failed inspection: " + failedCars);
        System.out.println();
    }
}