public class Car {
    String model;
    String brand;
    String engine;
    String color;
    int year;
    public Car(String model, String brand, String color, int year, String engine) {
        this.model=model;
        this.brand=brand;
        this.engine=engine;
        this.color=color;
        this.year=year;
    }


    public Car(String model, String brand) {
        this.model=model;
        this.brand=brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(String model, String brand, String engine, String color, int year) {
        this.model = model;
        this.brand = brand;
        this.engine = engine;
        this.color = color;
        this.year = year;
    }

}
