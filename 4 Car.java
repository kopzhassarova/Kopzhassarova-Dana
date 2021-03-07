class Car {
}

class Manual {
}

interface Builder {
    void reset();

    void setSeats();

    void setEngine();

    void setGPS();
}

class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        this.reset();
    }

    @Override
    public void setSeats() {
    }

    @Override
    public void setEngine() {
    }

    @Override
    public void setGPS() {
    }

    Car getProduct() {
        Car res = this.car;
        this.reset();
        return car;
    }
}

class CarManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        this.reset();
    }

    @Override
    public void setSeats() {
    }

    @Override
    public void setEngine() {
    }

    @Override
    public void setGPS() {
    }

    Manual getProduct() {
        Manual res = this.manual;
        this.reset();
        return res;
    }
}
//isn't necessary, but can be reused.

class Director {
    private Builder builder;

    void setBuilder(Builder builder) {
        this.builder = builder;
    }

    void constructSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(new SUVEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car car = carBuilder.getProduct();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportCar(carManualBuilder);
        Manual carManual = carManualBuilder.getProduct();
    }
}