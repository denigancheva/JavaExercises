public class TestCars {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("BMW", "320d", "Black", 190,
                        "Diesel", "Automatic", 2022),

                new Car("Audi", "A4", "White", 150,
                        "Petrol", "Manual", 2020),

                new Car("BMW", "320d", "Black", 190,
                        "Diesel", "Automatic", 2022),

                new Car("Mercedes", "C200", "Gray", 184,
                        "Petrol", "Automatic", 2021),

                new Car("Audi", "A4", "White", 150,
                        "Petrol", "Manual", 2020),

                new Car("BMW", "320d", "Red", 190,
                        "Diesel", "Automatic", 2022)
        };
        System.out.println("Original cars:");

        for (Car car : cars) {
            System.out.println(
                    car.getBrand() + " " +
                            car.getModel() + " " +
                            car.getColor() + " " +
                            car.getHorsepower() + " " +
                            car.getEngineType() + " " +
                            car.getTransmissionType() + " " +
                            car.getProductionYear()
            );
        }

//        Car[] cleanCars = Car.removeDuplicates(cars);
//
//        System.out.println("Cars after removing duplicates:");
//
//        for (Car car : cleanCars) {
//            System.out.println(
//                    car.getBrand() + " " +
//                            car.getModel() + " " +
//                            car.getColor() + " " +
//                            car.getHorsepower() + " " +
//                            car.getEngineType() + " " +
//                            car.getTransmissionType() + " " +
//                            car.getProductionYear()
//            );
//        }

        Car[] sortedCars = Car.SortByBrand(cars, 'n');

        System.out.println("Cars after sorting by brand:");

        for (Car car : sortedCars) {
            System.out.println(
                    car.getBrand() + " " +
                            car.getModel() + " " +
                            car.getColor() + " " +
                            car.getHorsepower() + " " +
                            car.getEngineType() + " " +
                            car.getTransmissionType() + " " +
                            car.getProductionYear()
            );
        }

    }
}
