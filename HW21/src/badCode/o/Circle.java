package badCode.o;

public class Circle implements Shape{

    private String type;
    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}