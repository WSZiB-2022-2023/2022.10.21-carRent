package pl.edu.wszib.car.rent;

import java.util.Scanner;

public class GUI {
    private static final Scanner scanner = new Scanner(System.in);

    public static String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return scanner.nextLine();
    }

    public static void listCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(
                    car.getBrand() + " " + car.getModel() + " " +
                            car.getYear() + " " + car.getPrice() + " " +
                            car.getPlate() + " " + car.isRent());
        }
    }

    public static String readPlate() {
        System.out.println("Plate:");
        return scanner.nextLine();
    }

    public static void showRentResult(boolean result) {
        if(result) {
            System.out.println("Rent successful");
        } else {
            System.out.println("Plate does not exist or car is already rent");
        }
    }
}
