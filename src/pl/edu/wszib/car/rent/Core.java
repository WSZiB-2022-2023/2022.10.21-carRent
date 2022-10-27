package pl.edu.wszib.car.rent;

public class Core {
    public static void start() {
        final CarDB carDB = new CarDB();

        boolean isRunning = true;
        while(isRunning) {
            switch(GUI.showMenu()) {
                case "1":
                    GUI.listCars(carDB.getCars());
                    break;
                case "2":
                    GUI.showRentResult(carDB.rentCar(GUI.readPlate()));
                    break;
                case "3":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Wrong choose !!");
                    break;
            }
        }
    }
}
