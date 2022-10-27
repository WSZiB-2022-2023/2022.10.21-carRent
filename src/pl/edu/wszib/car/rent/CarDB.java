package pl.edu.wszib.car.rent;

public class CarDB {
    private final Car[] cars = new Car[5];

    public CarDB() {
        this.cars[0] = new Car("Audi", "A5",
                2015, 400.00, "KR11");
        this.cars[1] = new Car("BMW", "5",
                2016, 450.00, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla",
                2018, 350.00, "KR33");
        this.cars[3] = new Car("Kia", "Ceed",
                2014, 200.00, "KR44");
        this.cars[4] = new Car("Mercedes", "E",
                2017, 480.00, "KR55");
    }

    public Car[] getCars() {
        return cars;
    }

    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && !car.isRent()) {
                car.setRent(true);
                return true;
            }
        }
        return false;
    }
}
