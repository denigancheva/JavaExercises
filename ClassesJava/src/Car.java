public class Car
{
    private String brand;
    private String model;
    private String color;
    private int horsepower;
    private String engineType;
    private String transmissionType;
    private int productionYear;

    public Car() {}

    public Car(String brand, String model, String color,
               int horsepower, String engineType,
               String transmissionType, int productionYear)
    {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.engineType = engineType;
        this.transmissionType = transmissionType;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Car[] getCarsByLetter(Car[] cars, char letter)
    {
        int n = 0;
        for (Car car : cars)
        {
            if (car.getBrand().charAt(0) == letter)
            {
                n++;

            }
        }
        Car[] sorted = new Car[n];
        int i = 0;
        for (Car car : cars)
        {
            if (car.getBrand().charAt(0) == letter)
            {
                sorted[i] = car;
                i++;

            }
        }
        return sorted;

    }

    public static Car[] SortByBrand(Car[] cars, char index)
    {
        Car[] sortedCars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            sortedCars[i] = cars[i];
        }
        if (index == 'p') {
            for (int i = 0; i < sortedCars.length - 1; i++) {
                for (int j = i + 1; j < sortedCars.length; j++) {
                    if (sortedCars[i].getBrand()
                            .compareTo(sortedCars[j].getBrand()) > 0) {

                        Car temp = sortedCars[i];
                        sortedCars[i] = sortedCars[j];
                        sortedCars[j] = temp;
                    }
                }
            }
        } else if (index == 'n') {
            for (int i = 0; i < sortedCars.length - 1; i++) {
                for (int j = i + 1; j < sortedCars.length; j++) {
                    if (sortedCars[i].getBrand()
                            .compareTo(sortedCars[j].getBrand()) < 0) {

                        Car temp = sortedCars[i];
                        sortedCars[i] = sortedCars[j];
                        sortedCars[j] = temp;
                    }
                }
            }
        }

        return sortedCars;
    }

    public static Car[] removeDuplicates(Car[] cars) {
        Car[] result = new Car[cars.length];
        int count = 0;

        for (int i = 0; i < cars.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (cars[i].getBrand().equals(result[j].getBrand())
                        && cars[i].getModel().equals(result[j].getModel())
                        && cars[i].getColor().equals(result[j].getColor())
                        && cars[i].getHorsepower() == result[j].getHorsepower()
                        && cars[i].getEngineType().equals(result[j].getEngineType())
                        && cars[i].getTransmissionType().equals(result[j].getTransmissionType())
                        && cars[i].getProductionYear() == result[j].getProductionYear()) {

                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result[count] = cars[i];
                count++;
            }
        }

        Car[] cleanCars = new Car[count];

        for (int i = 0; i < count; i++) {
            cleanCars[i] = result[i];
        }

        return cleanCars;

    }


}


