package badCode.i;

public class Car implements Acceleratable, Stopable, Refuelable, Brakable {
    @Override
    public void start() {
        // запустить автомобиль
    }

    @Override
    public void stop() {
        // остановить автомобиль
    }

    @Override
    public void accelerate() {
        // ускорить автомобиль
    }

    @Override
    public void brake() {
        // замедлить автомобиль
    }

    @Override
    public void refuel() {
        // заправить автомобиль
    }
}